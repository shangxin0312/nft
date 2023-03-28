package com.central.log.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 审计日志
 *
 * @author ntf
 * @date 2020/2/3
 * <p>
 * Blog: https://nft.gitee.io
 * Github: https://github.com/cscodeteam/nft_java_server
 */
@Setter
@Getter
public class Audit {
    /**
     * 操作时间
     */
    private LocalDateTime timestamp;
    /**
     * 应用名
     */
    private String applicationName;
    /**
     * 类名
     */
    private String className;
    /**
     * 方法名
     */
    private String methodName;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 租户id
     */
    private String clientId;
    /**
     * 操作信息
     */
    private String operation;
}
