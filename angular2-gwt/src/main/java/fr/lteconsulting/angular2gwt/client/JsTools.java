package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;

class JsTools
{
	@JsMethod( namespace = JsPackage.GLOBAL, name = "setTimeout" )
	public static native void setTimeout( JsCallback callback, int timeout );

	static native <T> T get( Object o, int index )
	/*-{
		return o[index] || null;
	}-*/;
}
