package com.hyc.product.entity;

import lombok.Data;

import java.util.List;

/**
 * 商品表
 */
@Data
public class Product {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品的主图片
     */
    private String showImage;

    /**
     * 商品展示的图片集合
     */
    private List<String> images;

    /**
     * 对应的类目的id
     */
    private Integer categoryId;


}
