package com.github.mehdihadeli.javamediator.abstractions.notifications;

@FunctionalInterface
public interface NotificationHandlerDelegate {
    Void handle() throws RuntimeException;
}
