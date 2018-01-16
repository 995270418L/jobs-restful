package com.steve.jobsjson.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.steve.jobsjson.entity.Company;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 拉钩网上的公司详情信息 Mapper 接口
 * </p>
 *
 * @author steve
 * @since 2017-12-31
 */
@Mapper
public interface CompanyMapper extends BaseMapper<Company> {

}
