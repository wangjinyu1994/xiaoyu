package com.xiaoyu.common.base.resp;
import com.xiaoyu.common.base.constants.ResponseEnum;
import lombok.Data;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * WJY
 */
@Data
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = -798452651140453804L;
    private String code;
    private String message;
    private T data;

    public CommonResult(){

    }

    public CommonResult(String code,String message){
        this.code = code;
        this.message = message;
    }

    public static CommonResult success(){
        CommonResult result=new CommonResult();
        result.setCode(ResponseEnum.SUCCESS.getCode());
        result.setMessage(ResponseEnum.SUCCESS.getMsg());
        return result;
    }

    public static <T> CommonResult<T> success(T data){
        CommonResult<T> result=new CommonResult<T>();
        result.setData(data);
        result.setCode(ResponseEnum.SUCCESS.getCode());
        result.setMessage(ResponseEnum.SUCCESS.getMsg());
        return result;
    }

    public static CommonResult error(String code,String msg){
        CommonResult result=new CommonResult();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public boolean isSuccess() {
        return ResponseEnum.SUCCESS.getCode().equals(this.code);
    }

    public static CommonResult build(ResponseEnum responseEnum) {
        CommonResult result = new CommonResult();
        result.setCode(responseEnum.getCode());
        result.setMessage(responseEnum.getMsg());
        return result;
    }

    public static CommonResult build(ResponseEnum responseEnum, Object... args) {
        CommonResult result = new CommonResult();
        result.setCode(responseEnum.getCode());
        result.setMessage(MessageFormat.format(responseEnum.getMsg(), args));
        return result;
    }

    public static CommonResult build(ResponseEnum responseEnum, String msg) {
        CommonResult result = new CommonResult();
        result.setCode(responseEnum.getCode());
        result.setMessage(msg);
        return result;
    }

    public static CommonResult build(String code, String msg) {
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static CommonResult fail() {
        CommonResult result = new CommonResult();
        result.setCode(ResponseEnum.FAIL.getCode());
        result.setMessage(ResponseEnum.FAIL.getMsg());
        return result;
    }

    public static <T> CommonResult<T> fail(String code, String msg, T data) {
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

}
