package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.client.EntryPoint;

import fr.lteconsulting.angular2gwt.client.angular2.Browser;

/**
 * This is a very first step trying to integrate Angular 2 with GWT 2.8
 * 
 * <p>
 * This application is just a little bit more evolved than the Angular 2 Hello World application,
 * but not much more...
 * 
 * <p>
 * Next work is to be able to nest components and declare inputs and outputs directly in the Java code.
 * 
 * @author Arnaud Tournier
 *         (c) LTE Consulting 2016
 */
public class Application implements EntryPoint
{
	@Override
	public void onModuleLoad()
	{
		/**
		 * Here we just bootstrap the Angular 2 framework with our application controller.
		 * 
		 * The application controller is implemented in the {@link HeroListComponent} class
		 */
		Browser.bootstrap( ApplicationComponent_AngularComponent.get() );
	}
}