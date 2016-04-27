package fr.lteconsulting.angular2gwt.client.tools;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Promise" )
public class Promise
{
	@JsConstructor
	public Promise( Executor executor )
	{
		// keep the constructor empty because in reality it is implement in the javascript world
	}

	@JsMethod
	public native Promise then( Resolution resolution, Rejection rejection );
}
