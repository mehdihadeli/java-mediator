package com.github.mehdihadeli.javamediator.abstractions.messages;

// using `IMessageEnvelopeMetadata` has problem in deserialize construction so we have to use `MessageEnvelopeMetadata`
public record MessageEnvelope<T>(T message, MessageEnvelopeMetadata metadata) implements IMessageEnvelope<T> {}
