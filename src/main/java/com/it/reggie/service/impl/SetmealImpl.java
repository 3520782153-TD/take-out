package com.it.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.reggie.entity.Dish;
import com.it.reggie.entity.Setmeal;
import com.it.reggie.mapper.SetmealMapper;
import com.it.reggie.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
