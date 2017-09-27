package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType767;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder".AnimationAstBuilderContext
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts:2787
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationAstBuilderContext")
public class AnimationAstBuilderContext
{

    /*
        Constructors
    */
    public AnimationAstBuilderContext(Array<Object> errors){
    }

    /*
        Properties
    */

    public AnonymousType767 collectedStyles;

    @JsProperty( name = "collectedStyles")
    public native AnonymousType767 getCollectedStyles();

    @JsProperty( name = "collectedStyles")
    public native void setCollectedStyles( AnonymousType767 value );

    public TimingAst currentAnimateTimings;

    @JsProperty( name = "currentAnimateTimings")
    public native TimingAst getCurrentAnimateTimings();

    @JsProperty( name = "currentAnimateTimings")
    public native void setCurrentAnimateTimings( TimingAst value );

    public AnimationQueryMetadata currentQuery;

    @JsProperty( name = "currentQuery")
    public native AnimationQueryMetadata getCurrentQuery();

    @JsProperty( name = "currentQuery")
    public native void setCurrentQuery( AnimationQueryMetadata value );

    public String currentQuerySelector;

    @JsProperty( name = "currentQuerySelector")
    public native String getCurrentQuerySelector();

    @JsProperty( name = "currentQuerySelector")
    public native void setCurrentQuerySelector( String value );

    public Number currentTime;

    @JsProperty( name = "currentTime")
    public native Number getCurrentTime();

    @JsProperty( name = "currentTime")
    public native void setCurrentTime( Number value );

    public AnimationTransitionMetadata currentTransition;

    @JsProperty( name = "currentTransition")
    public native AnimationTransitionMetadata getCurrentTransition();

    @JsProperty( name = "currentTransition")
    public native void setCurrentTransition( AnimationTransitionMetadata value );

    public Number depCount;

    @JsProperty( name = "depCount")
    public native Number getDepCount();

    @JsProperty( name = "depCount")
    public native void setDepCount( Number value );

    public Array<Object> errors;

    @JsProperty( name = "errors")
    public native Array<Object> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<Object> value );

    public AnimationOptions options;

    @JsProperty( name = "options")
    public native AnimationOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationOptions value );

    public Number queryCount;

    @JsProperty( name = "queryCount")
    public native Number getQueryCount();

    @JsProperty( name = "queryCount")
    public native void setQueryCount( Number value );
}
