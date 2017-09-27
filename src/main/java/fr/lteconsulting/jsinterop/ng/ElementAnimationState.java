package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine".ElementAnimationState
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:963
  * 
 */
@JsType(isNative=true, namespace="ng", name="ElementAnimationState")
public class ElementAnimationState
{

    /*
        Properties
    */

    public Boolean hasAnimation;

    @JsProperty( name = "hasAnimation")
    public native Boolean getHasAnimation();

    @JsProperty( name = "hasAnimation")
    public native void setHasAnimation( Boolean value );

    public String namespaceId;

    @JsProperty( name = "namespaceId")
    public native String getNamespaceId();

    @JsProperty( name = "namespaceId")
    public native void setNamespaceId( String value );

    public Boolean removedBeforeQueried;

    @JsProperty( name = "removedBeforeQueried")
    public native Boolean getRemovedBeforeQueried();

    @JsProperty( name = "removedBeforeQueried")
    public native void setRemovedBeforeQueried( Boolean value );

    public Object setForRemoval;

    @JsProperty( name = "setForRemoval")
    public native Object getSetForRemoval();

    @JsProperty( name = "setForRemoval")
    public native void setSetForRemoval( Object value );
}
