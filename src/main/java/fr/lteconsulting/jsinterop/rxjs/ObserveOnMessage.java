package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/observeOn".ObserveOnMessage
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/observeOn.d.ts:4171
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="ObserveOnMessage")
public class ObserveOnMessage
{

    /*
        Constructors
    */
    public ObserveOnMessage(Notification<Object> notification, PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject destination){
    }

    /*
        Properties
    */

    public PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject destination;

    @JsProperty( name = "destination")
    public native PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject getDestination();

    @JsProperty( name = "destination")
    public native void setDestination( PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject value );

    @JsOverlay
    public final void setDestination( CompletionObserver<Object> value ) { setDestination(PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject.ofCompletionObserverOfObject( value )); }

    @JsOverlay
    public final void setDestination( ErrorObserver<Object> value ) { setDestination(PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject.ofErrorObserverOfObject( value )); }

    @JsOverlay
    public final void setDestination( NextObserver<Object> value ) { setDestination(PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject.ofNextObserverOfObject( value )); }

    public Notification<Object> notification;

    @JsProperty( name = "notification")
    public native Notification<Object> getNotification();

    @JsProperty( name = "notification")
    public native void setNotification( Notification<Object> value );
}
