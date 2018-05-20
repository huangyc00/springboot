package com.hyc.product.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hyc.product.util.TreeParentAndChild;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@ApiModel
@Data
public class Category{

    /**
     * 类目的id
     */
    @ApiModelProperty(hidden = true)
    private Integer id;

    /**
     * 类目的名称
     */
    private String name;

    /**
     * 类目引用的图片
     */
    private String image;

    /**
     * 类目的序号
     */
    private Integer orders;

    /**
     * 父级类目的id,当parentId为0时,表示为根
     */
    private Integer parentId;

    /**
     * 最后一次编辑时间
     */
    @ApiModelProperty(hidden = true)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date editTime;

}
