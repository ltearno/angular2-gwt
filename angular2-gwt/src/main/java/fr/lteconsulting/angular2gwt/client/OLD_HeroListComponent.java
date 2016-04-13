package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
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
@Component(
		selector = "old-hero-list",
		template = "<div>"
				+ "<h1>Angular 2 GWT proof of concept Application</h1>"
				+ "<p>There are {{heroes.length}} heroes<b *ngIf='heroes.length> 6'>, that's a lot !</b></p>"
				+ "Name of hero to add : {{name}}<br/>"
				+ "<input #newHero [(ngModel)]='name' (keyup.enter)='addHero(newHero.value)' (blur)='addHero(newHero.value); newHero.value=\\\"\\\";'><br/>"
				+ "<button (click)='addHero(newHero.value)'>Add</button>"
				+ "<ul>"
					+ "<li *ngFor='#hero of heroes'>{{ hero.name }}</li>"
				+ "</ul>"
				+ "</div>" )
// @formatter:on
@JsType
public class OLD_HeroListComponent
{
	/**
	 * Those two fields will be bound by Angular. They can also be accessed as normal fields in the controller's code, as in the addHero method
	 */
	@JsProperty
	private String name;

	@JsProperty
	private JsArray<Hero> heroes;

	/**
	 * This constructor dumbly initialize the fields to hard coded values.
	 * 
	 * <p>
	 * Much more could be done by inspecting the angular inputs and scope
	 */
	public OLD_HeroListComponent()
	{
		name = "Arnaud";
		heroes = JsArray.of( new Hero( "Windstorm", "Do nothing", null ), new Hero( "Bombasto", "Do nothing", null ), new Hero( "Magneta", "Do nothing", null ), new Hero( "Tornado", "Do nothing", null ) );
	}

	/**
	 * This method is declared in the template string to e the function to be called when the user clicks on the button.
	 * 
	 * Here the method pushes a new entry in the 'heroes' array, which is bound by Angular. So when the user clicks, a new
	 * entry is displayed and the view is automatically refreshed.
	 */
	@JsMethod
	private void addHero( String heroName )
	{
		heroes.push( new Hero( name, "Do nothing", null ) );
	}
}
