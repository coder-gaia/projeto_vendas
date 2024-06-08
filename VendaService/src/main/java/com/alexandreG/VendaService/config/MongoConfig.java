/**
 * @author alexandre.gaia
 */

package com.alexandreG.VendaService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.alexandreG.VendaService.repository")
public class MongoConfig {
}
