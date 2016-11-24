package fr.lteconsulting.angular2gwt.ng.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Binds an Host element property to the annotated field
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.FIELD )
public @interface HostBinding
{
	/**
	 * Property name, by default the name of the method
	 */
	String value() default "";
}
