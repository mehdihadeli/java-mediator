package com.github.mehdihadeli.javamediator.abstractions.events;

import com.github.mehdihadeli.javamediator.abstractions.notifications.INotification;
import com.github.mehdihadeli.javamediator.abstractions.notifications.INotificationHandler;

public interface IEventHandler<TEvent extends INotification> extends INotificationHandler<TEvent> {}
