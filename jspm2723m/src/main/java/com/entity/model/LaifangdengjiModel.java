package com.entity.model;

import com.entity.LaifangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 来访登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
public class LaifangdengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 访客姓名
	 */
	
	private String fangkexingming;
		
	/**
	 * 来访人数
	 */
	
	private Integer laifangrenshu;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 来访学生
	 */
	
	private String laifangxuesheng;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 来访目的
	 */
	
	private String laifangmude;
		
	/**
	 * 来访时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date laifangshijian;
				
	
	/**
	 * 设置：访客姓名
	 */
	 
	public void setFangkexingming(String fangkexingming) {
		this.fangkexingming = fangkexingming;
	}
	
	/**
	 * 获取：访客姓名
	 */
	public String getFangkexingming() {
		return fangkexingming;
	}
				
	
	/**
	 * 设置：来访人数
	 */
	 
	public void setLaifangrenshu(Integer laifangrenshu) {
		this.laifangrenshu = laifangrenshu;
	}
	
	/**
	 * 获取：来访人数
	 */
	public Integer getLaifangrenshu() {
		return laifangrenshu;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：来访学生
	 */
	 
	public void setLaifangxuesheng(String laifangxuesheng) {
		this.laifangxuesheng = laifangxuesheng;
	}
	
	/**
	 * 获取：来访学生
	 */
	public String getLaifangxuesheng() {
		return laifangxuesheng;
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
	 * 设置：来访目的
	 */
	 
	public void setLaifangmude(String laifangmude) {
		this.laifangmude = laifangmude;
	}
	
	/**
	 * 获取：来访目的
	 */
	public String getLaifangmude() {
		return laifangmude;
	}
				
	
	/**
	 * 设置：来访时间
	 */
	 
	public void setLaifangshijian(Date laifangshijian) {
		this.laifangshijian = laifangshijian;
	}
	
	/**
	 * 获取：来访时间
	 */
	public Date getLaifangshijian() {
		return laifangshijian;
	}
			
}
