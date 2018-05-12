package moe.cnkirito.security.oauth2.service;

import java.util.List;
import moe.cnkirito.security.oauth2.entity.Student;
public interface StudentService{

    int insert(Student student);

    int insertSelective(Student student);

    int insertList(List<Student> students);

    int update(Student student);
}
