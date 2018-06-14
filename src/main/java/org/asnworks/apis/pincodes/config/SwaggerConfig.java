/**
 * 
 */
package org.asnworks.apis.pincodes.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.asnworks.apis.pincodes.constants.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author sudambat
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors
                .basePackage(Constants.BASE_PACKAGE_FOR_SWAGGER))
            .paths(regex("/.*")).build()
            .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfo(Constants.SWAGGER_API_TITLE,
            Constants.SWAGGER_API_DESCRIPTION, Constants.SWAGGER_API_VERSION,
            Constants.SWAGGER_API_TERMS_OF_SERVICE_URL,
            new Contact(Constants.SWAGGER_API_CONTACT_NAME, Constants.SWAGGER_API_CONTACT_URL, Constants.SWAGGER_API_CONTACT_EMAIL),
            Constants.SWAGGER_API_LICENSE,
            Constants.SWAGGER_API_LICENSE_URL);

    }

}
