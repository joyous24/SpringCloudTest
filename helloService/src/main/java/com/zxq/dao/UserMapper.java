package com.zxq.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    @Insert("insert into user(name,tel) values(#{name},#{tel})")
    int save(@Param("name") String name, @Param("tel") String tel);

}
