package com.boot.druid.model.sysSequence;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_sequence")
public class SysSequence {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 表名
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 当前序列号
     */
    @Column(name = "current_no")
    private Integer currentNo;

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
     * 获取表名
     *
     * @return table_name - 表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置表名
     *
     * @param tableName 表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 获取当前序列号
     *
     * @return current_no - 当前序列号
     */
    public Integer getCurrentNo() {
        return currentNo;
    }

    /**
     * 设置当前序列号
     *
     * @param currentNo 当前序列号
     */
    public void setCurrentNo(Integer currentNo) {
        this.currentNo = currentNo;
    }
}