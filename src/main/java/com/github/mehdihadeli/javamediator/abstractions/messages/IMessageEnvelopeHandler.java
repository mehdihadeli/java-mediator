package com.github.mehdihadeli.javamediator.abstractions.messages;

public interface IMessageEnvelopeHandler<TMessage extends IMessage> {
    void handle(IMessageEnvelope<TMessage> eventEnvelope);

    default void HandleInternal(IMessageEnvelopeBase eventEnvelope) {

        handle((IMessageEnvelope<TMessage>) eventEnvelope);
    }
}
