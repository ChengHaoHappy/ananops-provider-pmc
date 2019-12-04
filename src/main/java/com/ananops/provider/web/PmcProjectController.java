package com.ananops.provider.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By ChengHao On 2019/11/28
 */
@RestController
@RequestMapping("/Project")
@Api(value = "WEB -PmcProjectController",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PmcProjectController {

    @PostMapping("/getProjectListWithPage")
    @ApiOperation(httpMethod = "POST",value = "获取项目列表")
    public String getProjectListWithPage(){
        return "success";
    }
}
