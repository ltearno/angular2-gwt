package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.shared.GWT;

import fr.lteconsulting.angular2gwt.client.tools.AngularTools;
import fr.lteconsulting.angular2gwt.client.tools.JSON;
import fr.lteconsulting.angular2gwt.client.tools.XMLHttpRequest;
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
		String url = "heroes";
		XMLHttpRequest req = new XMLHttpRequest();
		req.open( "GET", url, true );
		req.setOnreadystatechange( event -> {
			if( req.getReadyState() == 4 )
			{
				if( req.getStatus() == 200 )
				{
					JsArray<Object> os = JSON.parse( req.getResponseText() );
					heroes = AngularTools.convertDtoList( os, Hero.class );
					GWT.log( "result length: " + heroes.length() + ": " + heroes );
				}
				else
				{
					GWT.log( "error fetching service data with url " + url );
				}
			}
		} );
		req.send( null );
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
