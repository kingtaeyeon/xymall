package com.lh.xymall.order.dao;

import com.lh.xymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-12 21:31:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
