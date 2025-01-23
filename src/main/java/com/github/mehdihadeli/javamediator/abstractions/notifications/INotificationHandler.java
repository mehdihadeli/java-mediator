package com.github.mehdihadeli.javamediator.abstractions.notifications;

public interface INotificationHandler<TNotification extends INotification> {

    Void handle(TNotification notification) throws RuntimeException;
}
