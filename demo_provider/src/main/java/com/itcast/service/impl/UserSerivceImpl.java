package com.itcast.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itcast.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = UserService.class)
@Transactional
public class UserSerivceImpl implements UserService {
    @Override
    public String sayToDubbo(String name) {
        return "Hello 2222222 " + name;
    }
}
