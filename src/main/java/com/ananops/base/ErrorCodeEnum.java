package com.ananops.base;

/**
 * Created By ChengHao On 2019/12/5
 */
public enum ErrorCodeEnum {
//1008 项目管理
    /**
     * Pdc 10081001 error code enum.
     */
    PMC10081001(10081001, "更新项目信息失败, projectId=%s"),
    /**
     * Pdc 10021002 error code enum.
     */
    PMC10081002(10081002, "删除项目失败, projectId=%s"),

    /**
     * Pdc 10021003 error code enum.
     */
    PMC10081003(10081003, "该项目无合同信息, contactId=%s"),

    /**
     * Pdc 10021011 error code enum.
     */
    PMC10081011(10081011, "更新合同信息失败, contactId=%s"),

    /**
     * Pdc 10021012 error code enum.
     */
    PMC10081012(10081012, "删除合同失败, contactId=%s"),

    /**
     * Pdc 10021021 error code enum.
     */
    PMC10081021(10081021, "更新巡检任务失败失败, taskId=%s"),

    /**
     * Pdc 10021022 error code enum.
     */
    PMC10081022(10081022, "删除巡检任务失败失败, taskId=%s"),

    /**
     * Pdc 10021023 error code enum.
     */
    PMC10081023(10081023, "改巡检任务无项目信息, projectId=%s"),



    ;



    private int code;
    private String msg;

    /**
     * Msg string.
     *
     * @return the string
     */
    public String msg() {
        return msg;
    }

    /**
     * Code int.
     *
     * @return the int
     */
    public int code() {
        return code;
    }

    ErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * Gets enum.
     *
     * @param code the code
     *
     * @return the enum
     */
    public static ErrorCodeEnum getEnum(int code) {
        for (ErrorCodeEnum ele : ErrorCodeEnum.values()) {
            if (ele.code() == code) {
                return ele;
            }
        }
        return null;
    }

}
