package com.hyc.product.util;

import java.util.List;

public interface TreeParentAndChild {

    Integer getId();

    Integer getParentId();

    void setChildren(List children);

}
