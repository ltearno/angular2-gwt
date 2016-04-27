package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.shared.GWT;

import fr.lteconsulting.angular2gwt.client.interop.promise.Executor;
import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
import fr.lteconsulting.angular2gwt.client.interop.promise.Rejector;
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
				Ajax.sendRequestAndConvertDtoList( "GET", "heroes", Hero.class ).then( list -> {
					_heroes = list;
					resolver.resolve( list );
				}, error -> GWT.log( "error getting heroes " + error ) );
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

	public void deleteHero( Hero hero )
	{
		int index = _heroes.indexOf( hero );
		if( index > -1 )
			_heroes.splice( index, 1 );
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
