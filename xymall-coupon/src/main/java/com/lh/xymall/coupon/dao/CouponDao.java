package com.lh.xymall.coupon.dao;

import com.lh.xymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-12 21:07:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
