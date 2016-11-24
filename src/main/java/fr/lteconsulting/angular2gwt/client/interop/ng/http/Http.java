package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import fr.lteconsulting.angular2gwt.client.interop.angular.rxjs.Observable;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.http", name = "Http" )
public class Http
{
	public native Observable<Response> get( String url );

	public native Observable<Response> post( String url );

	public native Observable<Response> post( String url, String data, Object options );

	public native Observable<Response> put( String url );

	public native Observable<Response> put( String url, String data, Object options );

	public native Observable<Response> delete( String url );

	public native Observable<Response> delete( String url, Object options );
}
