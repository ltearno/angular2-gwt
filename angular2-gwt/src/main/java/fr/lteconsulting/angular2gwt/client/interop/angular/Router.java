package fr.lteconsulting.angular2gwt.client.interop.angular;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "ng.router", name = "Router")
public class Router {
	@JsMethod
	public native void navigate(JsArray<?> link);
}
