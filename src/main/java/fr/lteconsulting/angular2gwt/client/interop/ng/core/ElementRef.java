package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import fr.lteconsulting.angular2gwt.client.interop.HTMLElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "ElementRef" )
public class ElementRef
{
	@JsProperty( name = "nativeElement" )
	public native final HTMLElement nativeElement();
}
