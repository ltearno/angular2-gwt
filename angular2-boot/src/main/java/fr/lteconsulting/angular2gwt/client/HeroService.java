package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.shared.GWT;

import fr.lteconsulting.angular2gwt.client.interop.angular.AngularTools;
import fr.lteconsulting.angular2gwt.client.interop.promise.Executor;
import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
import fr.lteconsulting.angular2gwt.client.interop.promise.Rejection;
import fr.lteconsulting.angular2gwt.client.interop.promise.Rejector;
import fr.lteconsulting.angular2gwt.client.interop.promise.Resolution;
import fr.lteconsulting.angular2gwt.client.interop.promise.Resolver;
import jsinterop.annotations.JsType;

/**
 * Data service for the application
 * 
 * <p>
 * It is injected into dependant components through the DI mechanism of Angular
 * 
 * @author Arnaud Tournier
 *         (c) LTE Consulting 2016
 */
@JsType
public class HeroService
{
	private JsArray<Hero> _heroes;
	private Promise<JsArray<Hero>, String> heroes;

	public HeroService()
	{
		heroes = new Promise<>( new Executor<JsArray<Hero>, String>()
		{
			@Override
			public void execute( Resolver<JsArray<Hero>> resolver, Rejector<String> rejecter )
			{
				Ajax.sendRequest( "GET", "heroes" ).then( new Resolution<String>()
				{
					@Override
					public void resolved( String value )
					{
						JsArray<Object> dtoList = JSON.parse( value );
						JsArray<Hero> convertedList = AngularTools.convertDtoList( dtoList, Hero.class );
						GWT.log( "RECEIVED result length: " + convertedList.length() + ": " + convertedList );

						_heroes = convertedList;
						resolver.resolve( convertedList );
					}
				}, new Rejection<Object>()
				{
					@Override
					public void rejected( Object error )
					{
						rejecter.reject( "error getting heroes because of: " + error );
					}
				} );
			}
		} );
	}

	public Promise<JsArray<Hero>, String> getHeroes()
	{
		return heroes;
	}

	public void addHero( Hero hero )
	{
		heroes.then( list -> list.push( hero ), null );
	}

	public Hero getHero( int id )
	{
		for( Hero h : _heroes.iterate() )
		{
			if( h.getId() == id )
				return h;
		}

		return null;
	}
}
