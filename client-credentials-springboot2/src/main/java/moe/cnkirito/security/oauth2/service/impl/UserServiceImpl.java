package moe.cnkirito.security.oauth2.service.impl;

import moe.cnkirito.security.oauth2.dao.UserDao;
import moe.cnkirito.security.oauth2.dao.UserMapper;
import moe.cnkirito.security.oauth2.entity.User;
import moe.cnkirito.security.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }
}
