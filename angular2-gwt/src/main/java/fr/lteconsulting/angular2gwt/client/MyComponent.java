package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.AngularComponent;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * An Angular 2 component implemented in Java with GWT
 * 
 * <p>
 * This class is exported to JS through the {@link JsType} annotation. It won't be instantiated by your application
 * but will be instantiated directly by Angular
 * 
 * <p>
 * Todo : be able to specify a file for the template, it will much handier for declaring the template
 * 
 * @author Arnaud Tournier
 *         (c) LTE Consulting 2016
 */
// @formatter:off
@AngularComponent(
		selector = "my-app",
		template = "<div>"
				+ "<h1>Simple Angular 2 Application</h1>"
				+ "Name of hero to add : {{name}}<br/>"
				+ "<input [(ngModel)]='name'><br/>"
				+ "<button (click)='onClick($event)'>Add</button>"
				+ "<ul>"
					+ "<li *ngFor='#hero of heroes'>{{ hero }}</li>"
				+ "</ul>"
				+ "</div>" )
// @formatter:on
@JsType
public class MyComponent
{
	/**
	 * Those two fields will be bound by Angular. They can also be accessed as normal fields in the controller's code, as in the onClick method
	 */
	@JsProperty
	private String name;

	@JsProperty
	private JsArray<String> heroes;

	/**
	 * This constructor dumbly initialize the fields to hard coded values.
	 * 
	 * <p>
	 * Much more could be done by inspecting the angular inputs and scope
	 */
	public MyComponent()
	{
		name = "Arnaud";
		heroes = JsArray.of( new String[] { "Windstorm", "Bombasto", "Magneta", "Tornado" } );
	}

	/**
	 * This method is declared in the template string to e the function to be called when the user clicks on the button.
	 * 
	 * Here the method pushes a new entry in the 'heroes' array, which is bound by Angular. So when the user clicks, a new
	 * entry is displayed and the view is automatically refreshed.
	 */
	@JsMethod
	private void onClick()
	{
		heroes.push( name );
	}
}
