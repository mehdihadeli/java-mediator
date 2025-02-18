package com.github.mehdihadeli.javamediator.abstractions.commands;


import com.github.mehdihadeli.javamediator.abstractions.requests.IRequest;

public interface ICommand<TResponse> extends IRequest<TResponse>, IBaseCommand {}
