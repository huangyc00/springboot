package com.hyc.controller;

import com.hyc.entity.Account;
import com.hyc.security.JwtHpler;
import com.hyc.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account/api")
@Api(description = "用户api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ApiOperation(value="获取用户列表")
    @GetMapping("/findAll")
    public List<Account> findAll(){
        return accountService.findAll();
    }

    @ApiOperation(value="添加一个账号")
    @PostMapping(value = "/insert")
    public int insert(@RequestBody Account account){

        return accountService.insert(account);
    }

    @ApiOperation(value="添加一个账号")
    @PutMapping(value = "/update/{id}")
    public int update(@PathVariable String id,@RequestBody Account account){
        account.setId(id);
        return accountService.update(account);
    }


    @PostMapping(value = "/login")
    public String login(@RequestBody Account account){
        if(null == account){
            throw new RuntimeException("用户信息不能为空");
        }
        String username = account.getUsername();
        String password = account.getPassword();
        if(StringUtils.isBlank(username)){
            throw new RuntimeException("账号不能为空");
        }
        if(StringUtils.isBlank(password)){
            throw new RuntimeException("密码不能为空");
        }
        Account user = accountService.loginByUsernamePassword(username,password);
        if(null != user){
            return JwtHpler.createAccountJWT(user.getId(),user.getUsername(),5000L);
        }
        return null;
    }

}
