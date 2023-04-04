package br.edu.senai.sc.locadora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket detalhesApi(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.infosApi());
    }

    private Contact getContato(){
        return new Contact("Julio Cezar", "senai.edu.br", "julio.rutke@edu.sc.senai.br");
    }

    private ApiInfo infosApi(){
        return new ApiInfoBuilder().version("1.5")
                .title("API - Locadora de Veículos")
                .description("API constrída na aula de Desenvolvimento de Sistemas para WEB")
                .contact(this.getContato())
                .termsOfServiceUrl("Termo de uso: Open Source")
                .license("Licenciada para SENAI")
                .licenseUrl("senai.edu.br").build();

    }

}
