package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core" )
public class ApplicationRef
{
	@JsProperty( name = "injector" )
	public native Object getInjector();
	
	public native void _loadComponent( ComponentRef componentRef );
}
