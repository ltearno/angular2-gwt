package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import fr.lteconsulting.angular2gwt.client.interop.angular.Router;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off
@Component(
	selector = "my-dashboard",
	templateUrl= "dashboard.component.html"
)
//@formatter:on
@JsType
public class DashboardComponent
{
	private HeroService heroService;
	private Router router;

	@JsProperty
	private JsArray<Hero> heroes;

	@JsConstructor
	DashboardComponent( HeroService heroService, Router router )
	{
		this.heroService = heroService;
		this.router = router;
	}

	@JsMethod
	void ngOnInit()
	{
		heroService.getHeroes().then( list -> heroes = list.slice( 1, 5 ), null );
	}

	@JsMethod
	private void gotoDetail( Hero hero )
	{
		router.navigate( JsArray.of( "Hero", new LinkDto( hero.getId() ) ) );
	}
}

@JsType
class LinkDto
{
	@JsProperty
	int id;

	public LinkDto( int id )
	{
		this.id = id;
	}
}