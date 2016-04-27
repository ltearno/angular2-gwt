package fr.lteconsulting.angular2gwt.client;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Main data object of this application.
 * 
 * <p>
 * Represents a super hero with an id, a name, a power and an alter-ego
 * 
 * @author Arnaud Tournier
 *         (c) LTE Consulting 2016
 */
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

	@JsConstructor
	public Hero()
	{
	}

	@JsIgnore
	public Hero( int id, String name, String power, String alterEgo )
	{
		this();

		this.id = id;
		this.name = name;
		this.power = power;
		this.alterEgo = alterEgo;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getPower()
	{
		return power;
	}

	public String getAlterEgo()
	{
		return alterEgo;
	}
}