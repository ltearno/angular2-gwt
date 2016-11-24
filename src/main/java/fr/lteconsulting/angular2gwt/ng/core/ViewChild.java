package fr.lteconsulting.angular2gwt.ng.core;

public @interface ViewChild
{
	Class<?> component() default Void.class;

	String selector() default "";
}
