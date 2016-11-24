package fr.lteconsulting.angular2gwt.client.interop.angular.rxjs;

import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.rxjs", name = "Subscription" )
public class Subscription
{
	public native void unsubscribe();
}