package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import fr.lteconsulting.angular2gwt.Input;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Component to edit a {@link Hero}
 * 
 * @author Arnaud Tournier
 *         (c) LTE Consulting 2016
 */
//@formatter:off
@Component(
		selector = "hero-form",
		templateUrl = "hero-form.component.html")
//@formatter:on
@JsType
public class HeroFormComponent
{
	@JsIgnore
	private HeroService heroService;

	@JsProperty
	private JsArray<String> powers = JsArray.of( "Really Smart", "Super Flexible", "Super Hot", "Weather Changer", "Do nothing" );

	@Input
	@JsProperty
	private Hero model;

	@JsProperty
	private boolean submitted = false;

	@JsProperty
	private boolean active = true;

	@JsConstructor
	private HeroFormComponent( HeroService heroService )
	{
		this.heroService = heroService;
	}

	@JsMethod
	private void onSubmit()
	{
		submitted = true;
	}

	@JsMethod
	private void newHero()
	{
		model = new Hero( "<no name>", "", null );
		heroService.addHero( model );
		active = false;
		JsTools.setTimeout( () -> active = true, 0 );
	}
}
