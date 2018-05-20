//package com.hyc.product.util;
//
//import com.hyc.product.entity.Category;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TreeUtilGuoShi {
//
//    private List<Category> categories;
//
//    public TreeUtilGuoShi(List<Category> categories) {
//        if(null == categories){
//            categories = new ArrayList<>();
//        }
//        this.categories = categories;
//    }
//
//    public List<Category> getCategoriesTree(Category root){
//        if( null == root){
//            return new ArrayList<>();
//        }
//        List<Category> children = getChildren(root.getId());
//        root.(children);
//        for(Category c:children){
//            getCategoriesTree(c);
//        }
//        return children;
//    }
//
//    /**
//     * 获取子节点下面的子类
//     * @param rootId 根节点
//     * @return  List<Category>
//     */
//    public List<Category> getChildren(int rootId){
//        List<Category> children = new ArrayList<>();
//        for(Category c : this.categories){
//            if(c.getParentId() != null && c.getParentId() == rootId){
//                children.add(c);
//            }
//        }
//        return children;
//    }
//
//    public List<Category> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(List<Category> categories) {
//        this.categories = categories;
//    }
//}
