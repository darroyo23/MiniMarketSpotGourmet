package com.spotgourmet.minimarket.shared.security;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI minimarketApi() {

        return new OpenAPI()
                .info(new Info()
                        .title("Minimarket Spot Gourmet API")
                        .description("API para gestión de POS, BackOffice y Mobile")
                        .version("1.0"));
    }
}
