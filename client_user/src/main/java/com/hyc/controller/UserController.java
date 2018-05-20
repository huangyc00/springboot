package com.hyc.controller;

import com.hyc.entity.User;
import com.hyc.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Api(description = "用户api")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="新增用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名字",paramType = "query",dataType = "String")
    })
    @PostMapping("/insert")
    public int insert(User user){
        return userService.insert(user);
    }

    @ApiOperation(value="获取用户列表", notes="")
    @GetMapping("/findAll")
    public Object findAll(){
        List<User> users = new ArrayList<>();
        if(userService.findAll().size() > 0){
            users.add(0,userService.findAll().get(0));
            users.add(0,userService.findAll().get(0));
        }else{
            User user = new User();
            user.setId(1);
            user.setName("user1");

            users.add(0,user);
            users.add(0,user);
        }
        Map map = new HashMap();
        map.put("data",users);
        return map;
    }
}
