package com.boot.druid.model.sysUser;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    private String truename;

    private String mobile;

    /**
     * 数据字典
     */
    @Column(name = "dept_id")
    private Integer gender;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门id
     */
    @Column(name = "dept_id")
    private Integer deptId;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 用户组id
     */
    @Column(name = "group_id")
    private Integer groupId;

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
     * 微信服务号appid
     */
    @Column(name = "wechat_appid")
    private String wechatAppid;

    /**
     * 用户数据查询权限
     */
    @Column(name = "query_authority")
    private Integer queryAuthority;

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
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return truename
     */
    public String getTruename() {
        return truename;
    }

    /**
     * @param truename
     */
    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取数据字典
     *
     * @return gendar - 数据字典
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置数据字典
     *
     * @param gendar 数据字典
     */
    public void setGendar(Integer gendar) {
        this.gender = gender;
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
     * 获取部门id
     *
     * @return dept_id - 部门id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置部门id
     *
     * @param deptId 部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
     * 获取用户组id
     *
     * @return group_id - 用户组id
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置用户组id
     *
     * @param groupId 用户组id
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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
     * 获取微信服务号appid
     *
     * @return wechat_appid - 微信服务号appid
     */
    public String getWechatAppid() {
        return wechatAppid;
    }

    /**
     * 设置微信服务号appid
     *
     * @param wechatAppid 微信服务号appid
     */
    public void setWechatAppid(String wechatAppid) {
        this.wechatAppid = wechatAppid == null ? null : wechatAppid.trim();
    }

    /**
     * 获取用户数据查询权限
     *
     * @return query_authority - 用户数据查询权限
     */
    public Integer getQueryAuthority() {
        return queryAuthority;
    }

    /**
     * 设置用户数据查询权限
     *
     * @param queryAuthority 用户数据查询权限
     */
    public void setQueryAuthority(Integer queryAuthority) {
        this.queryAuthority = queryAuthority;
    }
}