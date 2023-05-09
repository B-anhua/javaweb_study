package com.fanhuage.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler{


    //自动填充当前时间
    @Override
    public void insertFill(MetaObject metaObject) {
        //属性名称不是字段名称
        this.setFieldValByName("createdAt", new Date(),metaObject);
        this.setFieldValByName("createTime", new Date(),metaObject);

        // this.setFieldValByName("createdAt",new Date(),metaObject);

    //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //     String now = LocalDateTime.now().format(formatter);
    //     this.setFieldValByName("createdAt", now, metaObject);
    }

    public static String generateOrderNo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String timestamp = sdf.format(new Date());
        int randomNum = new Random().nextInt(1000000);
        return timestamp + String.format("%06d", randomNum);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // this.setFieldValByName("createdAt",LocalDateTime.now(),metaObject);
    }
}