package com.boot.druid.model.sysAttachment;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_attachment")
public class SysAttachment {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 上传前真实名称
     */
    @Column(name = "before_upload_name")
    private String beforeUploadName;

    /**
     * 上传后真实名称
     */
    @Column(name = "after_upload_name")
    private String afterUploadName;

    /**
     * 文件类型
     */
    @Column(name = "doc_type")
    private String docType;

    /**
     * 文件大小
     */
    @Column(name = "doc_size")
    private Long docSize;

    /**
     * 保存路径
     */
    private String path;

    /**
     * 数据字典
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    private Integer creator;

    @Column(name = "create_date")
    private Date createDate;

    private Integer updator;

    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 业务模块
     */
    @Column(name = "business_type")
    private String businessType;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取上传前真实名称
     *
     * @return before_upload_name - 上传前真实名称
     */
    public String getBeforeUploadName() {
        return beforeUploadName;
    }

    /**
     * 设置上传前真实名称
     *
     * @param beforeUploadName 上传前真实名称
     */
    public void setBeforeUploadName(String beforeUploadName) {
        this.beforeUploadName = beforeUploadName == null ? null : beforeUploadName.trim();
    }

    /**
     * 获取上传前真实名称
     *
     * @return after_upload_name - 上传前真实名称
     */
    public String getAfterUploadName() {
        return afterUploadName;
    }

    /**
     * 设置上传前真实名称
     *
     * @param afterUploadName 上传前真实名称
     */
    public void setAfterUploadName(String afterUploadName) {
        this.afterUploadName = afterUploadName == null ? null : afterUploadName.trim();
    }

    /**
     * 获取文件类型
     *
     * @return doc_type - 文件类型
     */
    public String getDocType() {
        return docType;
    }

    /**
     * 设置文件类型
     *
     * @param docType 文件类型
     */
    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
    }

    /**
     * 获取文件大小
     *
     * @return doc_size - 文件大小
     */
    public Long getDocSize() {
        return docSize;
    }

    /**
     * 设置文件大小
     *
     * @param docSize 文件大小
     */
    public void setDocSize(Long docSize) {
        this.docSize = docSize;
    }

    /**
     * 获取保存路径
     *
     * @return path - 保存路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置保存路径
     *
     * @param path 保存路径
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * 获取数据字典
     *
     * @return delete_flag - 数据字典
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置数据字典
     *
     * @param deleteFlag 数据字典
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * @return creator
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return updator
     */
    public Integer getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取业务模块
     *
     * @return business_type - 业务模块
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务模块
     *
     * @param businessType 业务模块
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }
}