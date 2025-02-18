package com.github.mehdihadeli.javamediator.abstractions.messages;

import java.time.LocalDateTime;
import java.util.UUID;

public interface IMessage {
    UUID messageId();

    LocalDateTime created();
}
