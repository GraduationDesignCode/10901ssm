package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuodongchengguoEntity;
import com.entity.view.HuodongchengguoView;

import com.service.HuodongchengguoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 活动成果
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
@RestController
@RequestMapping("/huodongchengguo")
public class HuodongchengguoController {
    @Autowired
    private HuodongchengguoService huodongchengguoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongchengguoEntity huodongchengguo, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			huodongchengguo.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuodongchengguoEntity> ew = new EntityWrapper<HuodongchengguoEntity>();
		PageUtils page = huodongchengguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongchengguo), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongchengguoEntity huodongchengguo, HttpServletRequest request){
        EntityWrapper<HuodongchengguoEntity> ew = new EntityWrapper<HuodongchengguoEntity>();
		PageUtils page = huodongchengguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongchengguo), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongchengguoEntity huodongchengguo){
       	EntityWrapper<HuodongchengguoEntity> ew = new EntityWrapper<HuodongchengguoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongchengguo, "huodongchengguo")); 
        return R.ok().put("data", huodongchengguoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongchengguoEntity huodongchengguo){
        EntityWrapper< HuodongchengguoEntity> ew = new EntityWrapper< HuodongchengguoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongchengguo, "huodongchengguo")); 
		HuodongchengguoView huodongchengguoView =  huodongchengguoService.selectView(ew);
		return R.ok("查询活动成果成功").put("data", huodongchengguoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongchengguoEntity huodongchengguo = huodongchengguoService.selectById(id);
        return R.ok().put("data", huodongchengguo);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongchengguoEntity huodongchengguo = huodongchengguoService.selectById(id);
        return R.ok().put("data", huodongchengguo);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        HuodongchengguoEntity huodongchengguo = huodongchengguoService.selectById(id);
        if(type.equals("1")) {
        	huodongchengguo.setThumbsupnum(huodongchengguo.getThumbsupnum()+1);
        } else {
        	huodongchengguo.setCrazilynum(huodongchengguo.getCrazilynum()+1);
        }
        huodongchengguoService.updateById(huodongchengguo);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongchengguoEntity huodongchengguo, HttpServletRequest request){
    	huodongchengguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongchengguo);

        huodongchengguoService.insert(huodongchengguo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongchengguoEntity huodongchengguo, HttpServletRequest request){
    	huodongchengguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongchengguo);

        huodongchengguoService.insert(huodongchengguo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuodongchengguoEntity huodongchengguo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongchengguo);
        huodongchengguoService.updateById(huodongchengguo);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongchengguoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HuodongchengguoEntity> wrapper = new EntityWrapper<HuodongchengguoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = huodongchengguoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
