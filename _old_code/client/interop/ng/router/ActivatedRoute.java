package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import fr.lteconsulting.angular2gwt.client.JsObject;
import fr.lteconsulting.angular2gwt.client.interop.angular.rxjs.Observable;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng.router", name = "ActivatedRoute" )
public class ActivatedRoute
{
	// TODO : public Observable<JsArray<UrlPathWithParams>> url;

	public Observable<JsObject> params; // Params

	// TODO : public Observable<Data> data;

	public String outlet;

	public Object component; // Type / string
}