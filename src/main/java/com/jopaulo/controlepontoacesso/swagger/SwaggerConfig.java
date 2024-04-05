package com.jopaulo.controlepontoacesso.swagger;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

//    @Bean
//    Docket apiAdmin() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.jopaulo.controlepontoacesso"))
//                .paths(PathSelectors.ant("/**"))
//                .build()
//                .globalOperationParameters(
//                        Collections.singletonList(
//                                new ParameterBuilder()
//                                        .name("Authorization")
//                                        .description("Header para Token JWT")
//                                        .modelRef(new ModelRef("string"))
//                                        .parameterType("header")
//                                        .required(false)
//                                        .build()));
//    }

//    @Bean
//    OpenAPI openAPI() {
//      return new OpenAPI()
//              .info(new Info()
//                      .title("Title - Rest API")
//                      .description("API exemplo de uso de Springboot REST API")
//                      .version("1.0")
//                      .termsOfService("Termo de uso: Open Source")
//                      .license(new License()
//                              .name("Apache 2.0")
//                              .url("http://www.seusite.com.br")
//                      )
//              ).externalDocs(
//                      new ExternalDocumentation()
//                      .description("Seu nome")
//                      .url("http://www.seusite.com.br"));
//    }
//    parte 14

}
