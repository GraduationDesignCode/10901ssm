package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanyuwenjuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanyuwenjuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanyuwenjuanView;


/**
 * 参与问卷
 *
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface CanyuwenjuanService extends IService<CanyuwenjuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyuwenjuanVO> selectListVO(Wrapper<CanyuwenjuanEntity> wrapper);
   	
   	CanyuwenjuanVO selectVO(@Param("ew") Wrapper<CanyuwenjuanEntity> wrapper);
   	
   	List<CanyuwenjuanView> selectListView(Wrapper<CanyuwenjuanEntity> wrapper);
   	
   	CanyuwenjuanView selectView(@Param("ew") Wrapper<CanyuwenjuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyuwenjuanEntity> wrapper);
   	
}

