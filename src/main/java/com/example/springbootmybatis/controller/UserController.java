package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Page;
import com.example.springbootmybatis.service.UserService;
import com.example.springbootmybatis.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/example")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询
     * @param page
     * @return
     */
    @GetMapping("/getList")
    Map<String,Object> getList(Page<Map<String,Object>> page){
        Map<String,Object> resp = new HashMap<>();
        try {
            resp = userService.getList(page);
        }catch (Exception e){
            putException(resp,e);
            return resp;
        }
        resp.put("code",Const.SUCCESS_CODE);
        resp.put("msg",Const.SUCCESS_MSG);
        return resp;
    }

    //新增
    @GetMapping("/insert")
    Map<String,Object> insert(String name){
        Map<String,Object> resp = new HashMap<>();
        try {
            if(!userService.insert(name)){
                resp.put("code",500);
                resp.put("msg","未执行成功");
            }
        }catch (Exception e){
            putException(resp,e);
            return resp;
        }
        resp.put("code",Const.SUCCESS_CODE);
        resp.put("msg",Const.SUCCESS_MSG);
        return resp;
    }

    /**
     * 异常数据返回封装
     * @param resp
     * @param e
     * @return
     */
    private Map<String,Object> putException(Map<String,Object> resp,Exception e){
        resp.put("code",Const.InternalError_DBoperationFail_CODE);
        resp.put("msg",Const.InternalError_DBoperationFail_MSG);
        resp.put("data","");
        e.printStackTrace();
        return resp;
    }

}
