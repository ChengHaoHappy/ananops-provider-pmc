package com.ananops.base;

import lombok.Data;

import java.io.Serializable;

/**
 * Created By ChengHao On 2019/12/4
 */
@Data
public class LoginAuthDto implements Serializable {
    private static final long serialVersionUID = 3423820590993599617L;
    private Long userId;
    private String loginName;
    private String userName;
    private Long groupId;
    private String groupName;

    public LoginAuthDto() {
    }

    public LoginAuthDto(Long userId, String loginName, String userName) {
        this.userId = userId;
        this.loginName = loginName;
        this.userName = userName;
    }

    public LoginAuthDto(Long userId, String loginName, String userName, Long groupId, String groupName) {
        this.userId = userId;
        this.loginName = loginName;
        this.userName = userName;
        this.groupId = groupId;
        this.groupName = groupName;
    }
}
