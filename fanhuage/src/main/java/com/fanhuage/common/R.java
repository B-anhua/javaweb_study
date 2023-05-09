package com.fanhuage.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: fanhuage
 * @className: R
 * @version: 1.0
 * @description:
 * @author: LuoJie
 * @date: 2023-04-26 19:28
 */
@Data
public class R<T>{
    private  Integer code;//编码：1成功0和其他数字失败
    private String msg;//错误信息
    private T data;//数据
    private Map map = new HashMap<>();//动态数据


    public static<T>R<T> success(T object){
        R<T> r = new R<T>();
        r.data =object;
        r.code = 1;
        return r;
    }

    public static<T>R<T> error(String msg){
        R<T> r = new R<T>();
        r.msg =msg;
        r.code = 0;
        return r;
    }


    public R<T> add(String key, Object value){
       this.map.put(key,value);
       return this;
    }
}
