package com.github.mehdihadeli.javamediator.abstractions;


import com.github.mehdihadeli.javamediator.abstractions.notifications.INotification;

public interface IPublisher {
    <TNotification extends INotification> Void publish(TNotification notification) throws RuntimeException;
}
