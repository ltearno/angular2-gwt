package fr.lteconsulting.angular2gwt.client.angular2;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "Component" )
public class Component
{
	@JsMethod( namespace = "ng.core.Component", name = "Component" )
	public static native Component component( ComponentSpecification spec );

	@JsMethod( name = "Class" )
	public native ComponentClass componentClass( ComponentClassSpecification spec );
}
