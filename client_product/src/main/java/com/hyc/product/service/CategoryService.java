package com.hyc.product.service;

import java.util.List;

import com.hyc.product.dto.CategoryDto;
import com.hyc.product.entity.Category;
public interface CategoryService{

    int insert(Category category);

    int insertSelective(Category category);

    int insertList(List<Category> categorys);

    int update(Category category);

    List<Category> findAll();

    List<CategoryDto> findCategoryTree(int rootId);

}
