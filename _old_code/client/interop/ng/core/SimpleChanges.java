package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import java.util.Iterator;
import java.util.Map.Entry;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = JsPackage.GLOBAL, name = "Object" )
public class SimpleChanges extends JsObject
{
	@JsOverlay
	public final Iterable<Entry<String, SimpleChange>> changes()
	{
		return new Iterable<Entry<String, SimpleChange>>()
		{
			@Override
			public Iterator<Entry<String, SimpleChange>> iterator()
			{
				return new Iterator<Entry<String, SimpleChange>>()
				{
					private JsArray<String> propertyNames = JsObject.getOwnPropertyNames( SimpleChanges.this );
					private int index = 0;

					@Override
					public Entry<String, SimpleChange> next()
					{
						String propertyName = propertyNames.get( index );
						index++;

						return new Entry<String, SimpleChange>()
						{
							@Override
							public SimpleChange setValue( SimpleChange value )
							{
								SimpleChange previous = getValue();
								SimpleChanges.this.set( propertyName, value );
								return previous;
							}

							@Override
							public SimpleChange getValue()
							{
								return SimpleChanges.this.get( propertyName );
							}

							@Override
							public String getKey()
							{
								return propertyName;
							}
						};
					}

					@Override
					public boolean hasNext()
					{
						return index < propertyNames.length();
					}
				};
			}
		};
	}
}