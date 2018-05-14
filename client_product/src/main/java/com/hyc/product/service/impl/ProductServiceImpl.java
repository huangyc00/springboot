package com.hyc.product.service.impl;

import com.hyc.product.dto.ProductDto;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.hyc.product.entity.Product;
import com.hyc.product.dao.ProductDao;
import com.hyc.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    @Resource
    private ProductDao productDao;

    @Override
    public int insert(Product product){
        return productDao.insert(product);
    }

    @Override
    public int insertSelective(Product product){
        return productDao.insertSelective(product);
    }

    @Override
    public int insertList(List<Product> products){
        return productDao.insertList(products);
    }

    @Override
    public int update(Product product){
        return productDao.update(product);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<ProductDto> findProductDtos() {
        return productDao.findProductDtos();
    }
}
