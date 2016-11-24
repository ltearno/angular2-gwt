package fr.lteconsulting.angular2gwt.ng.core;

public @interface ViewChildren
{
	Class<?> component() default Void.class;

	String selector() default "";
}
