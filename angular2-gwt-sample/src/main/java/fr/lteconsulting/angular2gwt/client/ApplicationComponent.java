package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
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
		template = "<hero-list></hero-list>",
		directives = {HeroListComponent.class},
		providers = {HeroService.class}
		)
//@formatter:on
@JsType
public class ApplicationComponent
{
}
