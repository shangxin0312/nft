package com.central.log.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 审计日志配置
 *
 * @author ntf
 * @date 2020/2/3
 * <p>
 * Blog: https://nft.gitee.io
 * Github: https://github.com/cscodeteam/nft_java_server
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "zlt.audit-log")
@RefreshScope
public class AuditLogProperties {
    /**
     * 是否开启审计日志
     */
    private Boolean enabled = false;
    /**
     * 日志记录类型(logger/redis/db/es)
     */
    private String logType;
}
