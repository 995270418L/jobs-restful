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
@TableName("job_tag")
public class JobTag extends Model<JobTag> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 工作所属标签类型
     */
	@TableField("tag_name")
	private String tagName;
    /**
     * 信息来源网站(拉勾，智联....)
     */
	@TableField("tag_source")
	private String tagSource;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagSource() {
		return tagSource;
	}

	public void setTagSource(String tagSource) {
		this.tagSource = tagSource;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "JobTag{" +
			", id=" + id +
			", tagName=" + tagName +
			", tagSource=" + tagSource +
			"}";
	}
}
