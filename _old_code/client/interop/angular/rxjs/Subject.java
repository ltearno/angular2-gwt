package fr.lteconsulting.angular2gwt.client.interop.angular.rxjs;

import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.rxjs", name = "Subject" )
public class Subject<T> extends Observable<T>
{
	public native void next( T item );

	public native Observable<T> asObservable();
}
