package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsCallback;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;

public class GlobalScope
{
	@JsMethod( namespace = JsPackage.GLOBAL )
	public static native void requestAnimationFrame( JsCallback callback );
	
	@JsMethod( namespace = JsPackage.GLOBAL, name = "setTimeout" )
	public static native void setTimeout( JsCallback callback, int timeout );

	@JsMethod( namespace = JsPackage.GLOBAL, name = "setInterval" )
	public static native int setInterval( JsCallback callback, int timeout );

	@JsMethod( namespace = JsPackage.GLOBAL, name = "clearInterval" )
	public static native void clearInterval( int intervalId );
}
