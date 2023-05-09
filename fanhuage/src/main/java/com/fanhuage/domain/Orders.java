package com.fanhuage.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName order
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    /**
     * 
     */
    @TableId
    private String orderId;

    /**
     * 
     */
    private String customerName;

    private String OrderName;

    /**
     * 
     */
    private String orderAddress;

    private String orderPhone;


    /**
     * 
     */
    private Integer orderStatus;

    /**
     * 
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date createTime;


    private Integer orderNum;


    private Double orderAmount;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}