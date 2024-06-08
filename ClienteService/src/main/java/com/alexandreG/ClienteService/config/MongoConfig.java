/**
 * @author alexandre.gaia
 */

package com.alexandreG.ClienteService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.alexandreG.ClienteService.repository")
public class MongoConfig {
}
