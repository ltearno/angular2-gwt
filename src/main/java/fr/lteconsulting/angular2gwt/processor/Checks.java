package fr.lteconsulting.angular2gwt.processor;

import javax.annotation.processing.Messager;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.tools.Diagnostic.Kind;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

public class Checks
{
	private final Messager messager;
	private final Kind level = Kind.WARNING;

	public Checks( Messager messager )
	{
		this.messager = messager;
	}

	public void checkIsJsTypeNonNative( Element element )
	{
		JsType a = element.getAnnotation( JsType.class );
		if( a == null || a.isNative() )
		{
			messager.printMessage( level, "Be careful, this class needs the @JsType annotation, and isNative should be false (which is the default value)", element );
		}
	}

	public <T extends Element> T checkIsJsProperty( T field )
	{
		boolean hasJsProperty = field.getAnnotation( JsProperty.class ) != null;
		if( hasJsProperty )
			return field;

		boolean isImplicit = isImplicitJsPropertyOrMethod( field );
		if( isImplicit )
			return field;

		messager.printMessage( level, "Be careful, this field needs the @JsProperty annotation, or be public of a non native @JsType class", field );
		
		return field;
	}
	
	public void checkIsJsMethod( ExecutableElement method )
	{
		boolean hasJsMethod = method.getAnnotation( JsMethod.class ) != null;
		if( hasJsMethod )
			return;

		boolean isImplicit = isImplicitJsPropertyOrMethod( method );
		if( isImplicit )
			return;
		
		messager.printMessage( level, "Be careful, this method needs the @JsMethod annotation, or be public of a non native @JsType class", method );
	}

	private boolean isImplicitJsPropertyOrMethod( Element field )
	{
		boolean isImplicit = field.getModifiers().contains( Modifier.PUBLIC )
				&& field.getEnclosingElement().getAnnotation( JsType.class ) != null
				&& !field.getEnclosingElement().getAnnotation( JsType.class ).isNative();
		return isImplicit;
	}
}
