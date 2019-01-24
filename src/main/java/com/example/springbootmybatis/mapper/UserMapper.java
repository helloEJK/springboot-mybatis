package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.Page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    //获取列表
    @Select({"<script>"
            + "select id,name from user where 1=1"
            + "<if test='#{paging}'>"
            + "limit #{currentResult},#{limit}"
            + "</if>"
            + "</script>"})
    List<Map<String,Object>> getList(Page<Map<String,Object>> page);

    //获取列表数据条数-分页
    @Select({"<script>"
            + "select count(id) from user where 1=1"
            + "</script>"})
    int getCount(Page<Map<String,Object>> page);

    //新增
    @Insert("insert into user(name) values(#{name})")
    boolean insert(@Param("name") String name);
}
