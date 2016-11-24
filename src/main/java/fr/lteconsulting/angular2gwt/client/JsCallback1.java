package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface JsCallback1<T>
{
	void exec( T value );
}
