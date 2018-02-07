package com.boot.druid.model.token;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Token {
    @Id
    private Integer id;

    private String tokenString;
    private Integer clientId;
    //过期时间
    private Date overdue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTokenString() {
        return tokenString;
    }

    public void setTokenString(String tokenString) {
        this.tokenString = tokenString;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Date getOverdue() {
        return overdue;
    }

    public void setOverdue(Date overdue) {
        this.overdue = overdue;
    }
}
