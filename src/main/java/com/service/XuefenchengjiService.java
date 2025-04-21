package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuefenchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuefenchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuefenchengjiView;


/**
 * 学分成绩
 *
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public interface XuefenchengjiService extends IService<XuefenchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuefenchengjiVO> selectListVO(Wrapper<XuefenchengjiEntity> wrapper);
   	
   	XuefenchengjiVO selectVO(@Param("ew") Wrapper<XuefenchengjiEntity> wrapper);
   	
   	List<XuefenchengjiView> selectListView(Wrapper<XuefenchengjiEntity> wrapper);
   	
   	XuefenchengjiView selectView(@Param("ew") Wrapper<XuefenchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuefenchengjiEntity> wrapper);
   	
}

