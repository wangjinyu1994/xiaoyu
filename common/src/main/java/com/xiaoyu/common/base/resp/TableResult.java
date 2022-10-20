package com.xiaoyu.common.base.resp;

import com.xiaoyu.common.base.constants.ResponseEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TableResult<T> implements Serializable {

    private static final long serialVersionUID = 6025239649532822925L;

    private String code;
    private String msg;

    private int total;
    private List<T> rows;

    public static TableResult success(List rows, int total) {
        TableResult tableResult = new TableResult();
        tableResult.setRows(rows);
        tableResult.setTotal(total);
        tableResult.setCode(ResponseEnum.SUCCESS.getCode());
        tableResult.setMsg(ResponseEnum.SUCCESS.getMsg());
        return tableResult;
    }

    public static TableResult fail() {
        TableResult tableResult = new TableResult();
        tableResult.setCode(ResponseEnum.FAIL.getCode());
        tableResult.setMsg(ResponseEnum.FAIL.getMsg());
        return tableResult;
    }

    public static TableResult build(String code, String message) {
        TableResult tableResult = new TableResult();
        tableResult.setCode(code);
        tableResult.setMsg(message);
        return tableResult;
    }

    public static TableResult build(String code, String message, List rows) {
        TableResult tableResult = build(code, message);
        tableResult.setRows(rows);
        return tableResult;
    }

    public static TableResult build(ResponseEnum responseEnum) {
        TableResult tableResult = new TableResult();
        tableResult.setCode(responseEnum.getCode());
        tableResult.setMsg(responseEnum.getMsg());
        return tableResult;
    }

}
