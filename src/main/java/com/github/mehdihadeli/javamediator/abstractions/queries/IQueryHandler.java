package com.github.mehdihadeli.javamediator.abstractions.queries;

import com.github.mehdihadeli.javamediator.abstractions.requests.IRequestHandler;

public interface IQueryHandler<TQuery extends IQuery<TResponse>, TResponse> extends IRequestHandler<TQuery, TResponse> {
    TResponse handle(TQuery query) throws RuntimeException;
}
