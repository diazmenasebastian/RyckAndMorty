package cl.prueba.api.ryckandmorty.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuracion Swagger
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi(BuildProperties buildProperties){
        return new OpenAPI().components(new Components()).info(apiInfo(buildProperties));
    }

    @Bean
    public GroupedOpenApi v1Api(){
        return GroupedOpenApi.builder().group("v1").pathsToMatch("/v1/**").build();
    }

    private Info apiInfo(BuildProperties build){
        return new Info().title(build.getName())
                .version(build.getVersion())
                .description(build.get("description"));
    }
}
