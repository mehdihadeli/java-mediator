package com.github.mehdihadeli.javamediator.abstractions.commands;


import com.github.mehdihadeli.javamediator.abstractions.requests.IRequestHandler;

public interface ICommandHandler<TCommand extends ICommand<TResponse>, TResponse>
        extends IRequestHandler<TCommand, TResponse> {
    TResponse handle(TCommand command) throws RuntimeException;
}
