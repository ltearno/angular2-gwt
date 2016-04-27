package fr.lteconsulting.angular2gwt.client.interop.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface Executor<V, E>
{
	void execute( Resolver<V> resolver, Rejector<E> rejecter );
}
