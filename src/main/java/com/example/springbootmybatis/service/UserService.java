package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Page;

import java.util.Map;

public interface UserService {

    Map<String,Object> getList(Page<Map<String,Object>> page);

    boolean insert(String name);
}
