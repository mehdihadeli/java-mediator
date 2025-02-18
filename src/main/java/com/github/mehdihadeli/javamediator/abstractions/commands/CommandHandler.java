package com.github.mehdihadeli.javamediator.abstractions.commands;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public @interface CommandHandler {}
