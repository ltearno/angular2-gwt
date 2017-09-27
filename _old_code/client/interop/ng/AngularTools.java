package fr.lteconsulting.angular2gwt.client.interop.ng;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTools;

public class AngularTools
{
	public static <T> T convertDto( Object dto, Class<T> targetClass )
	{
		T result = JsTools.convertObject( targetClass.getName(), dto );
		return result;
	}

	public static <T> JsArray<T> convertDtoList( JsArray<Object> dtoList, Class<T> targetClass )
	{
		JsArray<T> result = new JsArray<>();
		if( dtoList != null )
		{
			for( Object dto : dtoList.iterate() )
			{
				T converted = convertDto( dto, targetClass );
				result.push( converted );
			}
		}
		return result;
	}
}
