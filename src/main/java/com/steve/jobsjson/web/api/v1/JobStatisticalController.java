package com.steve.jobsjson.web.api.v1;

import com.github.pagehelper.PageInfo;
import com.steve.jobsjson.entity.vm.JobCityField;
import com.steve.jobsjson.entity.vm.JobInfoKeyword;
import com.steve.jobsjson.service.JobStatisticalService;
import com.steve.jobsjson.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 所有工作统计:
 */
@RestController
@Api(description = "职位数量统计类")
@RequestMapping(value = "/job")
public class JobStatisticalController {

    private JobStatisticalService jobStatisticalService;

    @ApiOperation(value = "具体某个行业对应的城市工作岗位排名",notes =" 如果不传具体行业名，就查询所有数据",response = JobCityField.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="tagName",dataType = "string", paramType = "query")
    })
    @RequestMapping(value = "/statistical/{tagName}",method = RequestMethod.GET)
    public Response<List<JobCityField>> getCityWorkStatistical(@PathVariable("tagName") String tagName){
        return Response.ok(jobStatisticalService.statisticalJobCityField(tagName));
    }

    @ApiOperation(value = "统计职位描述中的关键词相符的职位数量，传入cityName可以得到该关键词在该城市的职位数量信息",notes =" 如果不传cityName，就查询所有城市的数据",response = JobCityField.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="keyword",required = true,dataType = "string", paramType = "query"),
            @ApiImplicitParam(name="cityName",dataType = "string", paramType = "query"),
    })
    @RequestMapping(value="/statistical/{keyword}",method = RequestMethod.GET)
    public Response<List<JobCityField>> getCityWorkNumByKeyword(@PathVariable("keyword") String keyword, @RequestParam("cityName") String cityName){
        return Response.ok(jobStatisticalService.statisticalJobCityFieldInDescOrName(keyword,cityName));
    }

    @ApiOperation(value = "查询指定城市里面符合关键词的职位信息,页面数据大小不传的话默认为20")
    @ApiImplicitParams({
            @ApiImplicitParam(name="keyword",required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name="cityName",dataType = "string", paramType = "query"),
            @ApiImplicitParam(name="start",dataType = "integer", paramType = "query"),
            @ApiImplicitParam(name="size",dataType = "integer", paramType = "query"),
    })
    @RequestMapping(value="/jobinfo",method = RequestMethod.GET)
    public Response<PageInfo<JobInfoKeyword>> selectAllJobInfoWithKeyword(@RequestParam("keyword") String keyword, @RequestParam("cityName") String cityName, @RequestParam("start")Integer start, @RequestParam("size")Integer size){
        return Response.ok(jobStatisticalService.selectAllJobInfoWithKeyword(keyword,cityName,start,size));
    }

}
