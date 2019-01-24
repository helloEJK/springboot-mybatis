package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.entity.Page;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> getList(Page<Map<String, Object>> page) {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("data",userMapper.getList(page));
        if(page.isPaging()){
            dataMap.put("count",userMapper.getCount(page));
        }
        return dataMap;
    }

    @Override
    public boolean insert(String name) {
        return userMapper.insert(name);
    }
}
