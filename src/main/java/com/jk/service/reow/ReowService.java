package com.jk.service.reow;

import com.jk.bean.Reow;
import com.jk.bean.UserBean;
import org.apache.catalina.mbeans.UserMBean;

import java.util.List;

public interface ReowService {
    List<Reow> queryReow();

    List<UserBean> queryUser();
}
