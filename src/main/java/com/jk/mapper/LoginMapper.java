package com.jk.mapper;

import com.jk.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("select * from t_user where username = #{userName}")
    UserBean loginUser(String userName);
}
