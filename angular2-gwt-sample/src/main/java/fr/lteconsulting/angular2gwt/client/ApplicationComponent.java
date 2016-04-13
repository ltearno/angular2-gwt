package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import jsinterop.annotations.JsType;

//@formatter:off
@Component(
		selector = "my-app",
		template = "<hero-list></hero-list>",
		directives = {HeroListComponent.class},
		providers = {HeroService.class}
		)
//@formatter:on
@JsType
public class ApplicationComponent
{
}
