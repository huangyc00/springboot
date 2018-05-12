package moe.cnkirito.security.oauth2.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import moe.cnkirito.security.oauth2.entity.Student;
import moe.cnkirito.security.oauth2.dao.StudentDao;
import moe.cnkirito.security.oauth2.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao studentDao;

    @Override
    public int insert(Student student){
        return studentDao.insert(student);
    }

    @Override
    public int insertSelective(Student student){
        return studentDao.insertSelective(student);
    }

    @Override
    public int insertList(List<Student> students){
        return studentDao.insertList(students);
    }

    @Override
    public int update(Student student){
        return studentDao.update(student);
    }
}
