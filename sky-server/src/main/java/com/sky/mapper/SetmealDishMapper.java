package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: Yves
 * @Date: 2025/12/29 - 12 - 29 - 20:11
 * @Description: com.sky.mapper
 * @version: 1.0
 */
@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询对应套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdByDishIds(List<Long> dishIds);
}
