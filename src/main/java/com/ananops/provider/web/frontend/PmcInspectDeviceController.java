package com.ananops.provider.web.frontend;

import com.ananops.provider.model.domain.PmcInspectDevice;
import com.ananops.provider.model.dto.PmcInspectDevideDto;
import com.ananops.provider.service.PmcInspectDeviceService;
import com.ananops.utils.WrapMapper;
import com.ananops.utils.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By ChengHao On 2019/11/28
 */
@RestController
@RequestMapping(value = "/InspectDevice",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "WEB -PmcInspectDeviceController",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PmcInspectDeviceController {
    @Autowired
    PmcInspectDeviceService pmcInspectDeviceService;

    @PostMapping("/save")
    @ApiOperation(httpMethod = "POST",value = "编辑巡检任务,当id为空时新增项目,不为空时为更新项目信息")
    public Wrapper save(@RequestBody PmcInspectDevideDto pmcInspectDevideDto){
        PmcInspectDevice pmcInspectDevice = new PmcInspectDevice();
        BeanUtils.copyProperties(pmcInspectDevideDto,pmcInspectDevice);
        pmcInspectDeviceService.save(pmcInspectDevice);
        return WrapMapper.ok();
    }

    @PostMapping("/getTaskById/{id}")
    @ApiOperation(httpMethod = "POST",value = "根据id获取巡检任务")
    public Wrapper getTaskById(@PathVariable Long id){
        PmcInspectDevice pmcInspectDevice = pmcInspectDeviceService.getTaskById(id);
        return WrapMapper.ok(pmcInspectDevice);
    }

    @PostMapping("/getTasksByProjectId/{projectId}")
    @ApiOperation(httpMethod = "POST",value = "获取某个项目的巡检任务")
    public Wrapper getTasksByProjectId(@PathVariable Long projectId){
        List<PmcInspectDevice> pmcInspectDevices = pmcInspectDeviceService.getTasksByProjectId(projectId);
        return WrapMapper.ok(pmcInspectDevices);
    }

    @PostMapping("deleteTaskById/{id}")
    @ApiOperation(httpMethod = "POST",value = "删除巡检任务")
    public Wrapper deleteTaskById(@PathVariable Long id){
        pmcInspectDeviceService.deleteTaskById(id);
        return WrapMapper.ok();
    }



}
