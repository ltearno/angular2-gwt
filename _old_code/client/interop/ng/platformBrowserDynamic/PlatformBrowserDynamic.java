package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowserDynamic;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng", name = "platformBrowserDynamic" )
public class PlatformBrowserDynamic
{
	@JsMethod( namespace = "ng.platformBrowserDynamic", name = "bootstrap" )
	public static native void bootstrap( Object applicationComponent );

	@JsMethod( namespace = "ng.platformBrowserDynamic", name = "bootstrap" )
	public static native void bootstrap( Object applicationComponent, JsArray<?> providers );

	@JsMethod( namespace = "ng.platformBrowserDynamic", name = "platformBrowserDynamic" )
	public static native PlatformBrowserDynamic platformBrowserDynamic();

	public native void bootstrapModule( Object module );
}
