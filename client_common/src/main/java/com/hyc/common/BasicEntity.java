package com.hyc.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import java.util.Date;

public class BasicEntity{

    @JsonIgnore
    @Column(updatable = false)
    private String createId = "DEFAULET_CREATE_MAN";

    @JsonIgnore
    @Column(insertable = false)
    private String editId = "DEFAULET_EDIT_MAN";

    @JsonIgnore
    @Column(insertable = false,updatable = false)
    private Date createTime;

    @JsonIgnore
    @Column(insertable = false,updatable = false)
    private Date editTime;

    @JsonIgnore
    private Integer isDel = 0;

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getEditId() {
        return editId;
    }

    public void setEditId(String editId) {
        this.editId = editId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}
