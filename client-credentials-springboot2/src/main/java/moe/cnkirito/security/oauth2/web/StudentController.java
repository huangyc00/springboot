package moe.cnkirito.security.oauth2.web;

import moe.cnkirito.security.oauth2.entity.Student;
import moe.cnkirito.security.oauth2.entity.User;
import moe.cnkirito.security.oauth2.service.StudentService;
import moe.cnkirito.security.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/findStudents")
    public void findUsers(@RequestBody Student student){
        this.studentService.insert(student);
    }
}
