package com.leinuoa.accountserver.service.impl;

import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.leinuoa.accountserver.dao.AccountDao;
import com.leinuoa.accountserver.dto.UserDto;
import com.leinuoa.accountserver.feign.UserService;
import com.leinuoa.accountserver.model.AccountEntity;
import com.leinuoa.accountserver.service.AccountService;
import com.leinuoa.accountserver.utils.IdUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountDao accountDao;
    private final UserService userService;

    public AccountServiceImpl(AccountDao accountDao, UserService userService) {
        this.accountDao = accountDao;
        this.userService = userService;
    }

    @Override
    @TxcTransaction
    @Transactional
    public String createAccount(AccountEntity accountEntity) {
        long accountId = IdUtil.nextId();
        accountEntity.setId(accountId);
        // 先调用远程服务测试事务回滚
        String result = userService.addUser(new UserDto(0L,"张三",30,accountId));
        System.out.println(result);

        accountDao.createAccount(accountEntity);

        return accountEntity.toString();
    }
}
