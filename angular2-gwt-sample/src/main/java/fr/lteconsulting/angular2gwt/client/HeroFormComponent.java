package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import fr.lteconsulting.angular2gwt.Input;
import jsinterop.annotations.JsConstructor;
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
	private HeroService heroService;
	private RouteParams routeParams;

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
	private HeroFormComponent( HeroService heroService, RouteParams routeParams )
	{
		this.heroService = heroService;
		this.routeParams = routeParams;
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

	@JsMethod
	private void ngOnInit()
	{
		Object oId = routeParams.get( "id" );
		int id = Integer.parseInt( String.valueOf( oId ) );
		Hero hero = heroService.getHero( id );
		this.model = hero;
	}

	@JsMethod
	private void goBack()
	{
		back();
	}

	@JsMethod( namespace = "window.history", name = "back" )
	private static native void back();
}
