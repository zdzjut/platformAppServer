package com.boot.druid.model.sysArea;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_area")
public class SysArea {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 简码,助记码
     */
    private String code;

    /**
     * 层级
     */
    private String level;

    /**
     * 上级
     */
    private Integer parent;

    /**
     * 区号
     */
    @Column(name = "area_code")
    private String areaCode;

    /**
     * 邮编
     */
    private String postcode;

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
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取简码,助记码
     *
     * @return code - 简码,助记码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置简码,助记码
     *
     * @param code 简码,助记码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取层级
     *
     * @return level - 层级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置层级
     *
     * @param level 层级
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
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
     * 获取区号
     *
     * @return area_code - 区号
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置区号
     *
     * @param areaCode 区号
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 获取邮编
     *
     * @return postcode - 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮编
     *
     * @param postcode 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}