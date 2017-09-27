package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.client.interop.ng.AngularTools;
import fr.lteconsulting.angular2gwt.client.interop.promise.Executor;
import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
import fr.lteconsulting.angular2gwt.client.interop.promise.Rejector;
import fr.lteconsulting.angular2gwt.client.interop.promise.Resolver;
import fr.lteconsulting.angular2gwt.client.interop.xmlhttprequest.XMLHttpRequest;

public class Ajax
{
	public static Promise<String> sendRequest( String method, String url )
	{
		return sendRequest( method, url, null );
	}

	public static Promise<String> sendRequest( String method, String url, Object data )
	{
		return new Promise<>( new Executor<String>()
		{
			@Override
			public void execute( Resolver<String> resolver, Rejector rejecter )
			{
				XMLHttpRequest req = new XMLHttpRequest();

				req.open( method, url, true );

				if( data != null )
				{
					req.setRequestHeader( "Content-Type", "application/json" );
				}

				req.setOnreadystatechange( event -> {
					if( req.getReadyState() == 4 )
					{
						if( req.getStatus() == 200 )
							resolver.resolve( req.getResponseText() );
						else
							rejecter.reject( "error fetching service (status: " + req.getStatus() + ") data with url " + url );
					}
				} );

				req.send( data != null ? JSON.stringify( data ) : null );
			}
		} );
	}

	public static <T> Promise<T> sendRequestAndConvertDto( String method, String url, Class<T> convertedClass )
	{
		return sendRequestAndConvertDto( method, url, null, convertedClass );
	}

	public static <T> Promise<T> sendRequestAndConvertDto( String method, String url, Object data, Class<T> convertedClass )
	{
		return new Promise<>( new Executor<T>()
		{
			@Override
			public void execute( Resolver<T> resolver, Rejector rejecter )
			{
				Ajax.sendRequest( method, url, data ).then( value -> {
					Object dto = JSON.parse( value );
					T convertedDto = AngularTools.convertDto( dto, convertedClass );

					resolver.resolve( convertedDto );
					return null;
				}, ( error ) -> {
					rejecter.reject( "error getting heroes because of: " + error );
					return null;
				} );
			}
		} );
	}

	public static <T> Promise<JsArray<T>> sendRequestAndConvertDtoList( String method, String url, Class<T> convertedClass )
	{
		return sendRequestAndConvertDtoList( method, url, null, convertedClass );
	}

	public static <T> Promise<JsArray<T>> sendRequestAndConvertDtoList( String method, String url, Object data, Class<T> convertedClass )
	{
		return new Promise<>( ( resolver, rejecter ) -> {
			Ajax.sendRequest( method, url, data ).then( value -> {
				JsArray<Object> dtoList = JSON.parse( value );
				JsArray<T> convertedList = AngularTools.convertDtoList( dtoList, convertedClass );

				resolver.resolve( convertedList );
				return null;
			}, ( error ) -> {
				rejecter.reject( "error getting heroes because of: " + error );
				return null;
			} );
		} );
	}
}
