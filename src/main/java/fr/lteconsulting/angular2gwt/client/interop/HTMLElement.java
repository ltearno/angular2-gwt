package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "HTMLElement" )
public class HTMLElement
{
	public String innerHTML;
	public String innerText;

	public native void appendChild( HTMLElement child );
}
