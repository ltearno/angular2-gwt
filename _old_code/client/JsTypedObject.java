package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Object" )
public class JsTypedObject<K,V>
{
	@JsOverlay
	public final V get( K propertyName )
	{
		@SuppressWarnings( "unchecked" )
		V result = (V) JsTools.getObjectProperty( this, propertyName );
		return result;
	}

	@JsOverlay
	public final fr.lteconsulting.angular2gwt.client.JsTypedObject set( K propertyName, V value )
	{
		JsTools.setObjectProperty( this, propertyName, value );
		return this;
	}

	public static native JsArray<String> getOwnPropertyNames( fr.lteconsulting.angular2gwt.client.JsObject object );
}
