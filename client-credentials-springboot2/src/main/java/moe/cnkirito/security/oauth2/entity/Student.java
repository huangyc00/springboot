package moe.cnkirito.security.oauth2.entity;

public class Student {

    /**
     * 学生id

     */
    private Integer id;

    /**
     * 学生名字
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
