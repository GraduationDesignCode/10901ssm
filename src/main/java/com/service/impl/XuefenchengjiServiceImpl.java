package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuefenchengjiDao;
import com.entity.XuefenchengjiEntity;
import com.service.XuefenchengjiService;
import com.entity.vo.XuefenchengjiVO;
import com.entity.view.XuefenchengjiView;

@Service("xuefenchengjiService")
public class XuefenchengjiServiceImpl extends ServiceImpl<XuefenchengjiDao, XuefenchengjiEntity> implements XuefenchengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuefenchengjiEntity> page = this.selectPage(
                new Query<XuefenchengjiEntity>(params).getPage(),
                new EntityWrapper<XuefenchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuefenchengjiEntity> wrapper) {
		  Page<XuefenchengjiView> page =new Query<XuefenchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuefenchengjiVO> selectListVO(Wrapper<XuefenchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuefenchengjiVO selectVO(Wrapper<XuefenchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuefenchengjiView> selectListView(Wrapper<XuefenchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuefenchengjiView selectView(Wrapper<XuefenchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
