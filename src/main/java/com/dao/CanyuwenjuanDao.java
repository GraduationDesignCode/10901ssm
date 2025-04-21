package com.dao;

import com.entity.CanyuwenjuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanyuwenjuanVO;
import com.entity.view.CanyuwenjuanView;


/**
 * 参与问卷
 * 
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface CanyuwenjuanDao extends BaseMapper<CanyuwenjuanEntity> {
	
	List<CanyuwenjuanVO> selectListVO(@Param("ew") Wrapper<CanyuwenjuanEntity> wrapper);
	
	CanyuwenjuanVO selectVO(@Param("ew") Wrapper<CanyuwenjuanEntity> wrapper);
	
	List<CanyuwenjuanView> selectListView(@Param("ew") Wrapper<CanyuwenjuanEntity> wrapper);

	List<CanyuwenjuanView> selectListView(Pagination page,@Param("ew") Wrapper<CanyuwenjuanEntity> wrapper);
	
	CanyuwenjuanView selectView(@Param("ew") Wrapper<CanyuwenjuanEntity> wrapper);
	
}
