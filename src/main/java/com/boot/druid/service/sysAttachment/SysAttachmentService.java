package com.boot.druid.service.sysAttachment;

import com.boot.druid.mapper.sysAttachment.SysAttachmentMapper;
import com.boot.druid.model.sysAttachment.SysAttachment;
import com.boot.druid.service.SysSequenceService;
import com.boot.druid.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class SysAttachmentService {

    @Resource
    private SysAttachmentMapper sysAttachmentMapper;
    @Resource
    private SysSequenceService sysSequenceService;
    @Value("${upload.picturePath}")
    private String picturePath;

    public String createSysAttachment(MultipartFile file) throws IOException {
        // 判断文件是否为空
        Result result = sysSequenceService.getCurrentNo("sys_attachment");
        if (!"success".equals(result.getResult())) {
            return null;
        }
        Integer id = (int) result.getData();
        String serverName = id + ".jpeg";
        String pathAndPictureName = picturePath + "/" + serverName;
        //数据库存关联数据
        SysAttachment sysAttachment = getSysAttachment(id, file, serverName);
        file.transferTo(new File(pathAndPictureName));
        sysAttachmentMapper.insert(sysAttachment);
        return serverName;

    }

    public SysAttachment getSysAttachment(Integer id, MultipartFile file, String serverName) {
        //数据库存关联数据
        SysAttachment sysAttachment = new SysAttachment();
        sysAttachment.setId(id);
        sysAttachment.setBeforeUploadName(file.getOriginalFilename());//原始名称
        sysAttachment.setDocType(file.getContentType());
        sysAttachment.setDocSize(file.getSize());
        sysAttachment.setAfterUploadName(serverName);
        sysAttachment.setDeleteFlag(0);
        sysAttachment.setBusinessType("businessCommodityInfo");
        sysAttachment.setCreateDate(new Date());
        return sysAttachment;
    }
}
