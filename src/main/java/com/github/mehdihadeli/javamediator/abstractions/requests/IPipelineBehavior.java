package com.github.mehdihadeli.javamediator.abstractions.requests;

public interface IPipelineBehavior<TRequest extends IRequest<TResponse>, TResponse> {
    TResponse handle(TRequest request, RequestHandlerDelegate<TResponse> next) throws RuntimeException;
}
