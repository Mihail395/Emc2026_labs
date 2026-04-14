package mk.ukim.finki.emt.rentalapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @Configuration tells Spring this class provides beans (objects managed by Spring)
public class SwaggerConfig {

    @Bean
    // @Bean registers the return value as a Spring-managed bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Rental API")
                        .description("API for managing accommodation rentals")
                        .version("1.0.0"));
    }
}
