package com.monco.mapper;

import com.monco.entity.RoomInfo;

public interface RoomInfoMapper {
    /**
     *
     * @mbg.generated 2019-03-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int insert(RoomInfo record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int insertSelective(RoomInfo record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    RoomInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKeySelective(RoomInfo record);

    /**
     *
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKey(RoomInfo record);
}