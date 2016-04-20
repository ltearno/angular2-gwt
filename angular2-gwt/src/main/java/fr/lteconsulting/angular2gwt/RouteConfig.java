package fr.lteconsulting.angular2gwt;

import java.lang.annotation.Repeatable;

@Repeatable(RouteConfigs.class)
public @interface RouteConfig {
	String path();

	String name();

	Class<?> component();

	boolean useAsDefault() default false;
}
