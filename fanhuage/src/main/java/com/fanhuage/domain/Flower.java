package com.fanhuage.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName flower
 */
@TableName(value ="flower")
@Data
public class Flower implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer fid;

    /**
     * 
     */
    private String fname;

    /**
     * 
     */
    private Integer fnum;

    /**
     * 
     */
    private BigDecimal fprice;

    /**
     * 
     */
    private Integer fstatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}