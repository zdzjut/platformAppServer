package com.boot.druid.model.busRegistered;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "bus_registered")
public class BusRegistered {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 账户
     */
    private String account;

    /**
     * 是否是子账号的标识，0表示是主账户
     */
    @Column(name = "main_account")
    private Integer mainAccount;

    /**
     * 密码
     */
    private String password;

    /**
     * 联系电话
     */
    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 账户状态：/启用/停用/注销
     */
    private Integer status;

    /**
     * 退出时间
     */
    @Column(name = "quit_date")
    private Date quitDate;

    /**
     * 登陆时间
     */
    @Column(name = "land_date")
    private Date landDate;

    /**
     * 登陆次数
     */
    @Column(name = "land_frequency")
    private Integer landFrequency;

    /**
     * 登陆IP
     */
    private String ip;

    /**
     * mac地址
     */
    @Column(name = "mac_address")
    private String macAddress;

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
     * 主键
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 创建人
     */
    private Integer creator;

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
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 微信号openid
     */
    @Column(name = "wechat_appid")
    private String wechatAppid;

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
     * 获取账户
     *
     * @return account - 账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账户
     *
     * @param account 账户
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取是否是子账号的标识，0表示是主账户
     *
     * @return main_account - 是否是子账号的标识，0表示是主账户
     */
    public Integer getMainAccount() {
        return mainAccount;
    }

    /**
     * 设置是否是子账号的标识，0表示是主账户
     *
     * @param mainAccount 是否是子账号的标识，0表示是主账户
     */
    public void setMainAccount(Integer mainAccount) {
        this.mainAccount = mainAccount;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
     * 获取账户状态：/启用/停用/注销
     *
     * @return status - 账户状态：/启用/停用/注销
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置账户状态：/启用/停用/注销
     *
     * @param status 账户状态：/启用/停用/注销
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取退出时间
     *
     * @return quit_date - 退出时间
     */
    public Date getQuitDate() {
        return quitDate;
    }

    /**
     * 设置退出时间
     *
     * @param quitDate 退出时间
     */
    public void setQuitDate(Date quitDate) {
        this.quitDate = quitDate;
    }

    /**
     * 获取登陆时间
     *
     * @return land_date - 登陆时间
     */
    public Date getLandDate() {
        return landDate;
    }

    /**
     * 设置登陆时间
     *
     * @param landDate 登陆时间
     */
    public void setLandDate(Date landDate) {
        this.landDate = landDate;
    }

    /**
     * 获取登陆次数
     *
     * @return land_frequency - 登陆次数
     */
    public Integer getLandFrequency() {
        return landFrequency;
    }

    /**
     * 设置登陆次数
     *
     * @param landFrequency 登陆次数
     */
    public void setLandFrequency(Integer landFrequency) {
        this.landFrequency = landFrequency;
    }

    /**
     * 获取登陆IP
     *
     * @return ip - 登陆IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置登陆IP
     *
     * @param ip 登陆IP
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取mac地址
     *
     * @return mac_address - mac地址
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * 设置mac地址
     *
     * @param macAddress mac地址
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
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
     * 获取主键
     *
     * @return group_id - 主键
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置主键
     *
     * @param groupId 主键
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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
     * 获取微信号openid
     *
     * @return wechat_appid - 微信号openid
     */
    public String getWechatAppid() {
        return wechatAppid;
    }

    /**
     * 设置微信号openid
     *
     * @param wechatAppid 微信号openid
     */
    public void setWechatAppid(String wechatAppid) {
        this.wechatAppid = wechatAppid == null ? null : wechatAppid.trim();
    }
}