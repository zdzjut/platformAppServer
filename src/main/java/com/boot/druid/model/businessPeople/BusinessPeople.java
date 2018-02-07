package com.boot.druid.model.businessPeople;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "business_people")
public class BusinessPeople {
    /**
     * 主键
     */
    @Id
    private Integer id;

    @Column(name = "commodity_id")
    private Integer commodityId;

    @Column(name = "client_id")
    private Integer clientId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别:男/女
     */
    private Integer sex;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 备用1
     */
    @Column(name = "spare_one")
    private String spareOne;

    /**
     * 备用2
     */
    @Column(name = "spare_two")
    private String spareTwo;

    /**
     * 备用3
     */
    @Column(name = "spare_three")
    private String spareThree;

    /**
     * 备用4
     */
    @Column(name = "spare_four")
    private String spareFour;

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
     * @return commodity_id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * @param commodityId
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * @return client_id
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * @param clientId
     */
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别:男/女
     *
     * @return sex - 性别:男/女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别:男/女
     *
     * @param sex 性别:男/女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取邮箱
     *
     * @return mail - 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置邮箱
     *
     * @param mail 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取备用1
     *
     * @return spare_one - 备用1
     */
    public String getSpareOne() {
        return spareOne;
    }

    /**
     * 设置备用1
     *
     * @param spareOne 备用1
     */
    public void setSpareOne(String spareOne) {
        this.spareOne = spareOne == null ? null : spareOne.trim();
    }

    /**
     * 获取备用2
     *
     * @return spare_two - 备用2
     */
    public String getSpareTwo() {
        return spareTwo;
    }

    /**
     * 设置备用2
     *
     * @param spareTwo 备用2
     */
    public void setSpareTwo(String spareTwo) {
        this.spareTwo = spareTwo == null ? null : spareTwo.trim();
    }

    /**
     * 获取备用3
     *
     * @return spare_three - 备用3
     */
    public String getSpareThree() {
        return spareThree;
    }

    /**
     * 设置备用3
     *
     * @param spareThree 备用3
     */
    public void setSpareThree(String spareThree) {
        this.spareThree = spareThree == null ? null : spareThree.trim();
    }

    /**
     * 获取备用4
     *
     * @return spare_four - 备用4
     */
    public String getSpareFour() {
        return spareFour;
    }

    /**
     * 设置备用4
     *
     * @param spareFour 备用4
     */
    public void setSpareFour(String spareFour) {
        this.spareFour = spareFour == null ? null : spareFour.trim();
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
}