package moe.cnkirito.security.oauth2.service;

import moe.cnkirito.security.oauth2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> findAll();

    User findById(int id);

    int insert(User user);
}
