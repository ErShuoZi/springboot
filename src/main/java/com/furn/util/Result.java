package com.furn.util;

import java.util.Date;

//该工具类用于返回（Json格式）结果
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    //未携带数据成功
    public static Result success() {
        Result result = new Result<>();
        result.setCode(200);
        result.setMsg("success");
        return  result;
    }
    //携带数据成功
    //如果需要在静态方法使用泛型,需要在static 后添加泛型标识
    public static <T> Result<T> success(T data) {
        Result<T> tResult = new Result<>(data);
        tResult.setCode(200);
        tResult.setMsg("success");
        return tResult;
    }


    public static Result error(Integer code,String msg) {
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return  result;
    }

    public static <T> Result<T> error(Integer code, String msg,T data) {
        Result<T> tResult = new Result<>(data);
        tResult.setCode(code);
        tResult.setMsg(msg);
        return tResult;
    }

    public Result() {

    }

    public Result(T data) {
        this.data = data;
    }
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
