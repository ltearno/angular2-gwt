package fr.lteconsulting.angular2gwt.client.interop.angular.rxjs;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface Observer<T>
{
	void onValue( T value );
}