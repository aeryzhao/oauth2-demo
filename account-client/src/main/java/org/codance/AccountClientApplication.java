package org.codance;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoxg
 * @date 2024/11/13 17:58
 */
@SpringBootApplication
public class AccountClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AccountClientApplication.class).run(args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
