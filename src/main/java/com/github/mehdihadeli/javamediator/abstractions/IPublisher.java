package com.github.mehdihadeli.javamediator.abstractions;


import com.github.mehdihadeli.javamediator.abstractions.notifications.INotification;

public interface IPublisher {
    <TNotification extends INotification> void publish(TNotification notification) throws RuntimeException;
    void publish(Object notification) throws RuntimeException;
}
