package moe.cnkirito.security.oauth2.entity;

import java.io.Serializable;

public class User implements Serializable{


    private static final long serialVersionUID = 541161513530471344L;

    private Integer id;

    private String userName;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";
    }


}
