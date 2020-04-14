package com.lh.xymall.member.dao;

import com.lh.xymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lihao
 * @email lihao@gmail.com
 * @date 2020-04-12 21:16:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
