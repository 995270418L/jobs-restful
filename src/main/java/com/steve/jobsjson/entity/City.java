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
@TableName("city")
public class City extends Model<City> {

    private static final long serialVersionUID = 1L;

	private String id;

	@TableField("city_name")
	private String cityName;

	@TableField("city_id")
	private String cityId;

	@TableField("city_source")
	private String citySource;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCitySource() {
		return citySource;
	}

	public void setCitySource(String citySource) {
		this.citySource = citySource;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "City{" +
			", id=" + id +
			", cityName=" + cityName +
			", cityId=" + cityId +
			", citySource=" + citySource +
			"}";
	}
}
