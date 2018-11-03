package com.iblog.controller;

import com.github.pagehelper.PageInfo;
import com.iblog.entity.User;
import com.iblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping(value="/user")
    public Map<String, Object> findUser(@RequestParam(value = "param") Map<String, Object> param) {
        Map<String,Object> result = new HashMap<>();
        PageInfo<User> pageInfo = userService.findUser(param);
        if(pageInfo!=null){
            result.put("users",pageInfo);
            result.put("0","成功！");
        }else{
            result.put("-1","失败！");
        }
        return result;
    }
}
