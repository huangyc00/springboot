package com.hyc.product.controller;

import com.hyc.product.basic.Response;
import com.hyc.product.entity.CateDto;
import com.hyc.product.entity.Category;
import com.hyc.product.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(description = " 类目api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value="展示所有的商品类目")
    @GetMapping("/findAll")
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @ApiOperation(value="修改类目")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "类目的id",paramType = "path",dataType = "int"),
            @ApiImplicitParam(name = "category", value = "修改的属性",paramType = "body",dataType = "Category")
    })
    @PutMapping("/update/{id}")
    public int update(@PathVariable("id") Integer id,@RequestBody Category category){
        category.setId(id);
        return categoryService.update(category);
    }

    @ApiOperation(value="展示所有的商品类目封装类")
    @GetMapping("/findAllRes")
    public Response<List<Category>> findAllRes(){
        return Response.ok(categoryService.findAll());
    }

    @ApiOperation(value="获取树状的类目")
    @GetMapping("/findCategoryTree/{rootId}")
    public Response<List<Category>> findCategoryTree(@PathVariable int rootId){
        List<Category> categories = categoryService.findCategoryTree(rootId);
        return Response.ok(categories);
    }

    @ApiOperation(value="获取树状的类目")
    @GetMapping("/findCateDtoTree/{rootId}")
    public Response<List<CateDto>> findCateDtoTree(@PathVariable int rootId){
        List<CateDto> cateDtos = categoryService.findCateDtoTree(rootId);
        return Response.ok(cateDtos);
    }

}
