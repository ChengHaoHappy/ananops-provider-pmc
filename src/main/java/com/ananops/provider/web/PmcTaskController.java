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
@RequestMapping("/Task")
@Api(value = "WEB -PmcTaskController",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PmcTaskController {

    @PostMapping("/getTaskListWithPage")
    @ApiOperation(httpMethod = "POST",value = "获取合同巡检任务列表")
    public String getTaskListWithPage(){
        return "success";
    }




}
