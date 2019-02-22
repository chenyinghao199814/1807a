package com.jk.mapper.reow;

import com.jk.bean.Reow;
import com.jk.bean.UserBean;
import org.apache.catalina.mbeans.UserMBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReowMapper {
    @Select(" select * from t_reow ")
    List<Reow> queryReow();
    @Select(" select * from  t_user ")
    List<UserBean> queryUser();
}
