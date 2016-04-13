package fr.lteconsulting.angular2gwt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Component {
	String selector();

	String template() default "";

	String templateUrl() default "";

	String styles() default "";

	String[] styleUrls() default {};

	Class<?>[] directives() default {};

	Class<?>[] providers() default {};
}
