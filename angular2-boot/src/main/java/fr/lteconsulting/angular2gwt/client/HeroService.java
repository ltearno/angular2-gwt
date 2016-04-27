package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.shared.GWT;

import fr.lteconsulting.angular2gwt.client.tools.Ajax;
import fr.lteconsulting.angular2gwt.client.tools.AngularTools;
import fr.lteconsulting.angular2gwt.client.tools.JSON;
import fr.lteconsulting.angular2gwt.client.tools.promise.Rejection;
import fr.lteconsulting.angular2gwt.client.tools.promise.Resolution;
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
	private JsArray<Hero> heroes = JsArray.of();

	public HeroService()
	{
		Ajax.sendRequest( "GET", "heroes" ).then( new Resolution<String>()
		{
			@Override
			public void resolved( String value )
			{
				JsArray<Object> os = JSON.parse( value );
				heroes = AngularTools.convertDtoList( os, Hero.class );
				GWT.log( "result length: " + heroes.length() + ": " + heroes );
			}
		}, new Rejection<Object>()
		{
			@Override
			public void rejected( Object error )
			{
				GWT.log( "ajax error ! " + error );
			}
		} );
	}

	public JsArray<Hero> getHeroes()
	{
		return heroes;
	}

	public void addHero( Hero hero )
	{
		heroes.push( hero );
	}

	public Hero getHero( int id )
	{
		for( Hero h : heroes.iterate() )
		{
			if( h.getId() == id )
				return h;
		}

		return null;
	}
}
