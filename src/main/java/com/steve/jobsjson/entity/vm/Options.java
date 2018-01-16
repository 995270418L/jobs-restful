package com.steve.jobsjson.entity.vm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 查询条件
 */
@ApiModel("查询条件")
public class Options {

    @ApiModelProperty(value = "来源",required = true)
    private String source;
    @ApiModelProperty("校招数量")
    private Integer schoolNum;
    @ApiModelProperty("社招数量")
    private Integer socialNum;
    @ApiModelProperty("城市名")
    private String cityName;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(Integer schoolNum) {
        this.schoolNum = schoolNum;
    }

    public Integer getSocialNum() {
        return socialNum;
    }

    public void setSocialNum(Integer socialNum) {
        this.socialNum = socialNum;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
