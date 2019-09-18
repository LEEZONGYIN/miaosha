package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.SequenceDO;
import org.springframework.stereotype.Component;

@Component
public interface SequenceDOMapper {
    int deleteByPrimaryKey(String name);

    int insert(SequenceDO record);

    int insertSelective(SequenceDO record);

    SequenceDO selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(SequenceDO record);

    int updateByPrimaryKey(SequenceDO record);

    SequenceDO getSequenceByName(String name);
}