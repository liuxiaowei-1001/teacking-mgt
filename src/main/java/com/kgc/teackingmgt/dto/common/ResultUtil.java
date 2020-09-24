package com.kgc.teackingmgt.dto.common;

public class ResultUtil {

    public static ResultDto returnSuccess(){
        ResultDto dto = new ResultDto();
        dto.setCode(200);
        return dto;
    }

    public static ResultDto returnSuccess(String msg){
        ResultDto dto = new ResultDto();
        dto.setCode(200);
        dto.setMsg(msg);
        return dto;
    }

    public static ResultDto returnSuccess(String msg,Object data){
        ResultDto dto = new ResultDto();
        dto.setCode(200);
        dto.setMsg(msg);
        dto.setData(data);
        return dto;
    }

    public static ResultDto returnDataSuccess(Object data){
        ResultDto dto = new ResultDto();
        dto.setCode(200);
        dto.setData(data);
        return dto;
    }

    public static ResultDto returnFailed(int code,String msg){
        ResultDto dto = new ResultDto();
        dto.setCode(code);
        dto.setMsg(msg);
        return dto;
    }

}
