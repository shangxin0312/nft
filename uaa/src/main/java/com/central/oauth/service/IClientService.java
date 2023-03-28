package com.central.oauth.service;

import com.central.common.model.PageResult;
import com.central.common.model.Result;
import com.central.common.service.ISuperService;
import com.central.oauth.model.Client;

import java.util.Map;

/**
 * @author ntf
 * <p>
 * Blog: https://nft.gitee.io
 * Github: https://github.com/cscodeteam/nft_java_server
 */
public interface IClientService extends ISuperService<Client> {
    Result saveClient(Client clientDto) throws Exception;

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    PageResult<Client> listClient(Map<String, Object> params, boolean isPage);

    void delClient(long id);

    Client loadClientByClientId(String clientId);
}
