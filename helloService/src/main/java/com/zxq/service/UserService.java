package com.zxq.service;

import com.codingapi.tx.annotation.TxTransaction;
import com.zxq.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @TxTransaction
    @Transactional
    public void addUser() {
        userMapper.save("张三", "13261898456");
    }
}
