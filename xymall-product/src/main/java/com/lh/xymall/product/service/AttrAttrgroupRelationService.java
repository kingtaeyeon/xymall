package com.lh.xymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.common.utils.PageUtils;
import com.lh.xymall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-11 23:19:47
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

