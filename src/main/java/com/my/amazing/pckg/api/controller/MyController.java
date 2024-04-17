package com.my.amazing.pckg.api.controller;

import java.io.IOException;

import jakarta.inject.Inject;

import com.my.amazing.pckg.api.service.MyService;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class MyController {
    private final MyService myService;

    @Get("/my-endpoint")
    public HttpResponse<Void> callMe() throws IOException {
        myService.doStuff();
        return HttpResponse.ok();
    }
}
