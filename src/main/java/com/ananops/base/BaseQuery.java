package com.ananops.base;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * The class Base query.
 *
 * Created By ChengHao On 2019/12/5
 */
@Data
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = -4260235833887650030L;

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    private Integer pageNum = 1;

    /**
     * 每页条数
     */
    @ApiModelProperty(value = "每页条数")
    private Integer pageSize = 10;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private String orderBy;
}
