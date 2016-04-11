package fr.lteconsulting.angular2gwt.client.angular2;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.platform.browser" )
public class Browser
{
	/**
	 * Calls to the Angular 2 bootstrap function
	 */
	@JsMethod( namespace = "ng.platform.browser", name = "bootstrap" )
	public static native void bootstrap( Object applicationComponent );
}
