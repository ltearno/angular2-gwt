package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import fr.lteconsulting.angular2gwt.RouteConfig;
import fr.lteconsulting.angular2gwt.client.interop.angular.RouterDirectives;
import fr.lteconsulting.angular2gwt.client.interop.angular.RouterProviders;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Main angular component for the application.
 * 
 * <p>
 * It simply binds to the <my-app> tag and delegates to <hero-list> tag.
 * 
 * <p>
 * It declares the {@link HeroService} as a dependency injection provider, so that it is available
 * to the child components
 * 
 * @author Arnaud Tournier
 *         (c) LTE Consulting 2016
 */
//@formatter:off
@Component(
	selector = "my-app",
	template = "<div class='container'><h1>{{title}}</h1></div><div class='container'><nav class='col-md-4'><a [routerLink]=\\\"['Dashboard']\\\">Dashboard</a><a [routerLink]=\\\"['Heroes']\\\">Heroes</a></nav><div class='.col-md-8'><router-outlet></router-outlet></div></div>",
	directives = {RouterDirectives.class},
	providers = {HeroService.class, RouterProviders.class} )
@RouteConfig(
    path= "/",
    name= "Heroes",
    useAsDefault= true,
    component= HeroesComponent.class )
@RouteConfig(
	path= "/dashboard",
	name= "Dashboard",
	component= DashboardComponent.class )
@RouteConfig(
	path="/detail/:id",
	name= "HeroDetail",
	component= HeroFormComponent.class)
//@formatter:on
@JsType
public class ApplicationComponent
{
	@JsProperty
	private String title = "Tour of Heroes";
}
