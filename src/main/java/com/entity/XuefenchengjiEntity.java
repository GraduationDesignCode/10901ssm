package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学分成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
@TableName("xuefenchengji")
public class XuefenchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuefenchengjiEntity() {
		
	}
	
	public XuefenchengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 社会实践
	 */
					
	private Integer shehuishijian;
	
	/**
	 * 社工社团
	 */
					
	private Integer shegongshetuan;
	
	/**
	 * 演讲沟通
	 */
					
	private Integer yanjianggoutong;
	
	/**
	 * 综合写作
	 */
					
	private Integer zonghexiezuo;
	
	/**
	 * 参加讲座
	 */
					
	private Integer canjiajiangzuo;
	
	/**
	 * 读书活动
	 */
					
	private Integer dushuhuodong;
	
	/**
	 * 科技文化
	 */
					
	private Integer kejiwenhua;
	
	/**
	 * 综合得分
	 */
					
	private Integer zonghedefen;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：社会实践
	 */
	public void setShehuishijian(Integer shehuishijian) {
		this.shehuishijian = shehuishijian;
	}
	/**
	 * 获取：社会实践
	 */
	public Integer getShehuishijian() {
		return shehuishijian;
	}
	/**
	 * 设置：社工社团
	 */
	public void setShegongshetuan(Integer shegongshetuan) {
		this.shegongshetuan = shegongshetuan;
	}
	/**
	 * 获取：社工社团
	 */
	public Integer getShegongshetuan() {
		return shegongshetuan;
	}
	/**
	 * 设置：演讲沟通
	 */
	public void setYanjianggoutong(Integer yanjianggoutong) {
		this.yanjianggoutong = yanjianggoutong;
	}
	/**
	 * 获取：演讲沟通
	 */
	public Integer getYanjianggoutong() {
		return yanjianggoutong;
	}
	/**
	 * 设置：综合写作
	 */
	public void setZonghexiezuo(Integer zonghexiezuo) {
		this.zonghexiezuo = zonghexiezuo;
	}
	/**
	 * 获取：综合写作
	 */
	public Integer getZonghexiezuo() {
		return zonghexiezuo;
	}
	/**
	 * 设置：参加讲座
	 */
	public void setCanjiajiangzuo(Integer canjiajiangzuo) {
		this.canjiajiangzuo = canjiajiangzuo;
	}
	/**
	 * 获取：参加讲座
	 */
	public Integer getCanjiajiangzuo() {
		return canjiajiangzuo;
	}
	/**
	 * 设置：读书活动
	 */
	public void setDushuhuodong(Integer dushuhuodong) {
		this.dushuhuodong = dushuhuodong;
	}
	/**
	 * 获取：读书活动
	 */
	public Integer getDushuhuodong() {
		return dushuhuodong;
	}
	/**
	 * 设置：科技文化
	 */
	public void setKejiwenhua(Integer kejiwenhua) {
		this.kejiwenhua = kejiwenhua;
	}
	/**
	 * 获取：科技文化
	 */
	public Integer getKejiwenhua() {
		return kejiwenhua;
	}
	/**
	 * 设置：综合得分
	 */
	public void setZonghedefen(Integer zonghedefen) {
		this.zonghedefen = zonghedefen;
	}
	/**
	 * 获取：综合得分
	 */
	public Integer getZonghedefen() {
		return zonghedefen;
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

}
