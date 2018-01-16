package com.steve.jobsjson.entity.vm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 职位信息中含有关键词的职位详情
 */
@ApiModel("职位信息中含有关键词的职位详情")
public class JobInfoKeyword {

    @ApiModelProperty("主键id")
    private String id;

    @ApiModelProperty("名称")
    private String jobName;

    @ApiModelProperty("工资")
    private String jobSalary;

    @ApiModelProperty("城市名")
    private String cityName;

    @ApiModelProperty("经验要求")
    private String jobExper;

    @ApiModelProperty("学历要求")
    private String jobRecord;

    @ApiModelProperty("职位诱惑")
    private String jobAttract;

    @ApiModelProperty("职位描述")
    private String jobDescr;

    @ApiModelProperty("职位信息网址")
    private String jobSite;

    @ApiModelProperty("创建时间")
    private String jobCreateTime;

    @ApiModelProperty("职位所属公司id")
    private String com_id;

    @ApiModelProperty("职位所属公司名称")
    private String com_name;

    @ApiModelProperty("职位所属公司网站")
    private String com_site;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCom_id() {
        return com_id;
    }

    public void setCom_id(String com_id) {
        this.com_id = com_id;
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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public String getCom_site() {
        return com_site;
    }

    public void setCom_site(String com_site) {
        this.com_site = com_site;
    }
}
