package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "ng.router", name = "RouteParams")
public class RouteParams {
	@JsMethod
	public native Object get(String parameterName);
}
