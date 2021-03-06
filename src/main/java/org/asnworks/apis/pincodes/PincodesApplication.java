package org.asnworks.apis.pincodes;

import org.asnworks.apis.pincodes.config.JPAConfig;
import org.asnworks.apis.pincodes.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
    JPAConfig.class,
    SwaggerConfig.class
})
public class PincodesApplication {
    public static void main(String[] args) {
        SpringApplication.run(PincodesApplication.class, args);
    }



}
