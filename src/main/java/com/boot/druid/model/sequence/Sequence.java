package com.boot.druid.model.sequence;

import org.springframework.data.annotation.Id;



public class Sequence {
    @Id
    private Integer id;

    private Integer no;

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
}
