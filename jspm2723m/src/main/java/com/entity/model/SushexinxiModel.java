package com.entity.model;

import com.entity.SushexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宿舍信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-30 15:36:49
 */
public class SushexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 宿舍类型
	 */
	
	private String susheleixing;
		
	/**
	 * 楼栋
	 */
	
	private String loudong;
		
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 宿舍成员
	 */
	
	private String sushechengyuan;
				
	
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
				
	
	/**
	 * 设置：宿舍类型
	 */
	 
	public void setSusheleixing(String susheleixing) {
		this.susheleixing = susheleixing;
	}
	
	/**
	 * 获取：宿舍类型
	 */
	public String getSusheleixing() {
		return susheleixing;
	}
				
	
	/**
	 * 设置：楼栋
	 */
	 
	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}
	
	/**
	 * 获取：楼栋
	 */
	public String getLoudong() {
		return loudong;
	}
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
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
	 * 设置：宿舍成员
	 */
	 
	public void setSushechengyuan(String sushechengyuan) {
		this.sushechengyuan = sushechengyuan;
	}
	
	/**
	 * 获取：宿舍成员
	 */
	public String getSushechengyuan() {
		return sushechengyuan;
	}
			
}
