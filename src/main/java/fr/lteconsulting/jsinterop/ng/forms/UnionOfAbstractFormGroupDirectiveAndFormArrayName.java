package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.OnInit;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAbstractFormGroupDirectiveAndFormArrayName extends ControlContainer,OnInit,OnDestroy  {
    @JsOverlay
    default AbstractFormGroupDirective asAbstractFormGroupDirective() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAbstractFormGroupDirectiveAndFormArrayName ofAbstractFormGroupDirective(AbstractFormGroupDirective value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FormArrayName asFormArrayName() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAbstractFormGroupDirectiveAndFormArrayName ofFormArrayName(FormArrayName value) {
        return Js.cast( value );
    }
    
}
