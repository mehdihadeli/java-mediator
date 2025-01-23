package com.github.mehdihadeli.javamediator.abstractions.queries;

import com.github.mehdihadeli.javamediator.abstractions.requests.IRequest;

public interface IQuery<TResponse> extends IBaseQuery, IRequest<TResponse> {}
