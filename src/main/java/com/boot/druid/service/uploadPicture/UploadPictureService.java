package com.boot.druid.service.uploadPicture;

import com.boot.druid.mapper.businessCommodityInfo.BusinessCommodityInfoDtoForMongoRepository;
import com.boot.druid.mapper.businessCommodityInfo.BusinessCommodityInfoMapper;
import com.boot.druid.mapper.businessConsigneeInfo.BusinessConsigneeInfoMapper;
import com.boot.druid.mapper.businessSupplier.BusinessSupplierMapper;
import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfo;
import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfoDtoForMongo;
import com.boot.druid.model.businessConsigneeInfo.BusinessConsigneeInfo;
import com.boot.druid.model.businessSupplier.BusinessSupplier;
import com.boot.druid.service.sysAttachment.SysAttachmentService;
import com.boot.druid.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@Service
public class UploadPictureService {
    @Resource
    private SysAttachmentService sysAttachmentService;
    @Resource
    private BusinessCommodityInfoMapper businessCommodityInfoMapper;
    @Resource
    private BusinessConsigneeInfoMapper businessConsigneeInfoMapper;
    @Resource
    private BusinessSupplierMapper businessSupplierMapper;
    @Resource
    private BusinessCommodityInfoDtoForMongoRepository businessCommodityInfoDtoForMongoRepository;
    @Value("${upload.picturePath}")
    private String picturePath;


    /**
     * @param tempId DtoId
     */
    public Result saveBusinessCommodityInfoFile(MultipartFile file, String type, String tempId) {
        try {
            BusinessCommodityInfoDtoForMongo one = businessCommodityInfoDtoForMongoRepository.findOne(tempId);
            String pictureName = createPicture(file, Util.getPictureName(one, type));
            if ((one = Util.choose(one, type, pictureName)) != null) {
                businessCommodityInfoDtoForMongoRepository.save(one);
                return new Result("success", "成功");
            }
            return new Result("failure", "失败");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }


    /**
     * @param commodityId 商品Id
     * @param type        哪张图片
     *                    修改图片库的字段
     */
    public Result updateBusinessCommodityInfoFile(MultipartFile file, Integer commodityId, String type, Integer wfStatus) {
        try {
            BusinessCommodityInfo businessCommodityInfo = businessCommodityInfoMapper.selectByPrimaryKey(commodityId);
            businessCommodityInfo.setWfStatus(wfStatus);
            String pictureName = createPicture(file, Util.getPictureName(businessCommodityInfo, type));
            //关联到商品表
            BusinessCommodityInfo one = Util.choose(businessCommodityInfo, type, pictureName);
            businessCommodityInfoMapper.updateByPrimaryKeySelective(one);
            return new Result("success", "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    public Result updateBusinessConsigneeInfoFile(MultipartFile file, Integer consigneeId) {
        try {
            BusinessConsigneeInfo businessConsigneeInfo = businessConsigneeInfoMapper.selectByPrimaryKey(consigneeId);
            String consigneeImg = businessConsigneeInfo.getConsigneeImg();
            String pictureName = createPicture(file, consigneeImg);
            //若收货人的img为空
            if (consigneeImg == null) {
                businessConsigneeInfo.setConsigneeImg(pictureName);
                businessConsigneeInfoMapper.updateByPrimaryKeySelective(businessConsigneeInfo);
            }
            return new Result("success", "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    public Result saveConsigneeFile(MultipartFile file, String consigneePictureName) {
        try {
            String pictureName = createPicture(file, consigneePictureName);
            return new Result("success", "成功", pictureName);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    /**
     * @param type 哪张图片
     */
    public Result saveSupplierImgFile(MultipartFile file, String type) {
        try {
            String pictureName = createPicture(file, type);
            return new Result("success", "成功", pictureName);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    /**
     * 新增或替换图片,若ID不存在，新建一个图片，资源库新增
     * 若ID存在，替换文件
     */
    public String createPicture(MultipartFile file, String pictureName) throws IOException {
        //id.jpeg为空，资源库未关联
        if (pictureName == null) {
            return sysAttachmentService.createSysAttachment(file);
        }
        //id.jpeg存在，替换本地文件
        String pathAndPictureName = picturePath + "/" + pictureName;
        deletePicture(pathAndPictureName);
        file.transferTo(new File(pathAndPictureName));
        return pictureName;

    }

    /**
     * 删除图片
     */
    public boolean deletePicture(String pictureName) {
        File oldFile = new File(pictureName);
        return oldFile.exists() && !oldFile.delete();
    }



}
