package com.mkl.gulimall.member.dao;

import com.mkl.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author makaloo
 * @email xiehj1997@gmail.com
 * @date 2020-12-19 20:10:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
