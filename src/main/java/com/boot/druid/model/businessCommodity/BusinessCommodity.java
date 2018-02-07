package com.boot.druid.model.businessCommodity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "business_commodity")
public class BusinessCommodity {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 序号
     */
    private Integer series;

    /**
     * 委托单号
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 供应商编号
     */
    @Column(name = "supplier_id")
    private Integer supplierId;

    /**
     * 商品编号
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 报关单价
     */
    private BigDecimal univalent;

    /**
     * 总数量
     */
    private BigDecimal count;

    /**
     * 件数
     */
    @Column(name = "number_pieces")
    private Integer numberPieces;

    private Integer unit;

    /**
     * 体积
     */
    private BigDecimal volume;

    /**
     * 毛重(KG)
     */
    @Column(name = "gross_weight")
    private BigDecimal grossWeight;

    /**
     * 净重
     */
    @Column(name = "net_weight")
    private BigDecimal netWeight;

    /**
     * 总价（计税金额）
     */
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    /**
     * 开票金额
     */
    @Column(name = "invoice_money")
    private BigDecimal invoiceMoney;

    /**
     * 装量
     */
    private Float quantity;

    /**
     * 货源地
     */
    @Column(name = "item_resource")
    private String itemResource;

    private Integer packaging;

    /**
     * 唛头
     */
    private String mark;

    /**
     * 第一次审核通过后的原始报关单价
     */
    @Column(name = "univalent_origin")
    private BigDecimal univalentOrigin;

    @Column(name = "commodity_inspection")
    private Integer commodityInspection;

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

    private Integer exemption;

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
     * 获取序号
     *
     * @return series - 序号
     */
    public Integer getSeries() {
        return series;
    }

    /**
     * 设置序号
     *
     * @param series 序号
     */
    public void setSeries(Integer series) {
        this.series = series;
    }

    /**
     * 获取委托单号
     *
     * @return order_id - 委托单号
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置委托单号
     *
     * @param orderId 委托单号
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取供应商编号
     *
     * @return supplier_id - 供应商编号
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置供应商编号
     *
     * @param supplierId 供应商编号
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取商品编号
     *
     * @return commodity_id - 商品编号
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品编号
     *
     * @param commodityId 商品编号
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取报关单价
     *
     * @return univalent - 报关单价
     */
    public BigDecimal getUnivalent() {
        return univalent;
    }

    /**
     * 设置报关单价
     *
     * @param univalent 报关单价
     */
    public void setUnivalent(BigDecimal univalent) {
        this.univalent = univalent;
    }

    /**
     * 获取总数量
     *
     * @return count - 总数量
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * 设置总数量
     *
     * @param count 总数量
     */
    public void setCount(BigDecimal count) {
        this.count = count;
    }

    /**
     * 获取件数
     *
     * @return number_pieces - 件数
     */
    public Integer getNumberPieces() {
        return numberPieces;
    }

    /**
     * 设置件数
     *
     * @param numberPieces 件数
     */
    public void setNumberPieces(Integer numberPieces) {
        this.numberPieces = numberPieces;
    }

    /**
     * @return unit
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * 获取体积
     *
     * @return volume - 体积
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * 设置体积
     *
     * @param volume 体积
     */
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    /**
     * 获取毛重(KG)
     *
     * @return gross_weight - 毛重(KG)
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * 设置毛重(KG)
     *
     * @param grossWeight 毛重(KG)
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * 获取净重
     *
     * @return net_weight - 净重
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * 设置净重
     *
     * @param netWeight 净重
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * 获取总价（计税金额）
     *
     * @return total_price - 总价（计税金额）
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置总价（计税金额）
     *
     * @param totalPrice 总价（计税金额）
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取开票金额
     *
     * @return invoice_money - 开票金额
     */
    public BigDecimal getInvoiceMoney() {
        return invoiceMoney;
    }

    /**
     * 设置开票金额
     *
     * @param invoiceMoney 开票金额
     */
    public void setInvoiceMoney(BigDecimal invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    /**
     * 获取装量
     *
     * @return quantity - 装量
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * 设置装量
     *
     * @param quantity 装量
     */
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取货源地
     *
     * @return item_resource - 货源地
     */
    public String getItemResource() {
        return itemResource;
    }

    /**
     * 设置货源地
     *
     * @param itemResource 货源地
     */
    public void setItemResource(String itemResource) {
        this.itemResource = itemResource == null ? null : itemResource.trim();
    }

    /**
     * @return packaging
     */
    public Integer getPackaging() {
        return packaging;
    }

    /**
     * @param packaging
     */
    public void setPackaging(Integer packaging) {
        this.packaging = packaging;
    }

    /**
     * 获取唛头
     *
     * @return mark - 唛头
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置唛头
     *
     * @param mark 唛头
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * 获取第一次审核通过后的原始报关单价
     *
     * @return univalent_origin - 第一次审核通过后的原始报关单价
     */
    public BigDecimal getUnivalentOrigin() {
        return univalentOrigin;
    }

    /**
     * 设置第一次审核通过后的原始报关单价
     *
     * @param univalentOrigin 第一次审核通过后的原始报关单价
     */
    public void setUnivalentOrigin(BigDecimal univalentOrigin) {
        this.univalentOrigin = univalentOrigin;
    }

    /**
     * @return commodity_inspection
     */
    public Integer getCommodityInspection() {
        return commodityInspection;
    }

    /**
     * @param commodityInspection
     */
    public void setCommodityInspection(Integer commodityInspection) {
        this.commodityInspection = commodityInspection;
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
     * @return exemption
     */
    public Integer getExemption() {
        return exemption;
    }

    /**
     * @param exemption
     */
    public void setExemption(Integer exemption) {
        this.exemption = exemption;
    }
}