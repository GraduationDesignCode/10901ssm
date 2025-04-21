package com.dao;

import com.entity.XuefenchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuefenchengjiVO;
import com.entity.view.XuefenchengjiView;


/**
 * 学分成绩
 * 
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface XuefenchengjiDao extends BaseMapper<XuefenchengjiEntity> {
	
	List<XuefenchengjiVO> selectListVO(@Param("ew") Wrapper<XuefenchengjiEntity> wrapper);
	
	XuefenchengjiVO selectVO(@Param("ew") Wrapper<XuefenchengjiEntity> wrapper);
	
	List<XuefenchengjiView> selectListView(@Param("ew") Wrapper<XuefenchengjiEntity> wrapper);

	List<XuefenchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<XuefenchengjiEntity> wrapper);
	
	XuefenchengjiView selectView(@Param("ew") Wrapper<XuefenchengjiEntity> wrapper);
	
}
