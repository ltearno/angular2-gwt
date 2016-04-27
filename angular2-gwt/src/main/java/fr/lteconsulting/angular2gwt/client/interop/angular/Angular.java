package fr.lteconsulting.angular2gwt.client.interop.angular;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsMethod;

public class Angular {
	/**
	 * Calls to the Angular 2 bootstrap function
	 */
	@JsMethod(namespace = "ng.platform.browser", name = "bootstrap")
	public static native void bootstrap(Object applicationComponent);
	
	@JsMethod(namespace = "ng.platform.browser", name = "bootstrap")
	public static native void bootstrap(Object applicationComponent, JsArray<?> providers);

	@JsMethod(namespace = "ng.core", name = "provide")
	public static native <T> T provide(Class<?> provider, Object options);
}
