package com.entity.view;

import com.entity.HuodongchengguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动成果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
@TableName("huodongchengguo")
public class HuodongchengguoView  extends HuodongchengguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongchengguoView(){
	}
 
 	public HuodongchengguoView(HuodongchengguoEntity huodongchengguoEntity){
 	try {
			BeanUtils.copyProperties(this, huodongchengguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
