package com.hyc.product.service;

import java.util.List;

import com.hyc.product.dto.ProductDto;
import com.hyc.product.entity.Product;
public interface ProductService{

    int insert(Product product);

    int insertSelective(Product product);

    int insertList(List<Product> products);

    int update(Product product);

    List<Product> findAll();

    List<ProductDto> findProductDtos();
}
