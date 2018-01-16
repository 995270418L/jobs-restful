package com.steve.jobsjson.util;

import org.springframework.validation.FieldError;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

public class Response<T> implements Serializable{

    private Collection<FieldError> fieldErrors;
    private Integer status;
    private String code;
    private String message;
    private T data;

    public Response(){}

    public Response(T data){
        this.status = Integer.valueOf(200);
        this.code = "ok";
        this.message = "成功";
        this.data = data;
    }

    public Response(Integer status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public Response(T data, Collection<FieldError> fieldErrors) {
        this.status = Integer.valueOf(1024);
        this.code = "field_errors";
        this.message = "数据校验失败";
        this.fieldErrors = new HashSet();
        this.fieldErrors.clear();
        if (fieldErrors != null && fieldErrors.size() > 0) {
            this.fieldErrors.addAll(fieldErrors);
        }
    }
    public static <T> Response<T> ok(T data){
        return new Response(data);
    }

    public static Response error(String message){
        return  new Response(1024,"field_error",message);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
