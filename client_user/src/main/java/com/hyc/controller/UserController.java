package com.hyc.controller;

import com.hyc.entity.User;
import com.hyc.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<User> findAll(){
        return userService.findAll();
    }
}
