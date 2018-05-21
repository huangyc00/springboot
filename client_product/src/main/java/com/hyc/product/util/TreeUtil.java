package com.hyc.product.util;


import java.util.ArrayList;
import java.util.List;

public class TreeUtil<T extends TreeParentAndChild> {

    private List<T> cpEntities;

    public TreeUtil(List<T> cpEntities) {
        if(null == cpEntities){
            cpEntities = new ArrayList<>();
        }
        this.cpEntities = cpEntities;
    }

    /**
     * 获取树状节点
     * @param t
     * @return
     */
    public List<T> getChildrenTree(T t){
        if( null == t){
            return new ArrayList<>();
        }
        List<T> children = getChildren(t.getId());
        t.setChildren(children);
        for(T c:children){
            getChildrenTree(c);
        }
        return children;
    }

    /**
     * 获取子节点下面的子类
     * @param rootId 根节点
     * @return  List<Category>
     */
    public List<T> getChildren(int rootId){
        List<T> children = new ArrayList<>();
        for(T c : this.cpEntities){
            if(c.getParentId() != null && c.getParentId() == rootId){
                children.add(c);
            }
        }
        return children;
    }


}
