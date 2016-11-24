package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "JSON" )
public class JSON
{
	@JsMethod( namespace = "JSON", name = "parse" )
	public static native <T> T parse( String payload );

	@JsMethod( namespace = "JSON", name = "stringify" )
	public static native String stringify( Object payload );
}
