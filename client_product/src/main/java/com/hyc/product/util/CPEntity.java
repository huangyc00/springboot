package com.hyc.product.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CPEntity {

    private Integer id;

    private Integer parentId;

    private List children = new ArrayList<>();
}
