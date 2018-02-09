package com.boot.druid.model.businessConsigneeInfo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "business_consignee_info")
public class BusinessConsigneeInfo {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 客户编号(bus_registered_information.id)
     */
    @Column(name = "client_id")
    private Integer clientId;

    /**
     * 公司类型:企业/个人
     */
    @Column(name = "firm_type")
    private Integer firmType;

    /**
     * 收货人名称
     */
    @Column(name = "consignee_name")
    private String consigneeName;

    /**
     * 收货人的唯一标识
     */
    @Column(name = "consignee_id")
    private Integer consigneeId;

    /**
     * 注册登记号/税号图片
     */
    @Column(name = "consignee_img")
    private String consigneeImg;

    /**
     * 注册登记号/税号
     */
    @Column(name = "register_no")
    private String registerNo;

    /**
     * email
     */
    @Column(name = "consignee_email")
    private String consigneeEmail;

    /**
     * 国别
     */
    @Column(name = "consignee_country")
    private Integer consigneeCountry;

    /**
     * 城市
     */
    @Column(name = "consignee_city")
    private String consigneeCity;

    /**
     * 地址
     */
    @Column(name = "consignee_address")
    private String consigneeAddress;

    /**
     * 联系人
     */
    @Column(name = "consignee_people")
    private String consigneePeople;

    /**
     * 联系电话
     */
    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 客户等级（字符串）
     */
    private String grade;

    /**
     * 审核状态：数据字典通用审核状态
     */
    @Column(name = "audit_status")
    private Integer auditStatus;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否做资信调查
     */
    @Column(name = "if_credit_survey")
    private Integer ifCreditSurvey;

    /**
     * 融资类型
     */
    @Column(name = "financing_type")
    private Integer financingType;

    /**
     * 收货人银行子账号
     */
    @Column(name = "sub_gm_usd_bank_account")
    private String subGmUsdBankAccount;

    /**
     * 买家代码申请过 1:未申请,5：请求申请,8:已经申请
     */
    @Column(name = "zxb_send_mark")
    private String zxbSendMark;

    /**
     * 是否是华人 1：是，0：不是
     */
    @Column(name = "is_chinese")
    private String isChinese;

    @Column(name = "zxb_reject_reason")
    private String zxbRejectReason;

    @Column(name = "zxb_send_remark")
    private String zxbSendRemark;

    @Column(name = "wf_status")
    private Integer wfStatus;

    /**
     * 数据字典
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * 创建人
     */
    private Integer creator;

    /**
     * 创建人类型
     */
    @Column(name = "creator_type")
    private Integer creatorType;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改人
     */
    private Integer updator;

    /**
     * 修改人类型
     */
    @Column(name = "updator_type")
    private Integer updatorType;

    /**
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

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
     * 获取客户编号(bus_registered_information.id)
     *
     * @return client_id - 客户编号(bus_registered_information.id)
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * 设置客户编号(bus_registered_information.id)
     *
     * @param clientId 客户编号(bus_registered_information.id)
     */
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取公司类型:企业/个人
     *
     * @return firm_type - 公司类型:企业/个人
     */
    public Integer getFirmType() {
        return firmType;
    }

    /**
     * 设置公司类型:企业/个人
     *
     * @param firmType 公司类型:企业/个人
     */
    public void setFirmType(Integer firmType) {
        this.firmType = firmType;
    }

    /**
     * 获取收货人名称
     *
     * @return consignee_name - 收货人名称
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * 设置收货人名称
     *
     * @param consigneeName 收货人名称
     */
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    /**
     * 获取收货人的唯一标识
     *
     * @return consignee_id - 收货人的唯一标识
     */
    public Integer getConsigneeId() {
        return consigneeId;
    }

    /**
     * 设置收货人的唯一标识
     *
     * @param consigneeId 收货人的唯一标识
     */
    public void setConsigneeId(Integer consigneeId) {
        this.consigneeId = consigneeId;
    }

    /**
     * 获取注册登记号/税号图片
     *
     * @return consignee_img - 注册登记号/税号图片
     */
    public String getConsigneeImg() {
        return consigneeImg;
    }

    /**
     * 设置注册登记号/税号图片
     *
     * @param consigneeImg 注册登记号/税号图片
     */
    public void setConsigneeImg(String consigneeImg) {
        this.consigneeImg = consigneeImg == null ? null : consigneeImg.trim();
    }

    /**
     * 获取注册登记号/税号
     *
     * @return register_no - 注册登记号/税号
     */
    public String getRegisterNo() {
        return registerNo;
    }

    /**
     * 设置注册登记号/税号
     *
     * @param registerNo 注册登记号/税号
     */
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo == null ? null : registerNo.trim();
    }

    /**
     * 获取email
     *
     * @return consignee_email - email
     */
    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    /**
     * 设置email
     *
     * @param consigneeEmail email
     */
    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail == null ? null : consigneeEmail.trim();
    }

    /**
     * 获取国别
     *
     * @return consignee_country - 国别
     */
    public Integer getConsigneeCountry() {
        return consigneeCountry;
    }

    /**
     * 设置国别
     *
     * @param consigneeCountry 国别
     */
    public void setConsigneeCountry(Integer consigneeCountry) {
        this.consigneeCountry = consigneeCountry;
    }

    /**
     * 获取城市
     *
     * @return consignee_city - 城市
     */
    public String getConsigneeCity() {
        return consigneeCity;
    }

    /**
     * 设置城市
     *
     * @param consigneeCity 城市
     */
    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity == null ? null : consigneeCity.trim();
    }

    /**
     * 获取地址
     *
     * @return consignee_address - 地址
     */
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * 设置地址
     *
     * @param consigneeAddress 地址
     */
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    /**
     * 获取联系人
     *
     * @return consignee_people - 联系人
     */
    public String getConsigneePeople() {
        return consigneePeople;
    }

    /**
     * 设置联系人
     *
     * @param consigneePeople 联系人
     */
    public void setConsigneePeople(String consigneePeople) {
        this.consigneePeople = consigneePeople == null ? null : consigneePeople.trim();
    }

    /**
     * 获取联系电话
     *
     * @return contact_phone - 联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系电话
     *
     * @param contactPhone 联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 获取客户等级（字符串）
     *
     * @return grade - 客户等级（字符串）
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置客户等级（字符串）
     *
     * @param grade 客户等级（字符串）
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * 获取审核状态：数据字典通用审核状态
     *
     * @return audit_status - 审核状态：数据字典通用审核状态
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态：数据字典通用审核状态
     *
     * @param auditStatus 审核状态：数据字典通用审核状态
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 获取是否做资信调查
     *
     * @return if_credit_survey - 是否做资信调查
     */
    public Integer getIfCreditSurvey() {
        return ifCreditSurvey;
    }

    /**
     * 设置是否做资信调查
     *
     * @param ifCreditSurvey 是否做资信调查
     */
    public void setIfCreditSurvey(Integer ifCreditSurvey) {
        this.ifCreditSurvey = ifCreditSurvey;
    }

    /**
     * 获取融资类型
     *
     * @return financing_type - 融资类型
     */
    public Integer getFinancingType() {
        return financingType;
    }

    /**
     * 设置融资类型
     *
     * @param financingType 融资类型
     */
    public void setFinancingType(Integer financingType) {
        this.financingType = financingType;
    }

    /**
     * 获取收货人银行子账号
     *
     * @return sub_gm_usd_bank_account - 收货人银行子账号
     */
    public String getSubGmUsdBankAccount() {
        return subGmUsdBankAccount;
    }

    /**
     * 设置收货人银行子账号
     *
     * @param subGmUsdBankAccount 收货人银行子账号
     */
    public void setSubGmUsdBankAccount(String subGmUsdBankAccount) {
        this.subGmUsdBankAccount = subGmUsdBankAccount == null ? null : subGmUsdBankAccount.trim();
    }

    /**
     * 获取买家代码申请过 1:未申请,5：请求申请,8:已经申请
     *
     * @return zxb_send_mark - 买家代码申请过 1:未申请,5：请求申请,8:已经申请
     */
    public String getZxbSendMark() {
        return zxbSendMark;
    }

    /**
     * 设置买家代码申请过 1:未申请,5：请求申请,8:已经申请
     *
     * @param zxbSendMark 买家代码申请过 1:未申请,5：请求申请,8:已经申请
     */
    public void setZxbSendMark(String zxbSendMark) {
        this.zxbSendMark = zxbSendMark == null ? null : zxbSendMark.trim();
    }

    /**
     * 获取是否是华人 1：是，0：不是
     *
     * @return is_chinese - 是否是华人 1：是，0：不是
     */
    public String getIsChinese() {
        return isChinese;
    }

    /**
     * 设置是否是华人 1：是，0：不是
     *
     * @param isChinese 是否是华人 1：是，0：不是
     */
    public void setIsChinese(String isChinese) {
        this.isChinese = isChinese == null ? null : isChinese.trim();
    }

    /**
     * @return zxb_reject_reason
     */
    public String getZxbRejectReason() {
        return zxbRejectReason;
    }

    /**
     * @param zxbRejectReason
     */
    public void setZxbRejectReason(String zxbRejectReason) {
        this.zxbRejectReason = zxbRejectReason == null ? null : zxbRejectReason.trim();
    }

    /**
     * @return zxb_send_remark
     */
    public String getZxbSendRemark() {
        return zxbSendRemark;
    }

    /**
     * @param zxbSendRemark
     */
    public void setZxbSendRemark(String zxbSendRemark) {
        this.zxbSendRemark = zxbSendRemark == null ? null : zxbSendRemark.trim();
    }

    /**
     * @return wf_status
     */
    public Integer getWfStatus() {
        return wfStatus;
    }

    /**
     * @param wfStatus
     */
    public void setWfStatus(Integer wfStatus) {
        this.wfStatus = wfStatus;
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
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 获取创建人类型
     *
     * @return creator_type - 创建人类型
     */
    public Integer getCreatorType() {
        return creatorType;
    }

    /**
     * 设置创建人类型
     *
     * @param creatorType 创建人类型
     */
    public void setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改人
     *
     * @return updator - 修改人
     */
    public Integer getUpdator() {
        return updator;
    }

    /**
     * 设置修改人
     *
     * @param updator 修改人
     */
    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    /**
     * 获取修改人类型
     *
     * @return updator_type - 修改人类型
     */
    public Integer getUpdatorType() {
        return updatorType;
    }

    /**
     * 设置修改人类型
     *
     * @param updatorType 修改人类型
     */
    public void setUpdatorType(Integer updatorType) {
        this.updatorType = updatorType;
    }

    /**
     * 获取修改时间
     *
     * @return update_date - 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改时间
     *
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}