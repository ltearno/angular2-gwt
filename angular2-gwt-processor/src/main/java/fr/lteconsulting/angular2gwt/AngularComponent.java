package fr.lteconsulting.angular2gwt;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention( RetentionPolicy.SOURCE )
public @interface AngularComponent
{
	String selector();

	String template();
}
