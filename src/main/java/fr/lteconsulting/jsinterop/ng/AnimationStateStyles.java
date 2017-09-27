package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory".AnimationStateStyles
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory.d.ts:1192
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationStateStyles")
public class AnimationStateStyles
{

    /*
        Constructors
    */
    public AnimationStateStyles(StyleAst styles, AnonymousType717 defaultParams){
    }

    /*
        Properties
    */

    public Object defaultParams;

    @JsProperty( name = "defaultParams")
    public native Object getDefaultParams();

    @JsProperty( name = "defaultParams")
    public native void setDefaultParams( Object value );

    public Object styles;

    @JsProperty( name = "styles")
    public native Object getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(buildStyles,290,,P(dC(----3----)),P(d7<1>))
      * TE Signature : S(buildStyles,P(dC(----3----)),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory.d.ts@1375
     */
    public native ThetaStyleData buildStyles(AnonymousType717 params, Array<String> errors);
}
