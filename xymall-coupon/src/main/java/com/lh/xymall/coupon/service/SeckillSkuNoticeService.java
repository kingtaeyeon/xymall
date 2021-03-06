package com.lh.xymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.common.utils.PageUtils;
import com.lh.xymall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-12 21:07:02
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

