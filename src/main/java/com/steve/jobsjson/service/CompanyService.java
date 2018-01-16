package com.steve.jobsjson.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.steve.jobsjson.entity.City;
import com.steve.jobsjson.entity.Company;
import com.steve.jobsjson.entity.Users;
import com.steve.jobsjson.mapper.UsersMapper;
import com.steve.jobsjson.util.exceptions.DataValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.UUID;

@Service
public class CompanyService {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 按条件统计公司数量
     * @param cityName
     * @param schoolNum
     * @param socialNum
     * @param source
     * @return
     */
    public Integer statisticalAllCompany(String source, Integer schoolNum, Integer socialNum, String cityName){
        Company company = new Company();
        City city = new City();
        if(StringUtils.isEmpty(source)){
            source = "拉勾";
        }
        if(StringUtils.isEmpty(schoolNum)){
            schoolNum = 0;
        }
        if(StringUtils.isEmpty(socialNum)){
            socialNum = 0;
        }
        if(!StringUtils.isEmpty(cityName)){
            City newCity = city.selectOne(
                    new EntityWrapper().eq("city_name",cityName)
            );
            if(StringUtils.isEmpty(newCity)){
                throw  new DataValidationException("城市名字错了");
            }
            String cityId = newCity.getCityId();
            return company.selectCount(
                    new EntityWrapper().eq("com_source",source)
                            .ge("com_num_school",schoolNum)
                            .ge("com_num_social",socialNum)
                            .eq("com_city_id",cityId)
            );
        }
        return company.selectCount(
                new EntityWrapper().eq("com_source",source)
                        .ge("com_num_school",schoolNum)
                        .ge("com_num_social",socialNum)
        );
    }

    public void save(String name, Integer age, Boolean sex) {
        Users users = new Users();
        users.setId(UUID.randomUUID().toString());
        users.setName(name);
        users.setAge(age);
        users.setSex(sex);

        usersMapper.insert(users);
    }

    public static void main(String[] args) {
        Users user = new Users();
        user.setName("");
        Optional<Users> result = Optional.ofNullable(user);
        System.out.println(result.map(Users::getName).orElse("控制"));
    }
}
