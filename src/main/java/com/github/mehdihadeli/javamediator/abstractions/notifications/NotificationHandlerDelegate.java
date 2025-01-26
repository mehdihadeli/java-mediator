package com.github.mehdihadeli.javamediator.abstractions.notifications;

@FunctionalInterface
public interface NotificationHandlerDelegate {
    void handle() throws RuntimeException;
}
