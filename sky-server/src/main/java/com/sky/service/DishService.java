package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @Auther: Yves
 * @Date: 2025/12/29 - 12 - 29 - 16:01
 * @Description: com.sky.service
 * @version: 1.0
 */
public interface DishService {

    /**
     * 新增菜品和口味数据
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
