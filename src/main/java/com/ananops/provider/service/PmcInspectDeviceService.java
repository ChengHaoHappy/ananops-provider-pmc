package com.ananops.provider.service;

import com.ananops.provider.model.domain.PmcInspectDevice;

import java.util.List;

/**
 * Created By ChengHao On 2019/12/5
 */
public interface PmcInspectDeviceService {
    /**
     * 编辑巡检设备信息
     * @param pmcInspectDevice
     */
    void save(PmcInspectDevice pmcInspectDevice);

    /**
     * 查询巡检任务
     * @param id
     * @return
     */
    PmcInspectDevice getTaskById(Long id);

    /**
     * 获取某个项目的巡检任务
     * @param projectId
     * @return
     */
    List<PmcInspectDevice> getTasksByProjectId(Long projectId);

    /**
     * 删除巡检任务
     * @param id
     */
    void deleteTaskById(Long id);
}
