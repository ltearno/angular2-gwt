---
layout: page
title: Component interaction
permalink: /component-interaction/
---

# Component interaction

This page follows the structure of the official Angular 2 [article](https://angular.io/docs/ts/latest/cookbook/component-communication.html).

## Pass data from parent to child with input binding

Have a look at the [Angular documentation](https://angular.io/docs/ts/latest/cookbook/component-communication.html#!#parent-to-child) as it works in the same way.

## Using `@Input` to intercept property changes in a setter

It is possible to use the `@Input` annotation on a setter method and this one will intercept when Angular sets the corresponding property component. Your setter method must respect the *JavaBean* setter naming convention. You also need to annotate your setter method with `@JsProperty`so that your method is converted into a javascript property by GWT.

Here is an example of a setter in a component that will receive the 'message' input value from its parent component :

{% highlight java %}
@Input
@Jsproperty
private void setTimeout( int seconds )
{
  this.seconds = seconds;
  // do something on setting the property value...
}

@Input
@JsProperty
private void setMessage( String message )
{
  // do something on setting the 'message' property
}
{% endhighlight %}

Given that the component where those methods are implemented is named `CountdownComponent`, one can pass values to those input in a component template in this way :

{% highlight html %}
<countdown #timer [timeout]="33" [message]="'Hello Component !'"></countdown>
{% endhighlight %}

You can have a look at the Angular reference [here](https://angular.io/docs/ts/latest/cookbook/component-communication.html#!#parent-to-child-setter) as it works in the same way.

## Parent listens for child event

The corresponding official Angular documentation is available [here](https://angular.io/docs/ts/latest/cookbook/component-communication.html#child-to-parent).

If you want a component to be able to output events that the parent component can listen to, you first have to define your event in the child component :

{% highlight java %}
@Output
@JsProperty
private EventEmitter<String> onFinished = new EventEmitter<>();
{% endhighlight %}

You can then trigger an event like this :

{% highlight java %}
private void someMethod()
{
  // ...
  onFinished.emit( "Message for you !" );
  // ...
}
{% endhighlight %}

To receive the child component 'onFinished' event, the parent template can redirect the event to its own method :

{% highlight html %}
<countdown-timer (onFinished)="timerFinished($event)"></countdown-timer>
{% endhighlight %}

The last thing is to implement the `timerFinished` method in the parent component to receive the the event. Note that the value type received by the `timerFinished` method is the type that was the parameter of `EventEmitter<>`. In our case, it is a `String` :

{% highlight java %}
@JsMethod
private void timerFinished( String message )
{
  // do something with the 'message' event data !
}
{% endhighlight %}

## Parent interacts with child via a *local variable*

Since this works exactly the same with the *Typescript* Angular, you can have a look at the documentation [here](https://angular.io/docs/ts/latest/cookbook/component-communication.html#parent-to-child-local-var).

## Parent and children communicate via a service

Since this works exactly the same with the *Typescript* Angular, you can have a look at the documentation [here](https://angular.io/docs/ts/latest/cookbook/component-communication.html#bidirectional-service).