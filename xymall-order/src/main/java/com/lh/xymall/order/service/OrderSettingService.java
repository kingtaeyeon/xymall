package com.lh.xymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.common.utils.PageUtils;
import com.lh.xymall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-12 21:31:06
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

