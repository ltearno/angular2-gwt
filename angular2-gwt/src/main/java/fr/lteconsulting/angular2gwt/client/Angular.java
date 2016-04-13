package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsMethod;

public class Angular
{
	/**
	 * Calls to the Angular 2 bootstrap function
	 */
	@JsMethod( namespace = "ng.platform.browser", name = "bootstrap" )
	public static native void bootstrap( Object applicationComponent );
}
