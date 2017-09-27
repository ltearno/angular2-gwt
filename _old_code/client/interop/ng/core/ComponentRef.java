package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core" )
public class ComponentRef
{
	public ChangeDetectorRef changeDetectorRef;

	@JsProperty( name = "instance" )
	public native Object instance();
}
