package com.ananops.provider.web.frontend;

import com.ananops.base.BaseQuery;
import com.ananops.provider.model.domain.PmcProject;
import com.ananops.provider.model.dto.PmcProjectDto;
import com.ananops.provider.service.PmcProjectService;
import com.ananops.utils.WrapMapper;
import com.ananops.utils.Wrapper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created By ChengHao On 2019/11/28
 */
@RestController
@RequestMapping(value = "/project", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "WEB -PmcProjectController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class PmcProjectController {

    @Autowired
    PmcProjectService pmcProjectService;

    @PostMapping("/save")
    @ApiOperation(httpMethod = "POST", value = "编辑项目,当id为空时新增项目,不为空时为更新项目信息")
    public Wrapper saveProject(@RequestBody PmcProjectDto pmcProjectDto) {
        PmcProject pmcProject = new PmcProject();
        BeanUtils.copyProperties(pmcProjectDto,pmcProject);
        pmcProjectService.saveProject(pmcProject);
        return WrapMapper.ok();
    }

    @PostMapping("/getById/{id}")
    @ApiOperation(httpMethod = "POST",value = "根据id查询项目详情")
    public Wrapper getProjectById(@PathVariable Long id){
        log.info("查询项目详情,id={}",id);
        PmcProject pmcProject = pmcProjectService.getProjectById(id);
        return WrapMapper.ok(pmcProject);
    }

    @PostMapping("/getProjectListByGroupId/{groupId}")
    @ApiOperation(httpMethod = "POST",value = "获取某个组织的项目列表")
    public Wrapper getProjectListByGroupId(@PathVariable Long groupId){
        List<PmcProject> pmcProjectList = pmcProjectService.getProjectListByGroupId(groupId);
        return WrapMapper.ok(pmcProjectList);
    }

    @PostMapping("/getProjectListWithPage")
    @ApiOperation(httpMethod = "POST", value = "分页获取所有项目列表")
    public Wrapper getProjectListWithPage(@ApiParam(value = "分页排序参数") @RequestBody BaseQuery baseQuery) {
        PageInfo pageInfo = pmcProjectService.getProjectListWithPage(baseQuery);
        return WrapMapper.ok(pageInfo);
    }

    @PostMapping("deleteProjectById/{id}")
    @ApiOperation(httpMethod = "POST",value = "删除项目信息")
    public Wrapper deleteProjectById(@PathVariable Long id){
        log.info("删除项目信息,id={}",id);
        pmcProjectService.deleteProjectById(id);
        return WrapMapper.ok();
    }


}
