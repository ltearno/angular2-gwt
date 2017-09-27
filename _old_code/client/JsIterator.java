package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Object" )
public interface JsIterator<T>
{
	T next();
}
