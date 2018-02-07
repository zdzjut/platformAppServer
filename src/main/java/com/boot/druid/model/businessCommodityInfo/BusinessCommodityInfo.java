package com.boot.druid.model.businessCommodityInfo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "business_commodity_info")
public class BusinessCommodityInfo {
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
     * 商品名称
     */
    @Column(name = "commodity_name")
    private String commodityName;

    /**
     * 商品英文名称
     */
    @Column(name = "commodity_english_name")
    private String commodityEnglishName;

    /**
     * 材质
     */
    @Column(name = "commodity_material")
    private String commodityMaterial;

    /**
     * 品牌
     */
    @Column(name = "commodity_brand")
    private String commodityBrand;

    /**
     * 型号
     */
    @Column(name = "commodity_model")
    private String commodityModel;

    /**
     * 是否商检0是1否
     */
    @Column(name = "commodity_inspection")
    private Integer commodityInspection;

    /**
     * HSCode（海关编码）
     */
    @Column(name = "HSCode")
    private String hscode;

    /**
     * 增值税率(%)
     */
    @Column(name = "commodity_appreciation_tariff")
    private BigDecimal commodityAppreciationTariff;

    /**
     * 退税率(%)
     */
    @Column(name = "commodity_recede_tariff")
    private BigDecimal commodityRecedeTariff;

    /**
     * 用途
     */
    private String application;

    /**
     * 审核状态：数据字典通用审核状态
     */
    @Column(name = "audit_status")
    private Integer auditStatus;

    /**
     * 流水编号
     */
    @Column(name = "commodity_stream_id")
    private Integer commodityStreamId;

    /**
     * 产品整体图片
     */
    @Column(name = "commodity_img")
    private String commodityImg;

    /**
     * 内部图片
     */
    @Column(name = "commodity_inner_img")
    private String commodityInnerImg;

    /**
     * 品牌图片
     */
    @Column(name = "commodity_brand_img")
    private String commodityBrandImg;

    /**
     * 其它图片
     */
    @Column(name = "commodity_other_img")
    private String commodityOtherImg;

    @Column(name = "wf_status")
    private Integer wfStatus;

    /**
     * 备注
     */
    private String remarks;

    @Column(name = "declaration_items")
    private String declarationItems;

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

    /**
     * 启用状态
     */
    @Column(name = "state_flag")
    private Integer stateFlag;

    /**
     * 是否敏感商品
     */
    @Column(name = "sensitive_commodity")
    private Integer sensitiveCommodity;

    /**
     * 是否终审
     */
    @Column(name = "information_confirmation")
    private Integer informationConfirmation;

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
     * 获取商品名称
     *
     * @return commodity_name - 商品名称
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称
     *
     * @param commodityName 商品名称
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * 获取商品英文名称
     *
     * @return commodity_english_name - 商品英文名称
     */
    public String getCommodityEnglishName() {
        return commodityEnglishName;
    }

    /**
     * 设置商品英文名称
     *
     * @param commodityEnglishName 商品英文名称
     */
    public void setCommodityEnglishName(String commodityEnglishName) {
        this.commodityEnglishName = commodityEnglishName == null ? null : commodityEnglishName.trim();
    }

    /**
     * 获取材质
     *
     * @return commodity_material - 材质
     */
    public String getCommodityMaterial() {
        return commodityMaterial;
    }

    /**
     * 设置材质
     *
     * @param commodityMaterial 材质
     */
    public void setCommodityMaterial(String commodityMaterial) {
        this.commodityMaterial = commodityMaterial == null ? null : commodityMaterial.trim();
    }

    /**
     * 获取品牌
     *
     * @return commodity_brand - 品牌
     */
    public String getCommodityBrand() {
        return commodityBrand;
    }

    /**
     * 设置品牌
     *
     * @param commodityBrand 品牌
     */
    public void setCommodityBrand(String commodityBrand) {
        this.commodityBrand = commodityBrand == null ? null : commodityBrand.trim();
    }

    /**
     * 获取型号
     *
     * @return commodity_model - 型号
     */
    public String getCommodityModel() {
        return commodityModel;
    }

    /**
     * 设置型号
     *
     * @param commodityModel 型号
     */
    public void setCommodityModel(String commodityModel) {
        this.commodityModel = commodityModel == null ? null : commodityModel.trim();
    }

    /**
     * 获取是否商检0是1否
     *
     * @return commodity_inspection - 是否商检0是1否
     */
    public Integer getCommodityInspection() {
        return commodityInspection;
    }

    /**
     * 设置是否商检0是1否
     *
     * @param commodityInspection 是否商检0是1否
     */
    public void setCommodityInspection(Integer commodityInspection) {
        this.commodityInspection = commodityInspection;
    }

    /**
     * 获取HSCode（海关编码）
     *
     * @return HSCode - HSCode（海关编码）
     */
    public String getHscode() {
        return hscode;
    }

    /**
     * 设置HSCode（海关编码）
     *
     * @param hscode HSCode（海关编码）
     */
    public void setHscode(String hscode) {
        this.hscode = hscode == null ? null : hscode.trim();
    }

    /**
     * 获取增值税率(%)
     *
     * @return commodity_appreciation_tariff - 增值税率(%)
     */
    public BigDecimal getCommodityAppreciationTariff() {
        return commodityAppreciationTariff;
    }

    /**
     * 设置增值税率(%)
     *
     * @param commodityAppreciationTariff 增值税率(%)
     */
    public void setCommodityAppreciationTariff(BigDecimal commodityAppreciationTariff) {
        this.commodityAppreciationTariff = commodityAppreciationTariff;
    }

    /**
     * 获取退税率(%)
     *
     * @return commodity_recede_tariff - 退税率(%)
     */
    public BigDecimal getCommodityRecedeTariff() {
        return commodityRecedeTariff;
    }

    /**
     * 设置退税率(%)
     *
     * @param commodityRecedeTariff 退税率(%)
     */
    public void setCommodityRecedeTariff(BigDecimal commodityRecedeTariff) {
        this.commodityRecedeTariff = commodityRecedeTariff;
    }

    /**
     * 获取用途
     *
     * @return application - 用途
     */
    public String getApplication() {
        return application;
    }

    /**
     * 设置用途
     *
     * @param application 用途
     */
    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
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
     * 获取流水编号
     *
     * @return commodity_stream_id - 流水编号
     */
    public Integer getCommodityStreamId() {
        return commodityStreamId;
    }

    /**
     * 设置流水编号
     *
     * @param commodityStreamId 流水编号
     */
    public void setCommodityStreamId(Integer commodityStreamId) {
        this.commodityStreamId = commodityStreamId;
    }

    /**
     * 获取产品整体图片
     *
     * @return commodity_img - 产品整体图片
     */
    public String getCommodityImg() {
        return commodityImg;
    }

    /**
     * 设置产品整体图片
     *
     * @param commodityImg 产品整体图片
     */
    public void setCommodityImg(String commodityImg) {
        this.commodityImg = commodityImg == null ? null : commodityImg.trim();
    }

    /**
     * 获取内部图片
     *
     * @return commodity_inner_img - 内部图片
     */
    public String getCommodityInnerImg() {
        return commodityInnerImg;
    }

    /**
     * 设置内部图片
     *
     * @param commodityInnerImg 内部图片
     */
    public void setCommodityInnerImg(String commodityInnerImg) {
        this.commodityInnerImg = commodityInnerImg == null ? null : commodityInnerImg.trim();
    }

    /**
     * 获取品牌图片
     *
     * @return commodity_brand_img - 品牌图片
     */
    public String getCommodityBrandImg() {
        return commodityBrandImg;
    }

    /**
     * 设置品牌图片
     *
     * @param commodityBrandImg 品牌图片
     */
    public void setCommodityBrandImg(String commodityBrandImg) {
        this.commodityBrandImg = commodityBrandImg == null ? null : commodityBrandImg.trim();
    }

    /**
     * 获取其它图片
     *
     * @return commodity_other_img - 其它图片
     */
    public String getCommodityOtherImg() {
        return commodityOtherImg;
    }

    /**
     * 设置其它图片
     *
     * @param commodityOtherImg 其它图片
     */
    public void setCommodityOtherImg(String commodityOtherImg) {
        this.commodityOtherImg = commodityOtherImg == null ? null : commodityOtherImg.trim();
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
     * @return declaration_items
     */
    public String getDeclarationItems() {
        return declarationItems;
    }

    /**
     * @param declarationItems
     */
    public void setDeclarationItems(String declarationItems) {
        this.declarationItems = declarationItems == null ? null : declarationItems.trim();
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
     * 获取启用状态
     *
     * @return state_flag - 启用状态
     */
    public Integer getStateFlag() {
        return stateFlag;
    }

    /**
     * 设置启用状态
     *
     * @param stateFlag 启用状态
     */
    public void setStateFlag(Integer stateFlag) {
        this.stateFlag = stateFlag;
    }

    /**
     * 获取是否敏感商品
     *
     * @return sensitive_commodity - 是否敏感商品
     */
    public Integer getSensitiveCommodity() {
        return sensitiveCommodity;
    }

    /**
     * 设置是否敏感商品
     *
     * @param sensitiveCommodity 是否敏感商品
     */
    public void setSensitiveCommodity(Integer sensitiveCommodity) {
        this.sensitiveCommodity = sensitiveCommodity;
    }

    /**
     * 获取是否终审
     *
     * @return information_confirmation - 是否终审
     */
    public Integer getInformationConfirmation() {
        return informationConfirmation;
    }

    /**
     * 设置是否终审
     *
     * @param informationConfirmation 是否终审
     */
    public void setInformationConfirmation(Integer informationConfirmation) {
        this.informationConfirmation = informationConfirmation;
    }
}