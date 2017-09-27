package fr.lteconsulting.angular2gwt.client.interop.promise;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Promise" )
public class Promise<T>
{
	/**
	 * Creates a new Promise.
	 * 
	 * @param executor
	 *            A callback used to initialize the promise. This callback is
	 *            passed two arguments: a resolve callback used resolve the
	 *            promise with a value or the result of another promise, and a
	 *            reject callback used to reject the promise with a provided
	 *            reason or error.
	 */
	@JsConstructor
	public Promise( Executor<T> executor )
	{
		// keep the constructor empty because in reality it is implemented in
		// the javascript world
	}

	/**
	 * Creates a Promise that is resolved or rejected when any of the provided
	 * Promises are resolved or rejected.
	 * 
	 * @param values
	 *            An array of Promises or values.
	 * @returns A new Promise.
	 */
	public static native <T> Promise<T> race( JsArray<?> values );

	/**
	 * Creates a new resolved promise for the provided value.
	 * 
	 * @param value
	 *            A promise.
	 * @returns A promise whose internal state matches the provided promise.
	 */
	public static native <T> Promise<T> resolve( T value );

	/**
	 * Creates a new resolved promise for the provided value.
	 * 
	 * @param value
	 *            A promise.
	 * @returns A promise whose internal state matches the provided promise.
	 */
	public static native <T> Promise<T> resolve( Promise<T> value );

	/**
	 * Creates a new resolved promise .
	 * 
	 * @returns A resolved promise.
	 */
	public static native Promise<Void> resolve();

	/**
	 * Creates a new rejected promise for the provided reason.
	 * 
	 * @param reason
	 *            The reason the promise was rejected.
	 * @returns A new rejected Promise.
	 */
	public static native <T> Promise<T> reject( Object reason );

	/**
	 * Creates a Promise that is resolved with an array of results when all of
	 * the provided Promises resolve, or rejected when any Promise is rejected.
	 * 
	 * @param values
	 *            An array of Promises or values.
	 * @returns A new Promise resolving to an array with the values parameter's
	 *          responses.
	 */
	public static native Promise<JsArray<?>> all( JsArray<?> values );

	/**
	 * Attaches callbacks for the resolution and/or rejection of the Promise.
	 * 
	 * @param onfulfilled
	 *            The callback to execute when the Promise is resolved.
	 * @param onrejected
	 *            The callback to execute when the Promise is rejected.
	 * @returns A Promise for the completion of which ever callback is executed.
	 */
	public native <TResult> Promise<TResult> then( Fulfillment<T, TResult> onfulfilled, Rejection<TResult> onrejected );

	/**
	 * Attaches callbacks for the resolution and/or rejection of the Promise.
	 * 
	 * @param onfulfilled
	 *            The callback to execute when the Promise is resolved.
	 * @returns A Promise for the completion of which ever callback is executed.
	 */
	public native <TResult> Promise<TResult> then( Fulfillment<T, TResult> onfulfilled );

	/**
	 * Since `catch` is a Java keyword, this method is named onCatch
	 * 
	 * Attaches a callback for only the rejection of the Promise.
	 * 
	 * @param onrejected
	 *            The callback to execute when the Promise is rejected.
	 * @returns A Promise for the completion of the callback.
	 */
	@JsMethod( name = "catch" )
	public native Promise<T> onCatch( Rejection<T> onrejected );
}
