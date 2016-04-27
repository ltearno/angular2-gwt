package fr.lteconsulting.angular2gwt.client.tools.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface Rejector<T>
{
	void reject( T error );
}
