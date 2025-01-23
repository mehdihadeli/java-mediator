package com.github.mehdihadeli.javamediator.abstractions;

import com.github.mehdihadeli.javamediator.abstractions.commands.ICommand;
import com.github.mehdihadeli.javamediator.abstractions.queries.IQuery;
import com.github.mehdihadeli.javamediator.abstractions.requests.IRequest;

public interface ISender {

    <TResponse> TResponse send(IRequest<TResponse> request) throws RuntimeException;

    <TResponse> TResponse send(ICommand<TResponse> command) throws RuntimeException;

    <TResponse> TResponse send(IQuery<TResponse> query) throws RuntimeException;
}
