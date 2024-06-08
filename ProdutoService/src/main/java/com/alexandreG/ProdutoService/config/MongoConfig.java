/**
 * @author alexandre.gaia
 */

package com.alexandreG.ProdutoService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.alexandreG.ProdutoService.repository")
public class MongoConfig {

}
