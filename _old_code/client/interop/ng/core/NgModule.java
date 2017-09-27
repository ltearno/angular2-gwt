package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "NgModule" )
public class NgModule implements AngularAnnotation
{
	@JsConstructor
	public NgModule( NgModuleMetadata metadata )
	{
	}
}
