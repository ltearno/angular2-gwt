package fr.lteconsulting.angular2gwt.ng.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Binds an Host element event to the annotated method
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface HostListener
{
	/**
	 * Event name, by default the name of the method
	 * 
	 * @return
	 */
	String value() default "";
}
