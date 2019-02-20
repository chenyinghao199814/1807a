package com.jk.service.serviceImpl;

import com.jk.bean.UserBean;
import com.jk.mapper.LoginMapper;
import com.jk.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserBean loginUser(String userName) {
        return loginMapper.loginUser(userName);
    }
}
