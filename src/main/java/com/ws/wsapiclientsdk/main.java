package com.ws.wsapiclientsdk;

import com.ws.wsapiclientsdk.client.WsApiClient;
import com.ws.wsapiclientsdk.model.User;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/14 20:14
 */
public class main {
    public static void main(String[] args) {
        String accessKey = "123456";
        String secretKey = "123456";
        WsApiClient wsApiClient = new WsApiClient(accessKey, secretKey);
        User user = new User();
        user.setUsername("111");
        String username = wsApiClient.getUsernameByPost(user);
        System.out.println(username);
    }
}
