package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.client.interop.angular.AngularTools;
import fr.lteconsulting.angular2gwt.client.interop.promise.Executor;
import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
import fr.lteconsulting.angular2gwt.client.interop.promise.Rejection;
import fr.lteconsulting.angular2gwt.client.interop.promise.Rejector;
import fr.lteconsulting.angular2gwt.client.interop.promise.Resolution;
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

	public static <T> Promise<T, Object> sendRequestAndConvertDto( String method, String url, Class<T> convertedClass )
	{
		return new Promise<>( new Executor<T, Object>()
		{
			@Override
			public void execute( Resolver<T> resolver, Rejector<Object> rejecter )
			{
				Ajax.sendRequest( method, url ).then( new Resolution<String>()
				{
					@Override
					public void resolved( String value )
					{
						Object dto = JSON.parse( value );
						T convertedDto = AngularTools.convertDto( dto, convertedClass );

						resolver.resolve( convertedDto );
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

	public static <T> Promise<JsArray<T>, Object> sendRequestAndConvertDtoList( String method, String url, Class<T> convertedClass )
	{
		return new Promise<>( new Executor<JsArray<T>, Object>()
		{
			@Override
			public void execute( Resolver<JsArray<T>> resolver, Rejector<Object> rejecter )
			{
				Ajax.sendRequest( method, url ).then( new Resolution<String>()
				{
					@Override
					public void resolved( String value )
					{
						JsArray<Object> dtoList = JSON.parse( value );
						JsArray<T> convertedList = AngularTools.convertDtoList( dtoList, convertedClass );

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
}
