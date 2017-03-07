package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface JsConsumer2<P1, P2>
{
	void exec( P1 parameter1, P2 parameter2 );
}
