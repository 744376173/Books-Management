package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

//    @Select("select * from user") //通过注解 达到查询表
    List<User> listUsers(); //查询所有的方法  鼠标放到List上 alt + 回车可以快速导包
}
