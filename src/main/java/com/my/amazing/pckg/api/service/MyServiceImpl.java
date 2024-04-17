package com.my.amazing.pckg.api.service;

import jakarta.inject.Singleton;

@Singleton
public non-sealed class MyServiceImpl implements MyService {

    @Override
    public void doStuff() {
        try {
            Thread.sleep(200);
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
