package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.shared.GWT;

import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
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
		heroes = new Promise<>( ( resolver, rejecter ) -> {
			Ajax.sendRequestAndConvertDtoList( "GET", "heroes", Hero.class ).then( list -> {
				_heroes = list;
				resolver.resolve( list );
			}, error -> GWT.log( "error getting heroes " + error ) );
		} );
	}

	public Promise<JsArray<Hero>, String> getHeroes()
	{
		return heroes;
	}

	public Promise<Hero, String> addHero()
	{
		return new Promise<>( ( resolver, rejecter ) -> {
			Ajax.sendRequestAndConvertDto( "GET", "addHero", Hero.class ).then( hero -> {
				_heroes.push( hero );
				resolver.resolve( hero );
			}, error -> rejecter.reject( "error while adding an hero : " + error ) );
		} );
	}

	public Promise<Void, String> deleteHero( Hero hero )
	{
		return new Promise<>( ( resolver, rejecter ) -> {
			Ajax.sendRequest( "GET", "deleteHero?id=" + hero.getId() ).then( result -> {
				int index = _heroes.indexOf( hero );
				if( index > -1 )
					_heroes.splice( index, 1 );

				resolver.resolve( null );
			}, error -> rejecter.reject( "error while deleting hero " + hero.getId() + ": " + error ) );
		} );

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
