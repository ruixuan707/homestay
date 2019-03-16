package com.monco.mapper;

import com.monco.entity.HomeInfo;

import java.util.List;

public interface HomeInfoMapper {
    /**
     * @mbg.generated 2019-03-09
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated 2019-03-09
     */
    int insert(HomeInfo record);

    /**
     * @mbg.generated 2019-03-09
     */
    int insertSelective(HomeInfo record);

    /**
     * @mbg.generated 2019-03-09
     */
    HomeInfo selectByPrimaryKey(Long id);

    /**
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKeySelective(HomeInfo record);

    /**
     * @mbg.generated 2019-03-09
     */
    int updateByPrimaryKey(HomeInfo record);


    List<HomeInfo> selectAll(HomeInfo homeInfo);
}