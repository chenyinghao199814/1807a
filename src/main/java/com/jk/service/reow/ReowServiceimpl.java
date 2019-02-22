package com.jk.service.reow;

import com.jk.bean.Reow;
import com.jk.bean.UserBean;
import com.jk.mapper.reow.ReowMapper;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReowServiceimpl implements ReowService {
    @Autowired
    private ReowMapper reowMapper;

    @Override
    public List<Reow> queryReow() {
        return reowMapper.queryReow();
    }

    @Override
    public List<UserBean> queryUser() {
        return reowMapper.queryUser();
    }
}
