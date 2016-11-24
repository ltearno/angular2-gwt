package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "SimpleChange" )
public class SimpleChange
{
	@JsProperty
	public Object previousValue;

	@JsProperty
	public Object currentValue;

	@JsMethod
	public native boolean isFirstChange();
}
