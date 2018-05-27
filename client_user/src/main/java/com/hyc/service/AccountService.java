package com.hyc.service;

import java.util.List;

import com.hyc.entity.Account;

public interface AccountService {


    List<Account> findAll();

    int insert(Account account);

    int update(Account account);

    Account loginByUsernamePassword(String username,String password);
}
