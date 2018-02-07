package com.boot.druid.model.sequence;

import org.springframework.data.annotation.Id;

public class Country {
    @Id
    private Integer id;

    private Integer no;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
