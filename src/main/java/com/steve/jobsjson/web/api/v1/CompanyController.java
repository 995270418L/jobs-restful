package com.steve.jobsjson.web.api.v1;

import com.google.common.util.concurrent.RateLimiter;
import com.steve.jobsjson.mapper.UsersMapper;
import com.steve.jobsjson.service.CompanyService;
import com.steve.jobsjson.util.CookieUtil;
import com.steve.jobsjson.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.UUID;

@Api(description="公司相关统计信息")
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @ApiOperation(value = "统计某平台的所有公司数量，可以加条件限制",notes ="schoolNum为校招职位限制条件，socialNum社招职位限制条件，条件为大于等于.cityName 为城市名",response = Integer.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="source",required = true,dataType = "string", paramType = "query"),
            @ApiImplicitParam(name="schoolNum",dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name="socialNum",dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name="cityName",dataType = "string", paramType = "query"),
    })
    @RequestMapping(value="/statistical/all",method = RequestMethod.GET)
    public Response<Integer> statisticalAllCompany( String source,Integer schoolNum,Integer socialNum,String cityName){
        return Response.ok(companyService.statisticalAllCompany(source,schoolNum,socialNum,cityName));
    }

//    /**
//     *  接口访问限流
//     * @return
//     */
//    @RequestMapping(value="/one",method = RequestMethod.GET)
//    public String hello(HttpServletRequest request, HttpServletResponse response){
////        if(CookieUtil.containCookie("uid",request)){
////            return "接口已做限流处理，请勿重复提交表单";
////        }else{
////            CookieUtil.writeCookie("uid", UUID.randomUUID().toString(),request,response);
////            return "hello";
////        }
//        RateLimiter rateLimiter = RateLimiter.create(2.0);
//        rateLimiter.acquire();
//        return new Date().toString();
//    }

}
