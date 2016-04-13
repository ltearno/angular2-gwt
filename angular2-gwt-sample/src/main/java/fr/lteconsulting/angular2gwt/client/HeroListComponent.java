package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off
@Component(
		selector = "hero-list",
		templateUrl = "hero-list.component.html",
		styleUrls = {"hero-list.component.css"},
		directives = {HeroFormComponent.class})
//@formatter:on
@JsType
public class HeroListComponent
{
	@JsProperty
	private String title;

	@JsProperty
	private Hero selectedHero;

	@JsProperty
	private JsArray<Hero> heroes;

	public HeroListComponent( HeroService heroService )
	{
		this.heroes = heroService.getHeroes();
	}

	@JsMethod
	private void onSelect( Hero hero )
	{
		selectedHero = hero;
	}
}
