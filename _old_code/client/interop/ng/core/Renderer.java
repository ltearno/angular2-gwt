package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import fr.lteconsulting.angular2gwt.client.interop.HTMLElement;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "Renderer" )
public class Renderer
{
	public native void setElementStyle( HTMLElement nativeElement, String propertyName, String value );
}