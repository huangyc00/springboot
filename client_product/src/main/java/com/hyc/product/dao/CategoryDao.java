package com.hyc.product.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.hyc.product.entity.Category;


public interface CategoryDao {
    int insert(@Param("category") Category category);

    int insertSelective(@Param("category") Category category);

    int insertList(@Param("categorys") List<Category> categorys);

    int update(@Param("category") Category category);

    List<Category> findAll();
}
