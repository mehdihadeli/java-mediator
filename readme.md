# Java Mediator

> This package is a `Mediator Pattern` implementation in java to use in CQRS pattern, and inspired by great [jbogard/mediatr](https://github.com/jbogard/mediatr) library in .Net.

For decoupling some objects in a system we can use `Mediator` object as an interface to decrease coupling between the objects. Mostly I uses this pattern when I use CQRS in my system.

## 🧰 Installation

TODO

## 🔥 Features

✅ Handling `Request/Response` message for delivering message to only one handler (Commands, Queries)

✅ Handling `Notification` message for delivering message to multiple handlers (Events)

✅ `Pipelenes Behaviours` for handling some cross cutting concerns before or after executing handlers

## 🛡️ Strategies

Mediator library has two strategies for dispatching messages:

1. `Request/Response` messages, dispatched to a `single handler`.
2. `Notification` messages, dispatched to all (multiple) `handlers` and they don't have any response.

### Request/Response Strategy

The `request/response` message, has just `one handler`, and can handle both command and query scenarios in [CQRS Pattern](https://martinfowler.com/bliki/CQRS.html).

### Notification Strategy

The `notification` message, can have `multiple handlers` and doesn't have any response, and it can handle an [event notification](https://martinfowler.com/articles/201701-event-driven.html) or notification in event driven architecture.

## ⚒️ Using Pipeline Behaviors

Sometimes we need to add some cross-cutting concerns before after running our request handlers like logging, metrics, circuit breaker, retry, etc. In this case we can use `PipelineBehavior`. It is actually is like a middleware or [decorator pattern](https://refactoring.guru/design-patterns/decorator).

These behaviors will execute before or after running our request handlers with calling `Send` method for a request on the Mediator.

## ⭐ Support

If you like feel free to ⭐ this repository, It helps out :)

Thanks a bunch for supporting me!

## Contribution

The application is in development status. You are feel free to submit a pull request or create an issue for any bugs or suggestions.

## License

This library is under [MIT license](./LICENSE).
