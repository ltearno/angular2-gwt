package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsType;

@JsType
public class HeroService
{
	private JsArray<Hero> heroes = JsArray.of( new Hero( "Injector", "Do nothing", null ), new Hero( "Windstorm", "Do nothing", null ), new Hero( "Bombasto", "Do nothing", null ), new Hero( "Magneta", "Do nothing", null ), new Hero( "Tornado", "Do nothing", null ) );

	public JsArray<Hero> getHeroes()
	{
		return heroes;
	}
}
