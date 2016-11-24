package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import fr.lteconsulting.angular2gwt.client.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "DirectiveMetadata" )
public class DirectiveMetadata
{
	@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Object" )
	static class Host
	{
		String hostName;
	}

	@JsConstructor
	public DirectiveMetadata( JsObject options )
	{
	}
}
