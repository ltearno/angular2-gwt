package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core" )
public class ViewContainerRef
{
	public native Object createComponent( Object factory );
}
