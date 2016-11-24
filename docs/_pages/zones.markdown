---
layout: page
title: Angular Zones
permalink: /zones/
---

# Leaving and returning from Angular zones

When you work with asynchronous operations, it could be that you escape from Angular [zones](https://angular.io/docs/js/latest/api/core/NgZone-class.html). If that is so, you can inject the current zone in the component constructor and use the `runOutsideAngular` and `run` methods to leave and return to the Angular zone. Put simply, if you make an asynchronous call, alter a field and have no update in the view, calling `NgZone.run( () -> { /* your code here */ } );` can help. Here is how to use the zone in a component :

{% highlight java %}
@JsType
@Component( ... )
public class MyComponent
{
  @JsProperty String message;

  private NgZone zone;
  public MyComponent( NgZone zone )
  {
    this.zone = zone;
  }

  // called on a click so that Angular checks
  // for updates in the component data
  @JsMethod
  private void click()
  {
    // do something asynchronous other than
    // setTimeout, setInterval and so on...
    doSomethingAsynchrosous( () -> zone.run( () -> message = "update !" ) );
  }
}
{% endhighlight %}