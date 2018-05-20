package com.hyc.product.service.impl;

import com.hyc.product.dto.CategoryDto;
import com.hyc.product.util.TreeUtil;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import com.hyc.product.entity.Category;
import com.hyc.product.dao.CategoryDao;
import com.hyc.product.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Resource
    private CategoryDao categoryDao;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public int insert(Category category){
        return categoryDao.insert(category);
    }

    @Override
    public int insertSelective(Category category){
        return categoryDao.insertSelective(category);
    }

    @Override
    public int insertList(List<Category> categorys){
        return categoryDao.insertList(categorys);
    }

    @Override
    public int update(Category category){
        return categoryDao.update(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }


    public List<CategoryDto> findCategoryTree(int rootId){
        List<CategoryDto> categoryDtos = getCategorieDtosFromCategories(categoryDao.findAll());
        CategoryDto root = new CategoryDto();
        for(CategoryDto c:categoryDtos){
            if(rootId == c.getId()){
                root = c;
                break;
            }
        }
        TreeUtil<CategoryDto> treeUtil1 = new TreeUtil(categoryDtos);
        //构造树
        return treeUtil1.getChildrenTree(root);
    }


    public List<CategoryDto> getCategorieDtosFromCategories(List<Category> categories ){
        if(null == categories || categories.size() == 0){
            categories = new ArrayList();
        }
        List<CategoryDto> categoryDtos = new ArrayList(categories.size());
        categories.forEach((category)->{
            categoryDtos.add(dozerBeanMapper.map(category,CategoryDto.class));
        });
        return categoryDtos;
    }
}
