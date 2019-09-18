package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.OrderDO;
import org.springframework.stereotype.Component;

@Component
public interface OrderDOMapper {
    int insert(OrderDO record);

    int insertSelective(OrderDO record);
}