package com.lh.xymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.common.utils.PageUtils;
import com.lh.xymall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-12 21:31:06
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

