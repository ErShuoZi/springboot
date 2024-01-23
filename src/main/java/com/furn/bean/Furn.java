package com.furn.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "furn2")
public class Furn {
    //type = IdType.AUTO 表示id自增
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String maker;
    private Double price;
    private Integer sales;
    private Integer stock;
}
