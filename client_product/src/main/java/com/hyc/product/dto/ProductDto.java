package com.hyc.product.dto;

import com.hyc.product.entity.Category;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProductDto implements Serializable{

    private static final long serialVersionUID = -1302161125529703666L;

    private int id;

    private String name;

    private CategoryDto categoryDto;
}
