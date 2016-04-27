package fr.lteconsulting.angular2gwt.client.tools;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface Rejection
{
	void rejected( Object error );
}
