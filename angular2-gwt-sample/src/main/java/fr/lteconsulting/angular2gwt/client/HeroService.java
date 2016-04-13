package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsType;

/**
 * Data service for the application
 * 
 * <p>
 * It is injected into dependant components through the DI mechanism of Angular
 * 
 * @author Arnaud Tournier
 *         (c) LTE Consulting 2016
 */
@JsType
public class HeroService
{
	private JsArray<Hero> heroes = JsArray.of( new Hero( "Injector", "Do nothing", null ), new Hero( "Windstorm", "Do nothing", null ), new Hero( "Bombasto", "Do nothing", null ), new Hero( "Magneta", "Do nothing", null ), new Hero( "Tornado", "Do nothing", null ) );

	public JsArray<Hero> getHeroes()
	{
		return heroes;
	}

	public void addHero( Hero hero )
	{
		heroes.push( hero );
	}
}
