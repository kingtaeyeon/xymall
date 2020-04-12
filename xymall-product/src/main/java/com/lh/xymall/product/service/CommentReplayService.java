package com.lh.xymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.common.utils.PageUtils;
import com.lh.xymall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-11 23:19:47
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

