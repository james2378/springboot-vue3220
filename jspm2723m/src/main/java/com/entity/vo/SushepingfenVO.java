package com.entity.vo;

import com.entity.SushepingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宿舍评分
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public class SushepingfenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 是否整洁
	 */
	
	private String shifouzhengjie;
		
	/**
	 * 是否违规
	 */
	
	private String shifouweigui;
		
	/**
	 * 检查内容
	 */
	
	private String jianchaneirong;
		
	/**
	 * 卫生评分
	 */
	
	private Integer weishengpingfen;
		
	/**
	 * 检查结果
	 */
	
	private String jianchajieguo;
		
	/**
	 * 检查日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchariqi;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：宿舍号
	 */
	 
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
				
	
	/**
	 * 设置：是否整洁
	 */
	 
	public void setShifouzhengjie(String shifouzhengjie) {
		this.shifouzhengjie = shifouzhengjie;
	}
	
	/**
	 * 获取：是否整洁
	 */
	public String getShifouzhengjie() {
		return shifouzhengjie;
	}
				
	
	/**
	 * 设置：是否违规
	 */
	 
	public void setShifouweigui(String shifouweigui) {
		this.shifouweigui = shifouweigui;
	}
	
	/**
	 * 获取：是否违规
	 */
	public String getShifouweigui() {
		return shifouweigui;
	}
				
	
	/**
	 * 设置：检查内容
	 */
	 
	public void setJianchaneirong(String jianchaneirong) {
		this.jianchaneirong = jianchaneirong;
	}
	
	/**
	 * 获取：检查内容
	 */
	public String getJianchaneirong() {
		return jianchaneirong;
	}
				
	
	/**
	 * 设置：卫生评分
	 */
	 
	public void setWeishengpingfen(Integer weishengpingfen) {
		this.weishengpingfen = weishengpingfen;
	}
	
	/**
	 * 获取：卫生评分
	 */
	public Integer getWeishengpingfen() {
		return weishengpingfen;
	}
				
	
	/**
	 * 设置：检查结果
	 */
	 
	public void setJianchajieguo(String jianchajieguo) {
		this.jianchajieguo = jianchajieguo;
	}
	
	/**
	 * 获取：检查结果
	 */
	public String getJianchajieguo() {
		return jianchajieguo;
	}
				
	
	/**
	 * 设置：检查日期
	 */
	 
	public void setJianchariqi(Date jianchariqi) {
		this.jianchariqi = jianchariqi;
	}
	
	/**
	 * 获取：检查日期
	 */
	public Date getJianchariqi() {
		return jianchariqi;
	}
			
}
