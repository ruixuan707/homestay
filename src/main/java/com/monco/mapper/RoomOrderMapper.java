package com.monco.mapper;

import com.monco.entity.RoomOrder;

public interface RoomOrderMapper {
    /**
     *
     * @mbg.generated 2019-03-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int insert(RoomOrder record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int insertSelective(RoomOrder record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    RoomOrder selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKeySelective(RoomOrder record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKey(RoomOrder record);
}