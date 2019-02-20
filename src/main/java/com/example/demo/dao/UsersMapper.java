package com.example.demo.dao;

import com.example.demo.model.Users;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/02/21
*/
@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}