package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "HTMLDocument" )
public class HTMLDocument
{
	public HTMLElement body;

	public native <T extends HTMLElement> T createElement( String name );

	@JsProperty( namespace = JsPackage.GLOBAL, name = "document" )
	public static native HTMLDocument get();
}
