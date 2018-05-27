package com.hyc.service.impl;

import com.hyc.dao.AccountDao;
import com.hyc.entity.Account;
import com.hyc.service.AccountService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.selectAll();
    }


    @Override
    public int insert(Account account) {
        return accountDao.insert(account);
    }

    @Override
    public int update(Account account) {
        return accountDao.updateByPrimaryKeySelective(account);
    }

    @Override
    public Account loginByUsernamePassword(String username, String password) {
        Example example = new Example(Account.class);
        example.createCriteria().andEqualTo("username",username).andEqualTo("isDel",0);
        List<Account> accounts = accountDao.selectByExample(example);
        //通过密码校验,此处应该返回包含用户信息的jwt
        if(null != accounts && accounts.size() > 0 && accounts.get(0).getPassword().equals(password)){
            return accounts.get(0);
        }
        return null;
    }

}
