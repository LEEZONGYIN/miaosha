package com.miaoshaproject.service.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderModel {

    //用户下单的交易流水号
    private String id;

    //购买的用户id
    private Integer userId;

    //购买的商品id
    private Integer itemId;

    //购买数量
    private Integer amount;

    //购买金额，若promoId非空，则表示秒杀商品价格
    private BigDecimal orderPrice;

    //单品单价,若promoId非空，则表示秒杀商品价格
    private BigDecimal itemPrice;

    //若非空，则表示是以秒杀商品方式下单
    private  Integer promoId;
}
