package fr.lteconsulting.angular2gwt.client.interop.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface Rejection<TResult>
{
	/**
	 * should return a TResult or Promise<TResult> but unexpressable in Java !
	 */
	Object rejected( Object reason );
}