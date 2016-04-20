package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.client.GWT;

import fr.lteconsulting.angular2gwt.Component;
import fr.lteconsulting.angular2gwt.Router;
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

		GWT.log( "Dashboard constructor, " + heroService );
	}

	// TODO Not called, maybe also a check against typeof prevents it...
	@JsMethod
	void ngOnInit()
	{
		heroes = heroService.getHeroes().slice( 1, 5 );

		GWT.log( "NG ON INIT !!!, lenght=" + heroes.length() );
	}

	@JsMethod
	private void gotoDetail( Hero hero )
	{
		// TODO : this needs to be more user friendly

		GWT.debugger();
		JsArray<Object> link = new JsArray<>();
		link.push( "$wnd." + HeroFormComponent.class.getName() );
		LinkDto linkDto = new LinkDto();
		linkDto.id = String.valueOf( hero.getId() );
		link.push( linkDto );
		router.navigate( link );
	}
}

@JsType( namespace = JsPackage.GLOBAL, name = "Object" )
class LinkDto
{
	@JsProperty
	String id;
}