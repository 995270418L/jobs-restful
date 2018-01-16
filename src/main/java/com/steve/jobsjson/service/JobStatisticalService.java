package com.steve.jobsjson.service;

import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.steve.jobsjson.entity.vm.JobCityField;
import com.steve.jobsjson.entity.vm.JobInfoKeyword;
import com.steve.jobsjson.mapper.JobMapper;
import com.steve.jobsjson.util.exceptions.DataValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@Service
public class JobStatisticalService {

    @Autowired
    private JobMapper jobMapper;

    /**
     * 统计每个行业在各个城市中的工作数量
     * @return
     */
    public List<JobCityField> statisticalJobCityField(String tagName){
        return jobMapper.statisticalJobCityField(tagName);
    }

    /**
     *  统计指定城市的职位中工作描述中含有关键词 keyword 或者工作名称中含有关键词 keyword 的职位数量
     * @param keyword
     * @param cityName
     * @return
     */
    public List<JobCityField> statisticalJobCityFieldInDescOrName(String keyword, String cityName){
        if(StringUtils.isEmpty(keyword)){
            throw new DataValidationException("职位关键词不能为空");
        }
        return jobMapper.statisticalJobCityFieldInDescOrName(keyword,cityName);
    }

    /**
     * 查询指定城市里面符合关键词的职位信息
     * @param keyword
     * @param cityName
     * @return
     */
    public PageInfo<JobInfoKeyword> selectAllJobInfoWithKeyword(String keyword, String cityName, Integer start, Integer size){
        if ( size == null && size == 0){
            size = 20;
        }
        if(StringUtils.isEmpty(keyword)){
            throw new DataValidationException("关键词不能为空");
        }
        if(StringUtils.isEmpty(cityName)){
            throw new DataValidationException("城市名不能为空");
        }
        PageHelper.startPage(start,size);
        List<JobInfoKeyword> result  = jobMapper.selectAllJobInfoWithKeyword(keyword,cityName);
        return new PageInfo<JobInfoKeyword>(result);
    }

}
