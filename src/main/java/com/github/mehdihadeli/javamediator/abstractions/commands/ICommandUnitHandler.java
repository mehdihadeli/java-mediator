package com.github.mehdihadeli.javamediator.abstractions.commands;


import com.github.mehdihadeli.javamediator.abstractions.requests.Unit;

public interface ICommandUnitHandler<TCommand extends ICommandUnit> extends ICommandHandler<TCommand, Unit> {}
