package moe.cnkirito.security.oauth2.dao;

import moe.cnkirito.security.oauth2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    int save(User user);

    User selectById(Integer id);

    int updateById(User user);

    int deleteById(Integer id);

    List<User> queryAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findId(Integer id);
}
