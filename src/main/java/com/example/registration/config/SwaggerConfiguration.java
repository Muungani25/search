package zw.co.afrosoft.epayments.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;

/**
 * @author Mitch
 * 17/10/18
 * 11:26 PM
 */
@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()

                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("EPayments Services API")
                .description("REST API to get end points for E-Payments Services.")
                .version("2.0")
                .contact(apiContact())
                .license(apiLicense());
    }

    private License apiLicense() {
        return new License()
                .name("MIT License")
                .url("#");
    }

    private Contact apiContact() {
        return new Contact()
                .name("AfroSoft Developers")
                .email("noreply@afrosoft.co.zw")
                .url("#");
    }
}



