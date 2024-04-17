package com.my.amazing.pckg;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "Micronaut Lombok Sample Project API",
        version = "v1"
    )
)
public class Application {

    public static void main(final String[] args) {
        Micronaut.run(Application.class, args);
    }
}