package fr.lteconsulting.angular2gwt.client.tools.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface Resolver<T>
{
	void resolve( T value );
}
