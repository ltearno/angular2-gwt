package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.hexa.gwt.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * This is an Angular 2 component implemented in Java with GWT
 * 
 * <p>
 * Todo : be able to specify a file for the template
 * 
 * @author Arnaud Tournier
 */
@JsType
/@AngularComponent( selector = "my-app", template = "<div><h1>Simple Angular 2 Application</h1>Name of hero to add : {{name}}<br/><input [(ngModel)]=\"name\"><br/><button (click)=\"onClick($event)\">Add</button><ul><li *ngFor=\"#hero of heroes\">{{ hero }}</li></ul></div>" )
public class MyComponent
{
	@JsProperty
	private String name;

	@JsProperty
	private JsArray<String> heroes;

	public MyComponent()
	{
		name = "Arnaud";
		heroes = JsArray.of( new String[] { "Windstorm", "Bombasto", "Magneta", "Tornado" } );
	}

	@JsMethod
	private void onClick()
	{
		heroes.push( name );
	}
}
