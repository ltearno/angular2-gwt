package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.router", name = "RouterModule" )
public class RouterModule
{
	public static native Object forRoot( JsArray<RouterConfig> routes );

	public static native Object forRoot( JsArray<RouterConfig> routes, Object options );
}
