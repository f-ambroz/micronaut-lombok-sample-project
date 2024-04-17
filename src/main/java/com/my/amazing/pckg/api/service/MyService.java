package com.my.amazing.pckg.api.service;

public sealed interface MyService permits MyServiceImpl {
    void doStuff();
}
