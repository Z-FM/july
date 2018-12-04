package com.july.model;

/**
 * Created by GXR on 2018/12/4.
 */
public class ServiceResult {

    private Integer code=200;
    private String msg="操作成功!";

    public ServiceResult() {
    }

    public ServiceResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ServiceResult(Integer code, String msg, Object result) {

        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    private Object result;
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getResult() {
        return result;
    }
    public void setResult(Object result) {
        this.result = result;
    }

}
