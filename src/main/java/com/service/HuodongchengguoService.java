package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongchengguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongchengguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongchengguoView;


/**
 * 活动成果
 *
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface HuodongchengguoService extends IService<HuodongchengguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongchengguoVO> selectListVO(Wrapper<HuodongchengguoEntity> wrapper);
   	
   	HuodongchengguoVO selectVO(@Param("ew") Wrapper<HuodongchengguoEntity> wrapper);
   	
   	List<HuodongchengguoView> selectListView(Wrapper<HuodongchengguoEntity> wrapper);
   	
   	HuodongchengguoView selectView(@Param("ew") Wrapper<HuodongchengguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongchengguoEntity> wrapper);
   	
}

