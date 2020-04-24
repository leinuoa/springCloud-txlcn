package com.leinuoa.accountserver.dao;

import com.leinuoa.accountserver.model.AccountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountDao {
    void createAccount(AccountEntity accountEntity);
}
