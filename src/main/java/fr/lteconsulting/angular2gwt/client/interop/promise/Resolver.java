package fr.lteconsulting.angular2gwt.client.interop.promise;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface Resolver<T>
{
	/**
	 * 
	 * @param nullOrValueOrPromise can be either null, a T value or a Promise<T>
	 */
	void resolve( Object nullOrValueOrPromise );
	
	/**
	 * Ideally would have this, but it is prevented by the GWT compiler :
	 * 
	 * void resolve();
	 * void resolve( T value );
	 * void resolve( Promise<T> promise );
	 */
}
