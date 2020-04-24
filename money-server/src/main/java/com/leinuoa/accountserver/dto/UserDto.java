package com.leinuoa.accountserver.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 5160345963493756588L;

    private long id;
    private String name;
    private int age;
    private long accountId;

    public UserDto(long id, String name, int age, long accountId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.accountId = accountId;
    }
}
