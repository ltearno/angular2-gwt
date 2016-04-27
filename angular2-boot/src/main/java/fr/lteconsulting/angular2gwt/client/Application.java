package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;

import fr.lteconsulting.angular2gwt.client.tools.Executor;
import fr.lteconsulting.angular2gwt.client.tools.Promise;
import fr.lteconsulting.angular2gwt.client.tools.Rejection;
import fr.lteconsulting.angular2gwt.client.tools.Rejector;
import fr.lteconsulting.angular2gwt.client.tools.Resolution;
import fr.lteconsulting.angular2gwt.client.tools.Resolver;

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
		Promise p = new Promise( new Executor()
		{
			@Override
			public void execute( Resolver resolver, Rejector rejecter )
			{
				GWT.log( "EXEC PROMISE" );
				resolver.resolve( "toto" );
			}
		} );
		p.then( new Resolution()
		{
			@Override
			public void resolved( Object value )
			{
				GWT.log( "RECEIVE VALUE " + value );
			}
		}, new Rejection()
		{
			@Override
			public void rejected( Object error )
			{
				GWT.log( "RECEIVE ERROR " + error );
			}
		} );
		/**
		 * Here we just bootstrap the Angular 2 framework with our application controller.
		 * 
		 * The application controller is implemented in the {@link ApplicationComponent} class
		 */
		Angular.bootstrap( ApplicationComponent_AngularComponent.get() );

		// GWT.debugger();
		// Angular.bootstrap( ApplicationComponent_AngularComponent.get(), JsArray.of( RouterProviders.class, Angular.provide( LocationStrategy.class, new
		// LocationStrategyOptions( HashLocationStrategy.class ) ) ) );
	}
}