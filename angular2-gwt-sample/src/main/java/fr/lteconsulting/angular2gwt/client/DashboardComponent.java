package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
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
		heroes = heroService.getHeroes().slice( 1, 5 );
	}

	@JsMethod
	private void gotoDetail( Hero hero )
	{
		router.navigate( JsArray.of( "HeroDetail", new LinkDto( hero.getId() ) ) );
	}
}

@JsType( namespace = JsPackage.GLOBAL, name = "Object" )
class LinkDto
{
	@JsProperty
	int id;

	public LinkDto( int id )
	{
		this.id = id;
	}
}