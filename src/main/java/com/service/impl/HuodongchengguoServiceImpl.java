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


import com.dao.HuodongchengguoDao;
import com.entity.HuodongchengguoEntity;
import com.service.HuodongchengguoService;
import com.entity.vo.HuodongchengguoVO;
import com.entity.view.HuodongchengguoView;

@Service("huodongchengguoService")
public class HuodongchengguoServiceImpl extends ServiceImpl<HuodongchengguoDao, HuodongchengguoEntity> implements HuodongchengguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongchengguoEntity> page = this.selectPage(
                new Query<HuodongchengguoEntity>(params).getPage(),
                new EntityWrapper<HuodongchengguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongchengguoEntity> wrapper) {
		  Page<HuodongchengguoView> page =new Query<HuodongchengguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongchengguoVO> selectListVO(Wrapper<HuodongchengguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongchengguoVO selectVO(Wrapper<HuodongchengguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongchengguoView> selectListView(Wrapper<HuodongchengguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongchengguoView selectView(Wrapper<HuodongchengguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
