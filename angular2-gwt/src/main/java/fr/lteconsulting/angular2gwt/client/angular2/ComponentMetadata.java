package fr.lteconsulting.angular2gwt.client.angular2;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.core", name = "ComponentMetadata" )
public class ComponentMetadata
{
	public String selector;
	public String template;

	@JsOverlay
	public final ComponentMetadata selector( String value )
	{
		this.selector = value;
		return this;
	}

	@JsOverlay
	public final ComponentMetadata template( String value )
	{
		this.template = value;
		return this;
	}
}
