package com.alibaba.csp.sentinel.dashboard.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties(prefix = "sentinel.nacos")
@Configuration
@Data
public class NacosPropertiesConfiguration {
    private String serverAddr;
    private String groupId;
    private String namespace;
    private String username;
    private String password;
	//自行补充get与set方法


}


