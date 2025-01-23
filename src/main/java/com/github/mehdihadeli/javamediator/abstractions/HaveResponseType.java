package com.github.mehdihadeli.javamediator.abstractions;

public interface HaveResponseType<TResponse> {
    Class<?> getResponseType();
}
