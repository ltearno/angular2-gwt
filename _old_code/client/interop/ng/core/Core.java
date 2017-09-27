package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsObject;
import jsinterop.annotations.JsType;

@JsType( isNative = true, namespace = "ng", name = "core" )
public class Core
{
	// @JsMethod( namespace = "ng.core", name = "provide" )
	public static native <T> T provide( Class<?> provider, Object options );

	// @JsMethod( namespace = "ng.core" )
	public static native void enableProdMode();

	public static native AnimationAnimateMetadata animate( String timing );

	public static native AnimationAnimateMetadata animate( String timing, AnimationStyleMetadata styles );

	public static native AnimationAnimateMetadata animate( String timing, AnimationKeyframesSequenceMetadata styles );

	public static native AnimationAnimateMetadata animate( int timing );

	public static native AnimationAnimateMetadata animate( int timing, AnimationStyleMetadata styles );

	public static native AnimationAnimateMetadata animate( int timing, AnimationKeyframesSequenceMetadata styles );

	public static native AnimationGroupMetadata group( JsArray<AnimationMetadata> steps );

	public static native AnimationSequenceMetadata sequence( JsArray<AnimationMetadata> steps );

	public static native AnimationStyleMetadata style( String tokens );

	// can be String or JsObject
	public static native AnimationStyleMetadata style( JsArray<Object> tokens );

	public static native AnimationStyleMetadata style( JsObject tokens );

	public static native AnimationStateDeclarationMetadata state( String stateNameExpr, AnimationStyleMetadata styles );

	public static native AnimationKeyframesSequenceMetadata keyframes( JsArray<AnimationStyleMetadata> steps );

	public static native AnimationStateTransitionMetadata transition( String stateChangeExpr, AnimationMetadata steps );

	public static native AnimationStateTransitionMetadata transition( String stateChangeExpr, JsArray<AnimationMetadata> steps );

	public static native AnimationEntryMetadata trigger( String name, JsArray<AnimationStateMetadata> animation );
}
