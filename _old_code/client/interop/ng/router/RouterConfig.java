package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Object" )
public class RouterConfig
{
	public String path;

	public Object component;

	public String redirectTo;

	public String pathMatch;

	@JsOverlay
	public static RouterConfig route( String path, Object component )
	{
		RouterConfig res = new RouterConfig();

		res.path = path;
		res.component = component;

		return res;
	}

	@JsOverlay
	public static RouterConfig route( String path, String redirectTo, String pathMatch )
	{
		RouterConfig res = new RouterConfig();

		res.path = path;
		res.redirectTo = redirectTo;
		res.pathMatch = pathMatch;

		return res;
	}
}