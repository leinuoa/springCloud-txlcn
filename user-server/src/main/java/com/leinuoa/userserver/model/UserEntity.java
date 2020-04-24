package com.leinuoa.userserver.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 4299147806432994734L;

    private long id;
    private String name;
    private int age;
    private long accountId;

}
