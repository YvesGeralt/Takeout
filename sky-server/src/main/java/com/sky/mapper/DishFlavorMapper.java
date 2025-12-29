package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: Yves
 * @Date: 2025/12/29 - 12 - 29 - 16:20
 * @Description: com.sky.mapper
 * @version: 1.0
 */
@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
