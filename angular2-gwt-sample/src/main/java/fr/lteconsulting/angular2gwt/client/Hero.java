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

	@JsProperty
	private String power;

	@JsProperty
	private String alterEgo;

	public Hero( String name, String power, String alterEgo )
	{
		this.id = Counter.nextId++;
		this.name = name;
		this.power = power;
		this.alterEgo = alterEgo;
	}
}

/**
 * This is a little hack to have a static modifiable counter available for the Hero class.
 */
class Counter
{
	static int nextId = 1;
}