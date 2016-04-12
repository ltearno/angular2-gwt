package fr.lteconsulting.angular2gwt.client;

import com.google.gwt.core.client.GWT;

import fr.lteconsulting.angular2gwt.AngularComponent;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off
@AngularComponent(
		selector = "hero-form",
		templateUrl = "hero-form.component.html")
//@formatter:on
@JsType
public class HeroFormComponent
{
	@JsProperty
	private JsArray<String> powers = JsArray.of( "Really Smart", "Super Flexible", "Super Hot", "Weather Changer" );

	@JsProperty
	private Hero model = new Hero( "Dr IQ", powers.get( 0 ), "Chuck Overstreet" );

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
