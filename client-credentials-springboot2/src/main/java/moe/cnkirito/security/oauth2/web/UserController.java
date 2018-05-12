package moe.cnkirito.security.oauth2.web;

import moe.cnkirito.security.oauth2.entity.User;
import moe.cnkirito.security.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUsers/{id}")
    public User findById(@PathVariable int id){
        return userService.findById(id);
    }

    @PostMapping("/save")
    public int save(@RequestBody User user){
        return userService.insert(user);
    }
}
