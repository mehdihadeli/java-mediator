package com.github.mehdihadeli.javamediator.abstractions.messages;

public interface IMessageHandler<TMessage extends IMessage> {
    void handle(TMessage message);
}
