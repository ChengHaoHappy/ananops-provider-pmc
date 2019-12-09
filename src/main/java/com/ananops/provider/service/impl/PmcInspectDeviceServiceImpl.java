package com.ananops.provider.service.impl;

import com.ananops.base.ErrorCodeEnum;
import com.ananops.provider.exception.PmcBizException;
import com.ananops.provider.mapper.PmcInspectDeviceMapper;
import com.ananops.provider.mapper.PmcProjectMapper;
import com.ananops.provider.model.domain.PmcInspectDevice;
import com.ananops.provider.model.domain.PmcProject;
import com.ananops.provider.service.PmcInspectDeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By ChengHao On 2019/12/5
 */
@Service
@Slf4j
public class PmcInspectDeviceServiceImpl implements PmcInspectDeviceService {
    @Resource
    PmcInspectDeviceMapper pmcInspectDeviceMapper;
    @Resource
    PmcProjectMapper pmcProjectMapper;

    @Override
    public void save(PmcInspectDevice pmcInspectDevice) {
        if (pmcInspectDevice.isNew()) {  //新增巡检任务
            PmcProject pmcProject = pmcProjectMapper.selectByPrimaryKey(pmcInspectDevice.getProjectId());
            if (pmcProject == null) {
                throw new PmcBizException(ErrorCodeEnum.PMC10081023, pmcInspectDevice.getProjectId());
            }
            pmcInspectDeviceMapper.insertSelective(pmcInspectDevice);
        } else {                         //更新
            Integer result = pmcInspectDeviceMapper.updateByPrimaryKeySelective(pmcInspectDevice);
            if (result < 1) {
                throw new PmcBizException(ErrorCodeEnum.PMC10081021, pmcInspectDevice.getId());
            }
        }
    }

    @Override
    public PmcInspectDevice getTaskById(Long id) {
        return pmcInspectDeviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmcInspectDevice> getTasksByProjectId(Long projectId) {
        Example example = new Example(PmcInspectDevice.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("projectId", projectId);
        return pmcInspectDeviceMapper.selectByExample(example);
    }

    @Override
    public void deleteTaskById(Long id) {
        Integer result = pmcInspectDeviceMapper.deleteByPrimaryKey(id);
        if (result < 1) {
            throw new PmcBizException(ErrorCodeEnum.PMC10081022, id);
        }
    }


}
