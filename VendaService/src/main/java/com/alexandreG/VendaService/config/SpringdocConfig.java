/**
 * @author alexandre.gaia
 */

package com.alexandreG.VendaService.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringdocConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("api")
                .packagesToScan("com.alexandreG.VendaService.controller.VendaController")
                .build();
    }
}
