package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:2435
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationMetadata")
public class AnimationMetadata
{

    /*
        Properties
    */

    public AnimationMetadataType type;

    @JsProperty( name = "type")
    public native AnimationMetadataType getType();

    @JsProperty( name = "type")
    public native void setType( AnimationMetadataType value );
}
