package com.steve.jobsjson.entity.vm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 统计各行各业所在城市的工作数量
 */
@ApiModel
public class JobCityField {

    /**
     * 工作标签（类型）
     */
    @ApiModelProperty("工作所属类别: java,vue")
    private String jobTag;

    /**
     * 工作所在城市
     */
    @ApiModelProperty("城市名")
    private String cityName;

    /**
     * 工作数量
     */
    @ApiModelProperty("职位数量")
    private long count;

    public String getJobTag() {
        return jobTag;
    }

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
