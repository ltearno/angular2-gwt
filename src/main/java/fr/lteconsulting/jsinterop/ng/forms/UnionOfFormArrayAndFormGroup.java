package fr.lteconsulting.jsinterop.ng.forms;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfFormArrayAndFormGroup extends AbstractControl  {
    public UnionOfFormArrayAndFormGroup() {
        super(null, null);
    }
    @JsOverlay
    public final FormArray asFormArray() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfFormArrayAndFormGroup ofFormArray(FormArray value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final FormGroup asFormGroup() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfFormArrayAndFormGroup ofFormGroup(FormGroup value) {
        return Js.uncheckedCast( value );
    }
    
}
