package com.hyc.product.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryDto implements Serializable{

    private static final long serialVersionUID = -1654951656586205984L;

    private int id;

    private String name;
}
