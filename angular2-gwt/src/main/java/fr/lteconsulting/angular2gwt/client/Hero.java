package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Hero
{
	@JsProperty
	private int id;

	@JsProperty
	private String name;

	public Hero( String name )
	{
		this.id = Counter.nextId++;
		this.name = name;
	}
}

/**
 * This is a little hack to have a static modifiable counter available for the Hero class.
 */
class Counter
{
	static int nextId = 1;
}