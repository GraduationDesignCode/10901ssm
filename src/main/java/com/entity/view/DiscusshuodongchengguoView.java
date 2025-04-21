package com.entity.view;

import com.entity.DiscusshuodongchengguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动成果评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
@TableName("discusshuodongchengguo")
public class DiscusshuodongchengguoView  extends DiscusshuodongchengguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshuodongchengguoView(){
	}
 
 	public DiscusshuodongchengguoView(DiscusshuodongchengguoEntity discusshuodongchengguoEntity){
 	try {
			BeanUtils.copyProperties(this, discusshuodongchengguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
