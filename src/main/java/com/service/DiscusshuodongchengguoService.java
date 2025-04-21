package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuodongchengguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuodongchengguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuodongchengguoView;


/**
 * 活动成果评论表
 *
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface DiscusshuodongchengguoService extends IService<DiscusshuodongchengguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuodongchengguoVO> selectListVO(Wrapper<DiscusshuodongchengguoEntity> wrapper);
   	
   	DiscusshuodongchengguoVO selectVO(@Param("ew") Wrapper<DiscusshuodongchengguoEntity> wrapper);
   	
   	List<DiscusshuodongchengguoView> selectListView(Wrapper<DiscusshuodongchengguoEntity> wrapper);
   	
   	DiscusshuodongchengguoView selectView(@Param("ew") Wrapper<DiscusshuodongchengguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuodongchengguoEntity> wrapper);
   	
}

