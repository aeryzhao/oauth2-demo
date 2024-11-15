package org.codance;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhaoxg
 * @date 2024/11/13 18:12
 */
@SpringBootApplication
public class AuthorizationServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AuthorizationServerApplication.class).run(args);
    }
}
