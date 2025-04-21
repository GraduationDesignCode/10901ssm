package com.dao;

import com.entity.HuodongchengguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongchengguoVO;
import com.entity.view.HuodongchengguoView;


/**
 * 活动成果
 * 
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface HuodongchengguoDao extends BaseMapper<HuodongchengguoEntity> {
	
	List<HuodongchengguoVO> selectListVO(@Param("ew") Wrapper<HuodongchengguoEntity> wrapper);
	
	HuodongchengguoVO selectVO(@Param("ew") Wrapper<HuodongchengguoEntity> wrapper);
	
	List<HuodongchengguoView> selectListView(@Param("ew") Wrapper<HuodongchengguoEntity> wrapper);

	List<HuodongchengguoView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongchengguoEntity> wrapper);
	
	HuodongchengguoView selectView(@Param("ew") Wrapper<HuodongchengguoEntity> wrapper);
	
}
