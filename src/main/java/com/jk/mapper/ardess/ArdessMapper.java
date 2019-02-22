package com.jk.mapper.ardess;

import com.jk.bean.Ardess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArdessMapper {
    @Select("select * from areas")
    List<Ardess> queryArdess();
}
