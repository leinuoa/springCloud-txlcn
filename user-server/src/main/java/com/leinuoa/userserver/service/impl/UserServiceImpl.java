package com.leinuoa.userserver.service.impl;

import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.leinuoa.userserver.dao.UserDao;
import com.leinuoa.userserver.model.UserEntity;
import com.leinuoa.userserver.service.UserService;
import com.leinuoa.userserver.utils.IdUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @TxTransaction
    @Transactional
    public void addUser(UserEntity userEntity) {
        long id = IdUtil.nextId();
        System.out.println(id + ", "+ userEntity.getAccountId());
        userEntity.setId(id);
        userDao.addUser(userEntity);
    }

}
