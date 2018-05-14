package com.hyc.product.basic;

import lombok.Data;


public class Response<T> {

    private String code;

    private T content;

    private String errorMsg;

    private String path;

    public static<T> Response<T> ok(T content){
        return new Response<T>("200",content,null,null);
    }

    public static<T> Response<T> error(String errorMsg,String path){
        return new Response<T>("-1",null,errorMsg,path);
    }


    public static<T> Response<T> error(String code,String errorMsg,String path){
        return new Response<T>(code,null,errorMsg,path);
    }


    public static<T> Response<T> error(String code,T t,String errorMsg,String path){
        return new Response<T>(code,t,errorMsg,path);
    }

    public Response() {
    }


    public Response(String code, T content, String errorMsg,String path) {
        this.code = code;
        this.content = content;
        this.errorMsg = errorMsg;
        this.path = path;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
