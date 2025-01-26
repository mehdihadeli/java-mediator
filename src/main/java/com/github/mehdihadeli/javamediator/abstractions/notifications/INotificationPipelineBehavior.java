package com.github.mehdihadeli.javamediator.abstractions.notifications;

public interface INotificationPipelineBehavior<TNotification extends INotification> {
    void handle(TNotification notification, NotificationHandlerDelegate next) throws RuntimeException;
}
