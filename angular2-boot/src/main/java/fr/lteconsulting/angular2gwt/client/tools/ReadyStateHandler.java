package fr.lteconsulting.angular2gwt.client.tools;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ReadyStateHandler
{
	void onStateChanged( Object event );
}
