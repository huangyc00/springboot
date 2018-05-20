package com.hyc.product.dto;

import com.hyc.product.util.TreeParentAndChild;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryDto implements Serializable,TreeParentAndChild{

    private static final long serialVersionUID = -1654951656586205984L;

    private Integer id;

    private String name;

    private Integer parentId;

    private List<CategoryDto> children = new ArrayList<>();

    @Override
    public void setChildren(List children) {
        this.children = children;
    }
}
