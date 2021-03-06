package com.hyc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hyc.entity.User;
import com.hyc.dao.UserDao;
import com.hyc.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public int insert(User user){
        return userDao.insert(user);
    }

    @Override
    public int insertSelective(User user){
        return userDao.insertSelective(user);
    }

    @Override
    public int insertList(List<User> users){
        return userDao.insertList(users);
    }

    @Override
    public int update(User user){
        return userDao.update(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }


}
