package com.entity.vo;

import com.entity.CanyuwenjuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 参与问卷
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public class CanyuwenjuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 回复文件
	 */
	
	private String huifuwenjian;
		
	/**
	 * 意见建议
	 */
	
	private String yijianjianyi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：回复文件
	 */
	 
	public void setHuifuwenjian(String huifuwenjian) {
		this.huifuwenjian = huifuwenjian;
	}
	
	/**
	 * 获取：回复文件
	 */
	public String getHuifuwenjian() {
		return huifuwenjian;
	}
				
	
	/**
	 * 设置：意见建议
	 */
	 
	public void setYijianjianyi(String yijianjianyi) {
		this.yijianjianyi = yijianjianyi;
	}
	
	/**
	 * 获取：意见建议
	 */
	public String getYijianjianyi() {
		return yijianjianyi;
	}
			
}
