package com.ws.wsapiclientsdk;

import com.ws.wsapiclientsdk.client.WsApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/13 16:00
 */
@Data
@ComponentScan
@Configuration
@ConfigurationProperties(prefix = "wsapi.client")
public class WsApiApiClientConfig {
    private String accessKey;
    private String secretKey;
    @Bean
    public WsApiClient wsApiClient() {
        return new WsApiClient(accessKey, secretKey);
    }
}
