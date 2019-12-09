package com.ananops.provider.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * Created By ChengHao On 2019/12/5
 */
@Data
@ApiModel
public class PmcInspectDevideDto implements Serializable {
    private static final long serialVersionUID = -1355390517223665176L;
    @ApiModelProperty(value = "巡检设备id")
    private Long id;

    /**
     * 项目id
     */
    @ApiModelProperty(value = "项目id")
    private Long projectId;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String projectName;

    /**
     * 设备名字
     */
    @ApiModelProperty(value = "设备名字")
    private String deviceName;

    /**
     * 设备类型
     */
    @ApiModelProperty(value = "设备类型")
    private String deviceType;

    /**
     * 巡检内容
     */
    @ApiModelProperty(value = "巡检内容")
    private String inspectionContent;

    /**
     * 巡检情况(0-正常，1-不正常)
     */
    @ApiModelProperty(value = "巡检情况(0-正常，1-不正常)")
    private Integer inspectionCondition;

    /**
     * 处理结果
     */
    @ApiModelProperty(value = "处理结果")
    private String dealResult;

    /**
     * 巡检周期
     */
    @ApiModelProperty(value = "巡检周期,单位天")
    private Integer cycleTime;

    /**
     * 预计开始时间
     */
    @ApiModelProperty(value = "预计开始时间",example = "2019-12-01 12:18:48")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date scheduledStartTime;

    /**
     * 最晚开始时间
     */
    @ApiModelProperty(value = "最晚开始时间",example = "2019-12-01 12:18:48")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deadlineTime;

    /**
     * 描述
     */
    private String description;
}
