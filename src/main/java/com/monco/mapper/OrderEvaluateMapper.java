package com.monco.mapper;

import com.monco.entity.OrderEvaluate;

public interface OrderEvaluateMapper {
    /**
     *
     * @mbg.generated 2019-03-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int insert(OrderEvaluate record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int insertSelective(OrderEvaluate record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    OrderEvaluate selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKeySelective(OrderEvaluate record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKey(OrderEvaluate record);
}