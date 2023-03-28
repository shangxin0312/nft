package com.central.oauth2.common.token;

import lombok.Getter;

import java.io.Serializable;

/**
 * 表单登录的认证信息对象
 *
 * @author ntf
 * @version 1.0
 * @date 2021/7/24
 * <p>
 * Blog: https://nft.gitee.io
 * Github: https://github.com/cscodeteam/nft_java_server
 */
@Getter
public class CustomWebAuthenticationDetails implements Serializable {
    private static final long serialVersionUID = - 1;

    private final String accountType;
    private final String remoteAddress;
    private final String sessionId;

    public CustomWebAuthenticationDetails(String remoteAddress, String sessionId, String accountType) {
        this.remoteAddress = remoteAddress;
        this.sessionId = sessionId;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("; accountType: ").append(this.getAccountType());
        return sb.toString();
    }
}
