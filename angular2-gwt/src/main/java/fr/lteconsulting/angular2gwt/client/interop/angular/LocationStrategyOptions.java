package fr.lteconsulting.angular2gwt.client.interop.angular;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class LocationStrategyOptions {
	@JsProperty
	Class<?> useClass;

	public LocationStrategyOptions(Class<?> useClass) {
		this.useClass = useClass;
	}
}
