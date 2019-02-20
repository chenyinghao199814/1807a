package com.jk.mapper.Fs;

import com.jk.bean.TreeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TreeMapper {

    @Select("select * from t_tree where pid = #{value}")
    List<TreeBean> getMyTree(int id);
}
