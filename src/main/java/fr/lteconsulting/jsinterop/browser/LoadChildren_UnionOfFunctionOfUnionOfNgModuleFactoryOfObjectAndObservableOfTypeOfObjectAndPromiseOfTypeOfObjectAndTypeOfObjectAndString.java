package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/config.d.ts:9436
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString  {
    @JsOverlay
    //default Function<UnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject> asFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject() {
    default Function<Object> asFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    //static  LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString ofFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject(Function<UnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject> value) {
    static  LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString ofFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject(Function<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
