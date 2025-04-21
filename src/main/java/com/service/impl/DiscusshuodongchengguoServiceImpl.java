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


import com.dao.DiscusshuodongchengguoDao;
import com.entity.DiscusshuodongchengguoEntity;
import com.service.DiscusshuodongchengguoService;
import com.entity.vo.DiscusshuodongchengguoVO;
import com.entity.view.DiscusshuodongchengguoView;

@Service("discusshuodongchengguoService")
public class DiscusshuodongchengguoServiceImpl extends ServiceImpl<DiscusshuodongchengguoDao, DiscusshuodongchengguoEntity> implements DiscusshuodongchengguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuodongchengguoEntity> page = this.selectPage(
                new Query<DiscusshuodongchengguoEntity>(params).getPage(),
                new EntityWrapper<DiscusshuodongchengguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuodongchengguoEntity> wrapper) {
		  Page<DiscusshuodongchengguoView> page =new Query<DiscusshuodongchengguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuodongchengguoVO> selectListVO(Wrapper<DiscusshuodongchengguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuodongchengguoVO selectVO(Wrapper<DiscusshuodongchengguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuodongchengguoView> selectListView(Wrapper<DiscusshuodongchengguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuodongchengguoView selectView(Wrapper<DiscusshuodongchengguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
