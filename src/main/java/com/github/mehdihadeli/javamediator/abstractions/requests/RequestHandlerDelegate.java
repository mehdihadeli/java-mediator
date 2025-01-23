package com.github.mehdihadeli.javamediator.abstractions.requests;

@FunctionalInterface
public interface RequestHandlerDelegate<TResponse> {
    TResponse handle() throws RuntimeException;
}
