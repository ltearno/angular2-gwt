package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.router", name = "Router" )
public class Router
{
	@JsMethod( namespace = "ng.router" )
	public static native JsArray<Object> provideRouter( JsArray<RouterConfig> routes );

	@JsMethod
	public native void navigate( JsArray<?> link );
}
