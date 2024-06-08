/**
 * @author alexandre.gaia
 */

package com.alexandreG.ClienteService.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.GroupedOpenApi;


@Configuration
public class SpringdocConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("api")
                .packagesToScan("com.alexandreG.ClienteService.controller.ClienteController")
                .build();
    }
}
