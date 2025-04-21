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


import com.dao.CanyuwenjuanDao;
import com.entity.CanyuwenjuanEntity;
import com.service.CanyuwenjuanService;
import com.entity.vo.CanyuwenjuanVO;
import com.entity.view.CanyuwenjuanView;

@Service("canyuwenjuanService")
public class CanyuwenjuanServiceImpl extends ServiceImpl<CanyuwenjuanDao, CanyuwenjuanEntity> implements CanyuwenjuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyuwenjuanEntity> page = this.selectPage(
                new Query<CanyuwenjuanEntity>(params).getPage(),
                new EntityWrapper<CanyuwenjuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyuwenjuanEntity> wrapper) {
		  Page<CanyuwenjuanView> page =new Query<CanyuwenjuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanyuwenjuanVO> selectListVO(Wrapper<CanyuwenjuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanyuwenjuanVO selectVO(Wrapper<CanyuwenjuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanyuwenjuanView> selectListView(Wrapper<CanyuwenjuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyuwenjuanView selectView(Wrapper<CanyuwenjuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
