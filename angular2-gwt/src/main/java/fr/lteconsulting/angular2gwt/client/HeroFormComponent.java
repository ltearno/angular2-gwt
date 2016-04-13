package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import fr.lteconsulting.angular2gwt.Input;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off
@Component(
		selector = "hero-form",
		templateUrl = "hero-form.component.html")
//@formatter:on
@JsType
public class HeroFormComponent
{
	@JsProperty
	private JsArray<String> powers = JsArray.of( "Really Smart", "Super Flexible", "Super Hot", "Weather Changer", "Do nothing" );

	@Input
	@JsProperty
	private Hero model;

	@JsProperty
	private boolean submitted = false;

	@JsProperty
	private boolean active = true;

	@JsMethod
	private void onSubmit()
	{
		submitted = true;
	}

	@JsMethod
	private void newHero()
	{
		model = new Hero( "", "", null );
		active = false;
		JsTools.setTimeout( () -> active = true, 0 );
	}
}
