package com.steve.jobsjson.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author steve
 * @since 2017-12-31
 */
@TableName("job_tag_r")
public class JobTagR extends Model<JobTagR> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("job_id")
	private String jobId;
	@TableField("tag_id")
	private String tagId;


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

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "JobTagR{" +
			", id=" + id +
			", jobId=" + jobId +
			", tagId=" + tagId +
			"}";
	}
}
