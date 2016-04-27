package fr.lteconsulting.angular2gwt.client.interop.xmlhttprequest;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ReadyStateHandler
{
	void onStateChanged( Object event );
}
