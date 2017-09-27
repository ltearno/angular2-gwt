package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.ng.core.Injector;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module".RouterInitializer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module.d.ts:6724
  * 1 constructors
  * To initialize the router properly we need to do in two steps:
  * 
  * We need to start the navigation in a APP_INITIALIZER to block the bootstrap if
  * a resolver or a guards executes asynchronously. Second, we need to actually run
  * activation in a BOOTSTRAP_LISTENER. We utilize the afterPreactivation
  * hook provided by the router to do that.
  * 
  * The router navigation starts, reaches the point when preactivation is done, and then
  * pauses. It waits for the hook to be resolved. We then resolve it only in a bootstrap listener.
 */
@JsType(isNative=true, namespace="ng.router", name="RouterInitializer")
public class RouterInitializer
{

    /*
        Constructors
    */
    public RouterInitializer(Injector injector){
    }
}
