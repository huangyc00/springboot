package com.hyc.product.controller;

import com.hyc.product.basic.Response;
import com.hyc.product.dto.ProductDto;
import com.hyc.product.entity.Product;
import com.hyc.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@Api(description = " 商品服务")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    public Response<List<Product>> findAll(){
        return Response.ok(productService.findAll());
    }

    @GetMapping("/findProductDtos")
    public Response< List<ProductDto>> findProductDtos(){
        return Response.ok(productService.findProductDtos());
    }

    @PostMapping("/insert")
    public Response<Integer> insert(@RequestBody Product product){
        return Response.ok(productService.insert(product));
    }
}
