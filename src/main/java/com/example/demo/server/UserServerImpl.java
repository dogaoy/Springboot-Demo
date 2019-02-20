package com.example.demo.server;


import com.example.demo.dao.UsersMapper;
import com.example.demo.model.Users;
import com.example.demo.server.impl.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    UsersMapper usersMapper;
    @Override
    public Users findAll(long id){
        return usersMapper.selectByPrimaryKey(id);
    }
}

