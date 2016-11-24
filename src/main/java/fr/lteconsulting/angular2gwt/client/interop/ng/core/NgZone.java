package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import fr.lteconsulting.angular2gwt.client.JsCallback;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "NgZone" )
public class NgZone
{
	public native final void runOutsideAngular( JsCallback runnable );

	public native final void run( JsCallback runnable );
}
