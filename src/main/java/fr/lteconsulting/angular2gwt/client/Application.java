package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.client.EntryPoint;

import fr.lteconsulting.angular2gwt.client.angular2.Browser;
import fr.lteconsulting.angular2gwt.client.angular2.ComponentMetadata;

/**
 * This is a very first step trying to integrate Angular 2 with GWT 2.8
 * 
 * <p>
 * This application is just a little bit more evolved than the Angular 2 Hello World application,
 * but not much more...
 * 
 * <p>
 * Next work is to be able to nest components and declare inputs and outputs directly in the Java code.
 * 
 * @author Arnaud Tournier
 */
public class Application implements EntryPoint
{
	private static native Object getAppComponentObject( ComponentMetadata componentMetadata )
	/*-{
		var component = $wnd.fr.lteconsulting.angular2gwt.client.MyComponent;

		component.annotations = [ new $wnd.ng.core.Component(componentMetadata) ];

		return component;
	}-*/;

	@Override
	public void onModuleLoad()
	{
		ComponentMetadata meta = new ComponentMetadata().selector( "my-app" ).template( "<div>" + "<h1>Simple Angular 2 Application</h1>" + "Name of hero to add : {{name}}<br/>" + "<input [(ngModel)]=\"name\"><br/>" + "<button (click)=\"onClick($event)\">Add</button>" + "<ul>"
				+ "<li *ngFor=\"#hero of heroes\">" + "{{ hero }}" + "</li>" + "</ul>" + "</div>" );

		Object component = getAppComponentObject( meta );

		Browser.bootstrap( component );
	}
}