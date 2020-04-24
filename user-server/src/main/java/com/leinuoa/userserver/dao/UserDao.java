package com.leinuoa.userserver.dao;

import com.leinuoa.userserver.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    void addUser(UserEntity userEntity);
}
