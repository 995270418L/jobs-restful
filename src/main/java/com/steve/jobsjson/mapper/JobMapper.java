package com.steve.jobsjson.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.steve.jobsjson.entity.Job;
import com.steve.jobsjson.entity.vm.JobCityField;
import com.steve.jobsjson.entity.vm.JobInfoKeyword;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 拉钩的工作职位类型 Mapper 接口
 * </p>
 *
 * @author steve
 * @since 2017-12-31
 */
@Mapper
public interface JobMapper extends BaseMapper<Job> {

    List<JobCityField> statisticalJobCityField(@Param("tagName")String tagName);

    List<JobCityField> statisticalJobCityFieldInDescOrName(@Param("keyword")String keyword, @Param("cityName")String cityName);

    List<JobInfoKeyword> selectAllJobInfoWithKeyword(@Param("keyword") String keyword, @Param("cityName") String cityName);
}
