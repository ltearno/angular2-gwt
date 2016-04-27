package fr.lteconsulting.angular2gwt.client.tools;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface Executor
{
	void execute( Resolver resolver, Rejector rejecter );
}
