package com.steve.jobsjson.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 拉钩网上的公司详情信息
 * </p>
 *
 * @author steve
 * @since 2017-12-31
 */
public class Company extends Model<Company> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("com_id")
	private String comId;
	@TableField("com_name")
	private String comName;
	@TableField("com_process")
	private String comProcess;
	@TableField("com_number")
	private String comNumber;
	@TableField("com_city_id")
	private String comCityId;
	@TableField("com_num_school")
	private Integer comNumSchool;
	@TableField("com_num_social")
	private Integer comNumSocial;
	@TableField("com_site")
	private String comSite;
	@TableField("com_source")
	private String comSource;
	@TableField("com_fullname")
	private String comFullname;
	@TableField("com_address")
	private String comAddress;
	@TableField("com_info")
	private String comInfo;
    /**
     * 公司记录的时间
     */
	@TableField("com_record_time")
	private Date comRecordTime;
	@TableField("com_resume_rate")
	private Integer comResumeRate;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComProcess() {
		return comProcess;
	}

	public void setComProcess(String comProcess) {
		this.comProcess = comProcess;
	}

	public String getComNumber() {
		return comNumber;
	}

	public void setComNumber(String comNumber) {
		this.comNumber = comNumber;
	}

	public String getComCityId() {
		return comCityId;
	}

	public void setComCityId(String comCityId) {
		this.comCityId = comCityId;
	}

	public Integer getComNumSchool() {
		return comNumSchool;
	}

	public void setComNumSchool(Integer comNumSchool) {
		this.comNumSchool = comNumSchool;
	}

	public Integer getComNumSocial() {
		return comNumSocial;
	}

	public void setComNumSocial(Integer comNumSocial) {
		this.comNumSocial = comNumSocial;
	}

	public String getComSite() {
		return comSite;
	}

	public void setComSite(String comSite) {
		this.comSite = comSite;
	}

	public String getComSource() {
		return comSource;
	}

	public void setComSource(String comSource) {
		this.comSource = comSource;
	}

	public String getComFullname() {
		return comFullname;
	}

	public void setComFullname(String comFullname) {
		this.comFullname = comFullname;
	}

	public String getComAddress() {
		return comAddress;
	}

	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}

	public String getComInfo() {
		return comInfo;
	}

	public void setComInfo(String comInfo) {
		this.comInfo = comInfo;
	}

	public Date getComRecordTime() {
		return comRecordTime;
	}

	public void setComRecordTime(Date comRecordTime) {
		this.comRecordTime = comRecordTime;
	}

	public Integer getComResumeRate() {
		return comResumeRate;
	}

	public void setComResumeRate(Integer comResumeRate) {
		this.comResumeRate = comResumeRate;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Company{" +
			", id=" + id +
			", comId=" + comId +
			", comName=" + comName +
			", comProcess=" + comProcess +
			", comNumber=" + comNumber +
			", comCityId=" + comCityId +
			", comNumSchool=" + comNumSchool +
			", comNumSocial=" + comNumSocial +
			", comSite=" + comSite +
			", comSource=" + comSource +
			", comFullname=" + comFullname +
			", comAddress=" + comAddress +
			", comInfo=" + comInfo +
			", comRecordTime=" + comRecordTime +
			", comResumeRate=" + comResumeRate +
			"}";
	}
}
