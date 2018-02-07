package com.boot.druid.model.sysCountryPort;

import javax.persistence.*;

@Table(name = "sys_country_port")
public class SysCountryPort {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "chinese_name")
    private String chineseName;

    @Column(name = "english_name")
    private String englishName;

    /**
     * 简码,助记码
     */
    private String category;

    /**
     * 上级
     */
    private Integer parent;

    @Column(name = "country_code")
    private String countryCode;

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
     * 获取名称
     *
     * @return chinese_name - 名称
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * 设置名称
     *
     * @param chineseName 名称
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * @return english_name
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * @param englishName
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * 获取简码,助记码
     *
     * @return category - 简码,助记码
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置简码,助记码
     *
     * @param category 简码,助记码
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 获取上级
     *
     * @return parent - 上级
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 设置上级
     *
     * @param parent 上级
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * @return country_code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }
}