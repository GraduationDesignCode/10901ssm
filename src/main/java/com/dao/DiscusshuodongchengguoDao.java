package com.dao;

import com.entity.DiscusshuodongchengguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuodongchengguoVO;
import com.entity.view.DiscusshuodongchengguoView;


/**
 * 活动成果评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface DiscusshuodongchengguoDao extends BaseMapper<DiscusshuodongchengguoEntity> {
	
	List<DiscusshuodongchengguoVO> selectListVO(@Param("ew") Wrapper<DiscusshuodongchengguoEntity> wrapper);
	
	DiscusshuodongchengguoVO selectVO(@Param("ew") Wrapper<DiscusshuodongchengguoEntity> wrapper);
	
	List<DiscusshuodongchengguoView> selectListView(@Param("ew") Wrapper<DiscusshuodongchengguoEntity> wrapper);

	List<DiscusshuodongchengguoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuodongchengguoEntity> wrapper);
	
	DiscusshuodongchengguoView selectView(@Param("ew") Wrapper<DiscusshuodongchengguoEntity> wrapper);
	
}
