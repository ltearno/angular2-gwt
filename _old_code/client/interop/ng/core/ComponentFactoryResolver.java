package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core" )
public class ComponentFactoryResolver
{
	public native ComponentFactory resolveComponentFactory( Object componentType );
}
