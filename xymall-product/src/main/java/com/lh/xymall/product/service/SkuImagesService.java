package com.lh.xymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.common.utils.PageUtils;
import com.lh.xymall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-11 23:19:47
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

