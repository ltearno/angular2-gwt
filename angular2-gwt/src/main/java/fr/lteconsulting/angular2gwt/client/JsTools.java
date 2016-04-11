package fr.lteconsulting.angular2gwt.client;

class JsTools
{
	static void setImpl( Object o, Object name, Object value )
	{
		if( value instanceof Integer )
			setImplInternalInt( o, name, (int) ((Integer) value) );
		else
			setImplInternal( o, name, value );
	}

	static native void setImplInternal( Object o, Object name, Object value )
	/*-{
		o[name] = value;
	}-*/;

	static native void setImplInternalInt( Object o, Object name, int value )
	/*-{
		o[name] = value;
	}-*/;

	static native <T> T getImpl( Object o, Object name )
	/*-{
		return o[name] || null;
	}-*/;

	static native <T> T get( Object o, int index )
	/*-{
		return o[index] || null;
	}-*/;

	public static native <I, O> O castAny( I o )
	/*-{
		return o;
	}-*/;
}
