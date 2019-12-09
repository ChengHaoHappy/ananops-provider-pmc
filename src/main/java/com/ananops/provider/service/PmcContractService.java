package com.ananops.provider.service;

import com.ananops.base.BaseQuery;
import com.ananops.provider.model.domain.PmcContract;
import com.ananops.provider.model.dto.PmcContractDto;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created By ChengHao On 2019/12/5
 */
public interface PmcContractService {
    /**
     * 编辑合同信息
     * @param pmcContact
     */
    void saveContract(PmcContract pmcContact);

    /**
     * 获取合同信息
     * @param id
     * @return
     */
    PmcContract getContractById(Long id);

    /**
     * 删除合同信息
     * @param id
     */
    void deleteContractById(Long id);

    /**
     * 根据组织id查询合同列表
     * @param groupId
     * @return
     */
    List<PmcContract> getContactListByGroupId(Long groupId);

    /**
     * 查询所有合同
     * @param baseQuery
     * @return
     */
    PageInfo getContractListWithPage(BaseQuery baseQuery);
}
