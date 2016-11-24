---
layout: page
title: Dependency injection
permalink: /dependency-injection/
---

# Dependency injection

This page follows the structure of the official Angular 2 [article](https://angular.io/docs/ts/latest/cookbook/dependency-injection.html).

## Application-wide dependencies

Follow the original Angular 2 documentation.

*More to come soon*.

## @Injectable and nested service dependencies

This page follows the Angular 2 [documentation](https://angular.io/docs/ts/latest/cookbook/dependency-injection.html).

When a service in your application requires other services to be injected, it needs to be annotated with `@Injectable`. By doing so, one will be able to receive dependency injection through the constructor. The services are of course annotated with `@JsType` so that their type is seen by Angular.

Here, the `UserContextService` gets the `UserService` and `LoggerService` injected :

{% highlight java %}
@Injectable
@JsType
public class UserContextService
{
    @JsConstructor
    public UserContextService( UserService userService, LoggerService loggerService )
    {
        // the userService and loggerService instances are injected by Angular
    }

    // ...
}
{% endhighlight %}

Although not required, the Angular documentation recommends to systematically annotate services with `@Injectable` even if they don't get other services injected.

## Limit service scope to a component subtree

Follow the [official documentation](https://angular.io/docs/ts/latest/cookbook/dependency-injection.html#!#service-scope) because Angular2Boot follows exactly the same mechanism.

## Qualify dependency lookup with `@Optional` and `@Host`

## Inject the component's element