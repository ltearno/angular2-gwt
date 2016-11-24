package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface JsPredicate<T>
{
	boolean execute( T value );
}
