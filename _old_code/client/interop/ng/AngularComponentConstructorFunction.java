package fr.lteconsulting.angular2gwt.client.interop.ng;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.AngularAnnotation;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Object" )
public class AngularComponentConstructorFunction
{
	@JsProperty
	public JsArray<AngularAnnotation> annotations;

	@JsProperty
	public JsArray<Object> parameters;

	@JsProperty( name = "prototype" )
	public Object proto;
}