package moe.cnkirito.security.oauth2.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import moe.cnkirito.security.oauth2.entity.Student;


public interface StudentDao {

    int insert(@Param("student") Student student);

    int insertSelective(@Param("student") Student student);

    int insertList(@Param("students") List<Student> students);

    int update(@Param("student") Student student);

}
