package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.client.interop.promise.Executor;
import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
import fr.lteconsulting.angular2gwt.client.interop.promise.Rejector;
import fr.lteconsulting.angular2gwt.client.interop.promise.Resolver;
import fr.lteconsulting.angular2gwt.client.interop.xmlhttprequest.XMLHttpRequest;

public class Ajax
{
	public static Promise<String, Object> sendRequest( String method, String url )
	{
		return new Promise<>( new Executor<String, Object>()
		{
			@Override
			public void execute( Resolver<String> resolver, Rejector<Object> rejecter )
			{
				XMLHttpRequest req = new XMLHttpRequest();

				req.open( method, url, true );

				req.setOnreadystatechange( event -> {
					if( req.getReadyState() == 4 )
					{
						if( req.getStatus() == 200 )
							resolver.resolve( req.getResponseText() );
						else
							rejecter.reject( "error fetching service (status: " + req.getStatus() + ") data with url " + url );
					}
				} );

				req.send( null );
			}
		} );
	}
}
