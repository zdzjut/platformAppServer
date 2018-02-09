package com.boot.druid.model.businessSupplier;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "business_supplier")
public class BusinessSupplier {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 客户编号
     */
    @Column(name = "client_id")
    private Integer clientId;

    /**
     * 供应商名称
     */
    @Column(name = "supplier_name")
    private String supplierName;

    /**
     * 供应商法人
     */
    private String representative;

    /**
     * 供应商邮箱
     */
    @Column(name = "supplier_email")
    private String supplierEmail;

    /**
     * 供应商地址_省
     */
    @Column(name = "supplier_province")
    private Integer supplierProvince;

    /**
     * 供应商地址_市
     */
    @Column(name = "supplier_city")
    private Integer supplierCity;

    /**
     * 供应商地址_区
     */
    @Column(name = "supplier_county")
    private Integer supplierCounty;

    /**
     * 供应商详细地址
     */
    @Column(name = "supplier_full_address")
    private String supplierFullAddress;

    /**
     * 供应商成立时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Column(name = "supplier_found_date")
    private Date supplierFoundDate;

    /**
     * 供应商注册资本
     */
    @Column(name = "register_capital")
    private String registerCapital;

    @Column(name = "contact_people")
    private String contactPeople;

    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 税务号
     */
    @Column(name = "tax_code")
    private String taxCode;

    /**
     * 是否五证合一标识符
     */
    @Column(name = "is_merged")
    private Integer isMerged;

    /**
     * 供应商社会统一信用代码/工商营业执照号
     */
    @Column(name = "social_credit_code")
    private String socialCreditCode;

    /**
     * 供应商社会统一信用代码/工商营业执照号图片id
     */
    @Column(name = "social_credit_image")
    private String socialCreditImage;

    /**
     * 供应商法人身份证号
     */
    @Column(name = "id_card_no")
    private String idCardNo;

    @Column(name = "id_card_a_image")
    private String idCardAImage;

    @Column(name = "id_card_b_image")
    private String idCardBImage;

    /**
     * 纳税人识别号
     */
    @Column(name = "tax_registration_code")
    private String taxRegistrationCode;

    @Column(name = "tax_registration_image")
    private String taxRegistrationImage;

    @Column(name = "business_license_code")
    private String businessLicenseCode;
    //强迫症都犯了
    @Column(name = "business_license_iamge")
    private String businessLicenseIamge;

    @Column(name = "organization_image")
    private String organizationImage;

    @Column(name = "general_taxpayer_image")
    private String generalTaxpayerImage;

    @Column(name = "tax_invoice_image")
    private String taxInvoiceImage;

    /**
     * 审核状态：数据字典通用审核状态
     */
    @Column(name = "audit_status")
    private Integer auditStatus;

    @Column(name = "wf_status")
    private Integer wfStatus;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 数据字典
     */
    @Column(name = "delete_flag")
    private Integer deleteFlag;

    /**
     * 创建人
     */
    private Integer creator;

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

    @Column(name = "updator_type")
    private Integer updatorType;

    /**
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "if_using")
    private Integer ifUsing;

    /**
     * 是否线下下单过
     */
    @Column(name = "if_offline_used")
    private Integer ifOfflineUsed;

    /**
     * 是否敏感区域：是否
     */
    @Column(name = "sensitive_region")
    private Integer sensitiveRegion;

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
     * 获取客户编号
     *
     * @return client_id - 客户编号
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * 设置客户编号
     *
     * @param clientId 客户编号
     */
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取供应商名称
     *
     * @return supplier_name - 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置供应商名称
     *
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * 获取供应商法人
     *
     * @return representative - 供应商法人
     */
    public String getRepresentative() {
        return representative;
    }

    /**
     * 设置供应商法人
     *
     * @param representative 供应商法人
     */
    public void setRepresentative(String representative) {
        this.representative = representative == null ? null : representative.trim();
    }

    /**
     * 获取供应商邮箱
     *
     * @return supplier_email - 供应商邮箱
     */
    public String getSupplierEmail() {
        return supplierEmail;
    }

    /**
     * 设置供应商邮箱
     *
     * @param supplierEmail 供应商邮箱
     */
    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    /**
     * 获取供应商地址_省
     *
     * @return supplier_province - 供应商地址_省
     */
    public Integer getSupplierProvince() {
        return supplierProvince;
    }

    /**
     * 设置供应商地址_省
     *
     * @param supplierProvince 供应商地址_省
     */
    public void setSupplierProvince(Integer supplierProvince) {
        this.supplierProvince = supplierProvince;
    }

    /**
     * 获取供应商地址_市
     *
     * @return supplier_city - 供应商地址_市
     */
    public Integer getSupplierCity() {
        return supplierCity;
    }

    /**
     * 设置供应商地址_市
     *
     * @param supplierCity 供应商地址_市
     */
    public void setSupplierCity(Integer supplierCity) {
        this.supplierCity = supplierCity;
    }

    /**
     * 获取供应商地址_区
     *
     * @return supplier_county - 供应商地址_区
     */
    public Integer getSupplierCounty() {
        return supplierCounty;
    }

    /**
     * 设置供应商地址_区
     *
     * @param supplierCounty 供应商地址_区
     */
    public void setSupplierCounty(Integer supplierCounty) {
        this.supplierCounty = supplierCounty;
    }

    /**
     * 获取供应商详细地址
     *
     * @return supplier_full_address - 供应商详细地址
     */
    public String getSupplierFullAddress() {
        return supplierFullAddress;
    }

    /**
     * 设置供应商详细地址
     *
     * @param supplierFullAddress 供应商详细地址
     */
    public void setSupplierFullAddress(String supplierFullAddress) {
        this.supplierFullAddress = supplierFullAddress == null ? null : supplierFullAddress.trim();
    }

    /**
     * 获取供应商成立时间
     *
     * @return supplier_found_date - 供应商成立时间
     */
    public Date getSupplierFoundDate() {
        return supplierFoundDate;
    }

    /**
     * 设置供应商成立时间
     *
     * @param supplierFoundDate 供应商成立时间
     */
    public void setSupplierFoundDate(Date supplierFoundDate) {
        this.supplierFoundDate = supplierFoundDate;
    }

    /**
     * 获取供应商注册资本
     *
     * @return register_capital - 供应商注册资本
     */
    public String getRegisterCapital() {
        return registerCapital;
    }

    /**
     * 设置供应商注册资本
     *
     * @param registerCapital 供应商注册资本
     */
    public void setRegisterCapital(String registerCapital) {
        this.registerCapital = registerCapital == null ? null : registerCapital.trim();
    }

    /**
     * @return contact_people
     */
    public String getContactPeople() {
        return contactPeople;
    }

    /**
     * @param contactPeople
     */
    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople == null ? null : contactPeople.trim();
    }

    /**
     * @return contact_phone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 获取税务号
     *
     * @return tax_code - 税务号
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * 设置税务号
     *
     * @param taxCode 税务号
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode == null ? null : taxCode.trim();
    }

    /**
     * 获取是否五证合一标识符
     *
     * @return is_merged - 是否五证合一标识符
     */
    public Integer getIsMerged() {
        return isMerged;
    }

    /**
     * 设置是否五证合一标识符
     *
     * @param isMerged 是否五证合一标识符
     */
    public void setIsMerged(Integer isMerged) {
        this.isMerged = isMerged;
    }

    /**
     * 获取供应商社会统一信用代码/工商营业执照号
     *
     * @return social_credit_code - 供应商社会统一信用代码/工商营业执照号
     */
    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    /**
     * 设置供应商社会统一信用代码/工商营业执照号
     *
     * @param socialCreditCode 供应商社会统一信用代码/工商营业执照号
     */
    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode == null ? null : socialCreditCode.trim();
    }

    /**
     * 获取供应商社会统一信用代码/工商营业执照号图片id
     *
     * @return social_credit_image - 供应商社会统一信用代码/工商营业执照号图片id
     */
    public String getSocialCreditImage() {
        return socialCreditImage;
    }

    /**
     * 设置供应商社会统一信用代码/工商营业执照号图片id
     *
     * @param socialCreditImage 供应商社会统一信用代码/工商营业执照号图片id
     */
    public void setSocialCreditImage(String socialCreditImage) {
        this.socialCreditImage = socialCreditImage == null ? null : socialCreditImage.trim();
    }

    /**
     * 获取供应商法人身份证号
     *
     * @return id_card_no - 供应商法人身份证号
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * 设置供应商法人身份证号
     *
     * @param idCardNo 供应商法人身份证号
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    /**
     * @return id_card_a_image
     */
    public String getIdCardAImage() {
        return idCardAImage;
    }

    /**
     * @param idCardAImage
     */
    public void setIdCardAImage(String idCardAImage) {
        this.idCardAImage = idCardAImage == null ? null : idCardAImage.trim();
    }

    /**
     * @return id_card_b_image
     */
    public String getIdCardBImage() {
        return idCardBImage;
    }

    /**
     * @param idCardBImage
     */
    public void setIdCardBImage(String idCardBImage) {
        this.idCardBImage = idCardBImage == null ? null : idCardBImage.trim();
    }

    /**
     * 获取纳税人识别号
     *
     * @return tax_registration_code - 纳税人识别号
     */
    public String getTaxRegistrationCode() {
        return taxRegistrationCode;
    }

    /**
     * 设置纳税人识别号
     *
     * @param taxRegistrationCode 纳税人识别号
     */
    public void setTaxRegistrationCode(String taxRegistrationCode) {
        this.taxRegistrationCode = taxRegistrationCode == null ? null : taxRegistrationCode.trim();
    }

    /**
     * @return tax_registration_image
     */
    public String getTaxRegistrationImage() {
        return taxRegistrationImage;
    }

    /**
     * @param taxRegistrationImage
     */
    public void setTaxRegistrationImage(String taxRegistrationImage) {
        this.taxRegistrationImage = taxRegistrationImage == null ? null : taxRegistrationImage.trim();
    }

    /**
     * @return business_license_code
     */
    public String getBusinessLicenseCode() {
        return businessLicenseCode;
    }

    /**
     * @param businessLicenseCode
     */
    public void setBusinessLicenseCode(String businessLicenseCode) {
        this.businessLicenseCode = businessLicenseCode == null ? null : businessLicenseCode.trim();
    }

    /**
     * @return business_license_iamge
     */
    public String getBusinessLicenseIamge() {
        return businessLicenseIamge;
    }

    /**
     * @param businessLicenseIamge
     */
    public void setBusinessLicenseIamge(String businessLicenseIamge) {
        this.businessLicenseIamge = businessLicenseIamge == null ? null : businessLicenseIamge.trim();
    }

    /**
     * @return organization_image
     */
    public String getOrganizationImage() {
        return organizationImage;
    }

    /**
     * @param organizationImage
     */
    public void setOrganizationImage(String organizationImage) {
        this.organizationImage = organizationImage == null ? null : organizationImage.trim();
    }

    /**
     * @return general_taxpayer_image
     */
    public String getGeneralTaxpayerImage() {
        return generalTaxpayerImage;
    }

    /**
     * @param generalTaxpayerImage
     */
    public void setGeneralTaxpayerImage(String generalTaxpayerImage) {
        this.generalTaxpayerImage = generalTaxpayerImage == null ? null : generalTaxpayerImage.trim();
    }

    /**
     * @return tax_invoice_image
     */
    public String getTaxInvoiceImage() {
        return taxInvoiceImage;
    }

    /**
     * @param taxInvoiceImage
     */
    public void setTaxInvoiceImage(String taxInvoiceImage) {
        this.taxInvoiceImage = taxInvoiceImage == null ? null : taxInvoiceImage.trim();
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
     * @return creator_type
     */
    public Integer getCreatorType() {
        return creatorType;
    }

    /**
     * @param creatorType
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
     * @return updator_type
     */
    public Integer getUpdatorType() {
        return updatorType;
    }

    /**
     * @param updatorType
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

    /**
     * @return if_using
     */
    public Integer getIfUsing() {
        return ifUsing;
    }

    /**
     * @param ifUsing
     */
    public void setIfUsing(Integer ifUsing) {
        this.ifUsing = ifUsing;
    }

    /**
     * 获取是否线下下单过
     *
     * @return if_offline_used - 是否线下下单过
     */
    public Integer getIfOfflineUsed() {
        return ifOfflineUsed;
    }

    /**
     * 设置是否线下下单过
     *
     * @param ifOfflineUsed 是否线下下单过
     */
    public void setIfOfflineUsed(Integer ifOfflineUsed) {
        this.ifOfflineUsed = ifOfflineUsed;
    }

    /**
     * 获取是否敏感区域：是否
     *
     * @return sensitive_region - 是否敏感区域：是否
     */
    public Integer getSensitiveRegion() {
        return sensitiveRegion;
    }

    /**
     * 设置是否敏感区域：是否
     *
     * @param sensitiveRegion 是否敏感区域：是否
     */
    public void setSensitiveRegion(Integer sensitiveRegion) {
        this.sensitiveRegion = sensitiveRegion;
    }
}