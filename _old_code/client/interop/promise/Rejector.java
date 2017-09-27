package fr.lteconsulting.angular2gwt.client.interop.promise;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface Rejector
{
	void reject( Object reason );
	
	// ideally would also have void reject();
}
