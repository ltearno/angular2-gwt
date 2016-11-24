package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.http", name = "Response" )
public class Response
{
	public final native <T> T json();
	
	public final native String text();
}
