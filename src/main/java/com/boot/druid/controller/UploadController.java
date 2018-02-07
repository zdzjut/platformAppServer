package com.boot.druid.controller;


import com.boot.druid.service.uploadPicture.UploadPictureService;
import com.boot.druid.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;

@RequestMapping("/app")
@RestController
public class UploadController {
    @Resource
    private UploadPictureService uploadPictureService;

    /**
     * 保存图片
     */
    @RequestMapping(value = "/file")
    public Result file(HttpServletRequest req, String type, String tempId) {
        try {
            StandardMultipartHttpServletRequest request = (StandardMultipartHttpServletRequest) req;
            Iterator<String> fileNames = request.getFileNames();
            MultipartFile file = request.getFile(fileNames.next());

            return uploadPictureService.saveBusinessCommodityInfoFile(file, type, tempId);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    /**
     * 修改商品图片
     */
    @RequestMapping(value = "/modifyCommodityPicture")
    public Result modifyCommodityPicture(HttpServletRequest req, Integer commodityId, String type,Integer wfStatus) {
        try {
            StandardMultipartHttpServletRequest request = (StandardMultipartHttpServletRequest) req;
            Iterator<String> fileNames = request.getFileNames();
            MultipartFile file = request.getFile(fileNames.next());

            return uploadPictureService.updateBusinessCommodityInfoFile(file, commodityId, type,wfStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }
    /**
     * 修改商品图片
     */
    @RequestMapping(value = "/modifyConsigneePicture")
    public Result modifyConsigneePicture(HttpServletRequest req,Integer consigneeId) {
        try {
            StandardMultipartHttpServletRequest request = (StandardMultipartHttpServletRequest) req;
            Iterator<String> fileNames = request.getFileNames();
            MultipartFile file = request.getFile(fileNames.next());

            return uploadPictureService.updateBusinessConsigneeInfoFile(file, consigneeId);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }
    /**
     * 保存收货人证件图片
     */
    @RequestMapping(value = "/consigneeFile")
    public Result consigneeFile(HttpServletRequest req,String consigneeImg) {
        try {
            StandardMultipartHttpServletRequest request = (StandardMultipartHttpServletRequest) req;
            Iterator<String> fileNames = request.getFileNames();
            MultipartFile file = request.getFile(fileNames.next());

            return uploadPictureService.saveConsigneeFile(file,consigneeImg);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }
    /**
     * 保存供应商图片
     */
    @RequestMapping(value = "/supplierFile")
    public Result supplierFile(HttpServletRequest req,String type) {
        try {
            StandardMultipartHttpServletRequest request = (StandardMultipartHttpServletRequest) req;
            Iterator<String> fileNames = request.getFileNames();
            MultipartFile file = request.getFile(fileNames.next());

            return uploadPictureService.saveSupplierImgFile(file,type);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }
}
