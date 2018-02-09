package com.boot.druid.model.businessClientBankAccount;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "business_client_bank_account")
public class BusinessClientBankAccount {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 合作伙伴id/供应商id
     */
    @Column(name = "client_id")
    private Integer clientId;

    /**
     * 合作伙伴id/供应商id
     */
    @Column(name = "complex_id")
    private Integer complexId;

    /**
     * 类型:合作伙伴、供应商
     */
    private Integer type;

    /**
     * 银行账户
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * 银行账号所对应的姓名
     */
    @Column(name = "bank_account_name")
    private String bankAccountName;

    /**
     * 开户银行
     */
    @Column(name = "bank_open_account")
    private String bankOpenAccount;

    /**
     * 币种
     */
    @Column(name = "bank_currency")
    private Integer bankCurrency;

    /**
     * 备用1
     */
    @Column(name = "is_default")
    private Integer isDefault;

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
     * 获取合作伙伴id/供应商id
     *
     * @return client_id - 合作伙伴id/供应商id
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * 设置合作伙伴id/供应商id
     *
     * @param clientId 合作伙伴id/供应商id
     */
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取合作伙伴id/供应商id
     *
     * @return complex_id - 合作伙伴id/供应商id
     */
    public Integer getComplexId() {
        return complexId;
    }

    /**
     * 设置合作伙伴id/供应商id
     *
     * @param complexId 合作伙伴id/供应商id
     */
    public void setComplexId(Integer complexId) {
        this.complexId = complexId;
    }

    /**
     * 获取类型:合作伙伴、供应商
     *
     * @return type - 类型:合作伙伴、供应商
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型:合作伙伴、供应商
     *
     * @param type 类型:合作伙伴、供应商
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取银行账户
     *
     * @return bank_account - 银行账户
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 设置银行账户
     *
     * @param bankAccount 银行账户
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * 获取银行账号所对应的姓名
     *
     * @return bank_account_name - 银行账号所对应的姓名
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * 设置银行账号所对应的姓名
     *
     * @param bankAccountName 银行账号所对应的姓名
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * 获取开户银行
     *
     * @return bank_open_account - 开户银行
     */
    public String getBankOpenAccount() {
        return bankOpenAccount;
    }

    /**
     * 设置开户银行
     *
     * @param bankOpenAccount 开户银行
     */
    public void setBankOpenAccount(String bankOpenAccount) {
        this.bankOpenAccount = bankOpenAccount == null ? null : bankOpenAccount.trim();
    }

    /**
     * 获取币种
     *
     * @return bank_currency - 币种
     */
    public Integer getBankCurrency() {
        return bankCurrency;
    }

    /**
     * 设置币种
     *
     * @param bankCurrency 币种
     */
    public void setBankCurrency(Integer bankCurrency) {
        this.bankCurrency = bankCurrency;
    }

    /**
     * 获取备用1
     *
     * @return is_default - 备用1
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置备用1
     *
     * @param isDefault 备用1
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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
}