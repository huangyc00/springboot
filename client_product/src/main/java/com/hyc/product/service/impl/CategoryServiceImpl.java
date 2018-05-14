package com.hyc.product.service.impl;

import com.hyc.product.entity.CateDto;
import com.hyc.product.util.TreeUtil;
import com.hyc.product.util.TreeUtilGuoShi;
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


    public List<Category> findCategoryTree(int rootId){
        List<Category> categories = categoryDao.findAll();
        Category root = new Category();
        for(Category c:categories){
            if(rootId == c.getId()){
                root = c;
                break;
            }
        }
        TreeUtilGuoShi treeUtil1 = new TreeUtilGuoShi(categories);
        //构造树
        return treeUtil1.getCategoriesTree(root);
    }

    public List<CateDto> findCateDtoTree(int rootId){
        List<CateDto> cateDtos = new ArrayList<>();
        for(int i=0;i<5;i++){
            CateDto cateDto = new CateDto();
            cateDto.setId(i);
            cateDto.setName("cate"+i);
            if(i != 0){
                cateDto.setParentId(i-1);
            }
            if(i == 2){
                CateDto cateDto7 = new CateDto();
                cateDto7.setId(7);
                cateDto7.setParentId(1);
                cateDto7.setName("cate7");
                cateDtos.add(cateDto7);

                CateDto cateDto8 = new CateDto();
                cateDto8.setId(8);
                cateDto8.setParentId(1);
                cateDto8.setName("cate8");
                cateDtos.add(cateDto8);
            }
            cateDtos.add(cateDto);
        }
        CateDto root = new CateDto();
        for(CateDto c:cateDtos){
            if(rootId == c.getId()){
                root = c;
                break;
            }
        }
        TreeUtil<CateDto> treeUtil1 = new TreeUtil(cateDtos);
        //构造树
        List<CateDto> cateDtoList = treeUtil1.getChildrenTree(root);
        return cateDtoList;
    }

}
