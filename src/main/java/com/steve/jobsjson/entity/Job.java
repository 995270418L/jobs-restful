package com.steve.jobsjson.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 拉钩的工作职位类型
 * </p>
 *
 * @author steve
 * @since 2017-12-31
 */
public class Job extends Model<Job> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("job_id")
	private String jobId;
	@TableField("job_name")
	private String jobName;
	@TableField("job_salary")
	private String jobSalary;
	@TableField("job_place_id")
	private String jobPlaceId;
	@TableField("job_exper")
	private String jobExper;
	@TableField("job_record")
	private String jobRecord;
	@TableField("job_attract")
	private String jobAttract;
	@TableField("job_descr")
	private String jobDescr;
	@TableField("job_site")
	private String jobSite;
	@TableField("job_create_time")
	private String jobCreateTime;
    /**
     * 公司id
     */
	@TableField("com_id")
	private String comId;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(String jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getJobPlaceId() {
		return jobPlaceId;
	}

	public void setJobPlaceId(String jobPlaceId) {
		this.jobPlaceId = jobPlaceId;
	}

	public String getJobExper() {
		return jobExper;
	}

	public void setJobExper(String jobExper) {
		this.jobExper = jobExper;
	}

	public String getJobRecord() {
		return jobRecord;
	}

	public void setJobRecord(String jobRecord) {
		this.jobRecord = jobRecord;
	}

	public String getJobAttract() {
		return jobAttract;
	}

	public void setJobAttract(String jobAttract) {
		this.jobAttract = jobAttract;
	}

	public String getJobDescr() {
		return jobDescr;
	}

	public void setJobDescr(String jobDescr) {
		this.jobDescr = jobDescr;
	}

	public String getJobSite() {
		return jobSite;
	}

	public void setJobSite(String jobSite) {
		this.jobSite = jobSite;
	}

	public String getJobCreateTime() {
		return jobCreateTime;
	}

	public void setJobCreateTime(String jobCreateTime) {
		this.jobCreateTime = jobCreateTime;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Job{" +
			", id=" + id +
			", jobId=" + jobId +
			", jobName=" + jobName +
			", jobSalary=" + jobSalary +
			", jobPlaceId=" + jobPlaceId +
			", jobExper=" + jobExper +
			", jobRecord=" + jobRecord +
			", jobAttract=" + jobAttract +
			", jobDescr=" + jobDescr +
			", jobSite=" + jobSite +
			", jobCreateTime=" + jobCreateTime +
			", comId=" + comId +
			"}";
	}
}
