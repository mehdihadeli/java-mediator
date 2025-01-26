package com.github.mehdihadeli.javamediator.abstractions.notifications;

public interface INotificationHandler<TNotification extends INotification> {

    void handle(TNotification notification) throws RuntimeException;
}
