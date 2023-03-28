package com.central.gateway.filter;

/**
 * 传递负载均衡隔离值
 *
 * @author ntf
 * @date 2019/10/7
 * <p>
 * Blog: https://nft2000.gitee.io
 * Github: https://github.com/cscodeteam/nft_java_server
 */
/*
@Component
@ConditionalOnProperty(name = ConfigConstants.CONFIG_RIBBON_ISOLATION_ENABLED, havingValue = "true")
public class LbIsolationFilter extends LoadBalancerClientFilter {
    public LbIsolationFilter(LoadBalancerClient loadBalancer, LoadBalancerProperties properties) {
        super(loadBalancer, properties);
    }

    @Override
    protected ServiceInstance choose(ServerWebExchange exchange) {
        String vresion = exchange.getRequest().getHeaders().getFirst(CommonConstant.Z_L_T_VERSION);
        if (StrUtil.isNotEmpty(vresion)) {
            if (this.loadBalancer instanceof RibbonLoadBalancerClient) {
                RibbonLoadBalancerClient client = (RibbonLoadBalancerClient) this.loadBalancer;
                String serviceId = ((URI) exchange.getAttribute(GATEWAY_REQUEST_URL_ATTR)).getHost();
                return client.choose(serviceId, vresion);
            }
        }
        return super.choose(exchange);
    }
}
*/
