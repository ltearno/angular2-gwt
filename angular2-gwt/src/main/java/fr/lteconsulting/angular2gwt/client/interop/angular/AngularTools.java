package fr.lteconsulting.angular2gwt.client.interop.angular;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;

public class AngularTools
{
	@JsMethod( namespace = JsPackage.GLOBAL, name = "lteconsultingConvertObject" )
	public static native <T> T lteconsultingConvertObject( String prototypeName, Object template );

	public static <T> T convertDto( Object dto, Class<T> targetClass )
	{
		T result = AngularTools.lteconsultingConvertObject( targetClass.getName(), dto );
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
