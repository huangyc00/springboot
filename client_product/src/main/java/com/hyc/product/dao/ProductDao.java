package com.hyc.product.dao;

import com.hyc.product.dto.ProductDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.hyc.product.entity.Product;


public interface ProductDao {
    int insert(@Param("product") Product product);

    int insertSelective(@Param("product") Product product);

    int insertList(@Param("products") List<Product> products);

    int update(@Param("product") Product product);

    List<Product> findAll();

    List<ProductDto> findProductDtos();
}
