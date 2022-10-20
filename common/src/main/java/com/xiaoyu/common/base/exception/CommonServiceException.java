package com.xiaoyu.common.base.exception;

import com.xiaoyu.common.base.constants.ResponseEnum;

import java.text.MessageFormat;

/**
 * WJY
 */
public class CommonServiceException extends RuntimeException{

    private String errorCode;
    private String errorMsg;

    private ResponseEnum responseEnum;
    private Object errorDataEx;

    public CommonServiceException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public CommonServiceException(String errorCode, String errorMsg, Object errorDataEx) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.errorDataEx = errorDataEx;
    }

    public CommonServiceException(ResponseEnum responseEnum) {
        super(responseEnum.getMsg());
        this.errorCode = responseEnum.getCode();
        this.errorMsg = responseEnum.getMsg();
    }

    public CommonServiceException(ResponseEnum responseEnum, Object... args) {
        super(MessageFormat.format(responseEnum.getMsg(), args));
        this.errorCode = responseEnum.getCode();
        this.errorMsg = MessageFormat.format(responseEnum.getMsg(), args);
    }

    public CommonServiceException(ResponseEnum responseEnum, Object errorDataEx) {
        super(errorDataEx instanceof String ? (String) errorDataEx : responseEnum.getMsg());
        this.errorCode = responseEnum.getCode();
        this.errorMsg = responseEnum.getMsg();
        this.errorDataEx = errorDataEx;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getErrorDataEx() {
        return errorDataEx;
    }

    public void setErrorDataEx(Object errorDataEx) {
        this.errorDataEx = errorDataEx;
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public void setResponseEnum(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

}
