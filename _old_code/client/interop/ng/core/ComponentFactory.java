package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core" )
public class ComponentFactory
{
	public native ComponentRef create( Object injector, Object somethings[], Object selectorOrElement );
}
