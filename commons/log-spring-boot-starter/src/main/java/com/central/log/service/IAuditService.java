package com.central.log.service;

import com.central.log.model.Audit;

/**
 * 审计日志接口
 *
 * @author ntf
 * @date 2020/2/3
 * <p>
 * Blog: https://nft.gitee.io
 * Github: https://github.com/cscodeteam/nft_java_server
 */
public interface IAuditService {
    void save(Audit audit);
}
