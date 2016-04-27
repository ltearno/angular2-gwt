package fr.lteconsulting.angular2gwt.client.interop.xmlhttprequest;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "XMLHttpRequest" )
public class XMLHttpRequest
{
	@JsMethod
	public native void open( String method, String url, boolean isAsync );

	@JsMethod
	public native void send( Object data );

	@JsProperty
	public native void setOnreadystatechange( ReadyStateHandler handler );

	@JsProperty
	public native int getReadyState();

	@JsProperty
	public native int getStatus();

	@JsProperty
	public native String getResponseText();
}
