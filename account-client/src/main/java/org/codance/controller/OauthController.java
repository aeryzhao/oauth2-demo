package org.codance.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhaoxg
 * @date 2024/11/14 08:47
 */
@RestController
public class OauthController {
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/oauth/access-token")
    String accessToken(@RequestParam String code) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        LinkedMultiValueMap<String, String> valueMap = new LinkedMultiValueMap<>();
        valueMap.add("grant_type", "authorization_code");
        valueMap.add("client_id", "client1");
        valueMap.add("client_secret", "secret");
        valueMap.add("code", code);
        valueMap.add("redirect_uri", "http://localhost:8081/oauth/access-token");
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(valueMap, headers);
        String authorizationServerURL = "http://localhost:8080/oauth/token";
        ResponseEntity<String> response = restTemplate.postForEntity(authorizationServerURL, httpEntity, String.class);
        return response.getBody();
    }
}
