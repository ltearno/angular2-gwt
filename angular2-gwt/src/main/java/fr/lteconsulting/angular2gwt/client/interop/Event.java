package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Event" )
public class Event
{
	@JsMethod
	public native void preventDefault();
}
