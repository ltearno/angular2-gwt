package fr.lteconsulting.angular2gwt.client.interop.ng.core;

public interface PipeTransform<T>
{
	T transform( T value, Object... parameters );
}
