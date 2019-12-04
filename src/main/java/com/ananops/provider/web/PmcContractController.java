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
@RequestMapping("/contract")
@Api(value = "WEB -PmcContactController",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PmcContractController {

    @PostMapping("/getContractListWithPage")
    @ApiOperation(httpMethod = "POST",value = "获取所有合同列表")
    public String getContractListWithPage(){
        return "success";
    }

    @PostMapping("/getPartyAContactList")
    @ApiOperation(httpMethod = "POST",value = "获取组织合同列表")
    public String getContactListByGroup(){
        return "success";
    }

    @PostMapping("/getContractById")
    @ApiOperation(httpMethod = "POST",value = "根据合同id查询合同")
    public String getContractById(){
        return "success";
    }

    @PostMapping("/AddContract")
    @ApiOperation(httpMethod = "POST",value = "添加合同")
    public String addContract(){
        return "success";
    }

    @PostMapping("/UpdateContractById")
    @ApiOperation(httpMethod = "POST",value = "根据合同ID修改合同")
    public String updateContractById(){
        return "success";
    }

    @PostMapping("/deleteContractById")
    @ApiOperation(httpMethod = "POST",value = "根据合同id删除合同")
    public String deleteContractById(){
        return "success";
    }




}
