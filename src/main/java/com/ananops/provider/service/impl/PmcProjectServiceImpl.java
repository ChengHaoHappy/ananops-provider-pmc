package com.ananops.provider.service.impl;

import com.ananops.base.BaseQuery;
import com.ananops.base.ErrorCodeEnum;
import com.ananops.provider.exception.PmcBizException;
import com.ananops.provider.mapper.PmcContractMapper;
import com.ananops.provider.mapper.PmcProjectMapper;
import com.ananops.provider.model.domain.PmcContract;
import com.ananops.provider.model.domain.PmcProject;
import com.ananops.provider.model.dto.PmcProjectDto;
import com.ananops.provider.service.PmcProjectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.models.auth.In;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.mappers.ModelMapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By ChengHao On 2019/12/4
 */
@Service
public class PmcProjectServiceImpl implements PmcProjectService {
    @Resource
    PmcProjectMapper pmcProjectMapper;
    @Resource
    PmcContractMapper pmcContractMapper;


    @Override
    public void saveProject(PmcProject pmcProject) {
        if (pmcProject.isNew() && pmcProject.getIsContract() == 1) { //新增项目,有合同
            PmcContract pmcContract = pmcContractMapper.selectByPrimaryKey(pmcProject.getContractId());
            if (pmcContract == null) {
                throw new PmcBizException(ErrorCodeEnum.PMC10081003, pmcProject.getContractId());
            }
            //添加甲方、乙方信息
            pmcProject.setPartyAId(pmcContract.getPartyAId());
            pmcProject.setPartyAName(pmcContract.getPartyAName());
            pmcProject.setPartyBId(pmcContract.getPartyBId());
            pmcProject.setPartyBName(pmcContract.getPartyBName());

            pmcProjectMapper.insertSelective(pmcProject);
        } else if(pmcProject.isNew()){  //虚拟项目
            pmcProjectMapper.insertSelective(pmcProject);
        } else {                    //更新项目信息
            Integer result = pmcProjectMapper.updateByPrimaryKeySelective(pmcProject);
            if (result < 1) {
                throw new PmcBizException(ErrorCodeEnum.PMC10081001, pmcProject.getId());
            }
        }
    }

    @Override
    public PmcProject getProjectById(Long projectId) {
        PmcProject pmcProject = pmcProjectMapper.selectByPrimaryKey(projectId);
        return pmcProject;
    }

    @Override
    public List<PmcProject> getProjectListByGroupId(Long groupId) {
        Example example = new Example(PmcProject.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("partyAId", groupId);
        Example.Criteria criteria2 = example.createCriteria();
        criteria2.andEqualTo("partyBId", groupId);
        example.or(criteria2);
        List<PmcProject> pmcProjectList = pmcProjectMapper.selectByExample(example);
        return pmcProjectList;
    }

    @Override
    public PageInfo getProjectListWithPage(BaseQuery baseQuery) {
        PageHelper.startPage(baseQuery.getPageNum(), baseQuery.getPageSize());
        List<PmcProject> pmcProjectList = pmcProjectMapper.selectAll();
        return new PageInfo<>(pmcProjectList);
    }

    @Override
    public void deleteProjectById(Long projectId) {
        Integer result = pmcProjectMapper.deleteByPrimaryKey(projectId);
        if (result < 1) {
            throw new PmcBizException(ErrorCodeEnum.PMC10081002, projectId);
        }
    }
}
