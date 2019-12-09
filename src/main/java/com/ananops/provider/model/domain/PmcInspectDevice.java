package com.ananops.provider.model.domain;

import com.ananops.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Table(name = "an_pmc_inspect_device")
@Data
public class PmcInspectDevice extends BaseEntity {
    /**
     * 项目id
     */
    @Column(name = "project_id")
    private Long projectId;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 设备名字
     */
    @Column(name = "device_name")
    private String deviceName;

    /**
     * 设备类型
     */
    @Column(name = "device_type")
    private String deviceType;

    /**
     * 巡检内容
     */
    @Column(name = "inspection_content")
    private String inspectionContent;

    /**
     * 巡检情况(0-正常，1-不正常)
     */
    @Column(name = "inspection_condition")
    private Integer inspectionCondition;

    /**
     * 处理结果
     */
    @Column(name = "deal_result")
    private String dealResult;

    /**
     * 巡检周期
     */
    @Column(name = "cycle_time")
    private Integer cycleTime;

    /**
     * 预计开始时间
     */
    @Column(name = "scheduled_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date scheduledStartTime;

    /**
     * 最晚开始时间
     */
    @Column(name = "deadline_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deadlineTime;

    /**
     * 描述
     */
    private String description;

}