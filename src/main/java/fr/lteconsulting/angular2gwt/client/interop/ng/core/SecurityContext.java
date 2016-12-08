package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core" )
public class SecurityContext
{
	@JsProperty( name = "NONE" )
	public static native int NONE();

	@JsProperty( name = "HTML" )
	public static native int HTML();

	@JsProperty( name = "STYLE" )
	public static native int STYLE();

	@JsProperty( name = "SCRIPT" )
	public static native int SCRIPT();

	@JsProperty( name = "URL" )
	public static native int URL();

	@JsProperty( name = "RESOURCE_URL" )
	public static native int RESOURCE_URL();
}