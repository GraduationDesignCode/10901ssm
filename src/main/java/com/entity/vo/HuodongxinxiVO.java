package com.entity.vo;

import com.entity.HuodongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 活动信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
public class HuodongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动类型
	 */
	
	private String huodongleixing;
		
	/**
	 * 活动目标
	 */
	
	private String huodongmubiao;
		
	/**
	 * 主办单位
	 */
	
	private String zhubandanwei;
		
	/**
	 * 预计人数
	 */
	
	private Integer yujirenshu;
		
	/**
	 * 活动内容
	 */
	
	private String huodongneirong;
		
	/**
	 * 活动地点
	 */
	
	private String huodongdidian;
		
	/**
	 * 活动日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huodongriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：活动类型
	 */
	 
	public void setHuodongleixing(String huodongleixing) {
		this.huodongleixing = huodongleixing;
	}
	
	/**
	 * 获取：活动类型
	 */
	public String getHuodongleixing() {
		return huodongleixing;
	}
				
	
	/**
	 * 设置：活动目标
	 */
	 
	public void setHuodongmubiao(String huodongmubiao) {
		this.huodongmubiao = huodongmubiao;
	}
	
	/**
	 * 获取：活动目标
	 */
	public String getHuodongmubiao() {
		return huodongmubiao;
	}
				
	
	/**
	 * 设置：主办单位
	 */
	 
	public void setZhubandanwei(String zhubandanwei) {
		this.zhubandanwei = zhubandanwei;
	}
	
	/**
	 * 获取：主办单位
	 */
	public String getZhubandanwei() {
		return zhubandanwei;
	}
				
	
	/**
	 * 设置：预计人数
	 */
	 
	public void setYujirenshu(Integer yujirenshu) {
		this.yujirenshu = yujirenshu;
	}
	
	/**
	 * 获取：预计人数
	 */
	public Integer getYujirenshu() {
		return yujirenshu;
	}
				
	
	/**
	 * 设置：活动内容
	 */
	 
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	
	/**
	 * 获取：活动内容
	 */
	public String getHuodongneirong() {
		return huodongneirong;
	}
				
	
	/**
	 * 设置：活动地点
	 */
	 
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	
	/**
	 * 获取：活动地点
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
				
	
	/**
	 * 设置：活动日期
	 */
	 
	public void setHuodongriqi(Date huodongriqi) {
		this.huodongriqi = huodongriqi;
	}
	
	/**
	 * 获取：活动日期
	 */
	public Date getHuodongriqi() {
		return huodongriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
