package fr.lteconsulting.angular2gwt.ng.core;

/**
 * Put this annotation on a getter method to use it to simulate a javascript property on the class (which should be @JsType(isNative=false))
 */
public @interface PropertyGetter
{
	String name() default "";
}
