package com.github.mehdihadeli.javamediator.abstractions.notifications;

public interface INotificationPipelineBehavior<TNotification extends INotification> {
    Void handle(TNotification notification, NotificationHandlerDelegate next) throws RuntimeException;
}
