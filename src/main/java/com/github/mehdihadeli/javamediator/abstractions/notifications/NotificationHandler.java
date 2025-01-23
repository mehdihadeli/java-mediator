package com.github.mehdihadeli.javamediator.abstractions.notifications;

import java.lang.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public @interface NotificationHandler {}
