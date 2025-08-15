package com.cocina360.api_menu.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "Api Menu",
        version = "1.0.0",
        description = "CRUD de la api"
    ),
    servers = {
        @Server(
            description = "Dev Server",
            url = "http://localhost:9000"
        )
    }
)
public class SwaggerConfig {
    
}
