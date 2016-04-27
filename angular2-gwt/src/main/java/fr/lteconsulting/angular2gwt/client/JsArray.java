package fr.lteconsulting.angular2gwt.client;

import java.util.Iterator;
import java.util.List;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Class to work with Javascript arrays.
 * 
 * <p>
 * Gives to methods to convert between this and Java arrays.
 * 
 * <p>
 * <i>TODO</i>implement {@link List}
 */
@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Array" )
public class JsArray<T>
{
	@JsOverlay
	@SafeVarargs
	public final static <T> JsArray<T> of( T... array )
	{
		JsArray<T> result = new JsArray<>();
		for( T item : array )
			result.push( item );
		return result;
	}

	@JsMethod
	public native void push( T item );

	@JsProperty( name = "length" )
	public native int length();

	@JsMethod
	public native JsArray<T> slice( int start, int end );

	@JsMethod
	public native int indexOf( T item );

	@JsMethod
	public native void splice( int start, int length );

	@JsOverlay
	public final T get( int index )
	{
		return JsTools.get( this, index );
	}

	@JsOverlay
	public final Iterable<T> iterate()
	{
		return new Iterable<T>()
		{
			@Override
			public Iterator<T> iterator()
			{
				return new Iterator<T>()
				{
					int index = 0;

					@Override
					public boolean hasNext()
					{
						return index < length();
					}

					@Override
					public T next()
					{
						T result = get( index );
						index++;
						return result;
					}

					@Override
					public void remove()
					{
						throw new RuntimeException();
					}
				};
			}
		};
	}
}
