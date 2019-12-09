package com.ananops.provider.service;

import com.ananops.base.BaseQuery;
import com.ananops.provider.model.domain.PmcProject;
import com.ananops.provider.model.dto.PmcProjectDto;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By ChengHao On 2019/12/4
 */
public interface PmcProjectService {
    /**
     * 编辑项目信息
     * @param pmcProject
     * @return
     */
    void saveProject(PmcProject pmcProject);

    /**
     * 查询项目详情
     * @param id
     * @return
     */
    PmcProject getProjectById(Long id);

    /**
     * 删除项目信息
     * @param id
     */
    void deleteProjectById(Long id);

    /**
     * 获取某个组织下的项目列表
     * @param groupId
     * @return
     */
    List<PmcProject> getProjectListByGroupId(Long groupId);

    /**
     * 分页获取所有项目列表
     * @param baseQuery
     * @return
     */
    PageInfo getProjectListWithPage(BaseQuery baseQuery);
}
