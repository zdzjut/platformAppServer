package com.boot.druid.model.businessCommodityInfo;


import org.springframework.data.annotation.Id;


public class BusinessCommodityInfoDtoForMongo extends BusinessCommodityInfo {
    /**
     * 主键
     */
    @Id
    private String dtoId;


    private String name;

    private String phone;

    public String getDtoId() {
        return dtoId;
    }

    public void setDtoId(String dtoId) {
        this.dtoId = dtoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}