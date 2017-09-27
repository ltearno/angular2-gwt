package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Set;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString;
import fr.lteconsulting.jsinterop.ng.core.DoCheck;
import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.IterableDiffers;
import fr.lteconsulting.jsinterop.ng.core.KeyValueDiffers;
import fr.lteconsulting.jsinterop.ng.core.Renderer;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class".NgClass
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class.d.ts:299
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="NgClass")
public class NgClass extends DoCheck
{

    /*
        Constructors
    */
    public NgClass(IterableDiffers _iterableDiffers, KeyValueDiffers _keyValueDiffers, ElementRef _ngEl, Renderer _renderer){
    }

    /*
        Properties
    */

    public Object _initialClasses;

    @JsProperty( name = "_initialClasses")
    public native Object get_initialClasses();

    @JsProperty( name = "_initialClasses")
    public native void set_initialClasses( Object value );

    public Object _iterableDiffer;

    @JsProperty( name = "_iterableDiffer")
    public native Object get_iterableDiffer();

    @JsProperty( name = "_iterableDiffer")
    public native void set_iterableDiffer( Object value );

    public Object _iterableDiffers;

    @JsProperty( name = "_iterableDiffers")
    public native Object get_iterableDiffers();

    @JsProperty( name = "_iterableDiffers")
    public native void set_iterableDiffers( Object value );

    public Object _keyValueDiffer;

    @JsProperty( name = "_keyValueDiffer")
    public native Object get_keyValueDiffer();

    @JsProperty( name = "_keyValueDiffer")
    public native void set_keyValueDiffer( Object value );

    public Object _keyValueDiffers;

    @JsProperty( name = "_keyValueDiffers")
    public native Object get_keyValueDiffers();

    @JsProperty( name = "_keyValueDiffers")
    public native void set_keyValueDiffers( Object value );

    public Object _ngEl;

    @JsProperty( name = "_ngEl")
    public native Object get_ngEl();

    @JsProperty( name = "_ngEl")
    public native void set_ngEl( Object value );

    public Object _rawClass;

    @JsProperty( name = "_rawClass")
    public native Object get_rawClass();

    @JsProperty( name = "_rawClass")
    public native void set_rawClass( Object value );

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );

    public String klass;

    @JsProperty( name = "klass")
    public native String getKlass();

    @JsProperty( name = "klass")
    public native void setKlass( String value );

    public UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString ngClass;

    @JsProperty( name = "ngClass")
    public native UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString getNgClass();

    @JsProperty( name = "ngClass")
    public native void setNgClass( UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString value );

    @JsOverlay
    public final void setNgClass( AnonymousType717 value ) { setNgClass(UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString.ofAnonymousType717( value )); }

    @JsOverlay
    public final void setNgClass( Array<String> value ) { setNgClass(UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setNgClass( Set<String> value ) { setNgClass(UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString.ofSetOfString( value )); }

    @JsOverlay
    public final void setNgClass( String value ) { setNgClass(UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString.ofString( value )); }

    /*
        Methods
    */
    /** 
      * Std Signature : S(_applyClasses,3,,P(d3),P(d3))
      * TE Signature : S(_applyClasses,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class.d.ts@1986
     */
    public native Object _applyClasses(Object rawClassVal, Object isCleanup);
    /** 
      * Std Signature : S(_applyInitialClasses,3,,P(d3))
      * TE Signature : S(_applyInitialClasses,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class.d.ts@1941
     */
    public native Object _applyInitialClasses(Object isCleanup);
    /** 
      * Std Signature : S(_applyIterableChanges,3,,P(d3))
      * TE Signature : S(_applyIterableChanges,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class.d.ts@1897
     */
    public native Object _applyIterableChanges(Object changes);
    /** 
      * Std Signature : S(_applyKeyValueChanges,3,,P(d3))
      * TE Signature : S(_applyKeyValueChanges,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class.d.ts@1853
     */
    public native Object _applyKeyValueChanges(Object changes);
    /** 
      * Std Signature : S(_cleanupClasses,3,,P(d3))
      * TE Signature : S(_cleanupClasses,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class.d.ts@1811
     */
    public native Object _cleanupClasses(Object rawClassVal);
    /** 
      * Std Signature : S(_toggleClass,3,,P(d3),P(d3))
      * TE Signature : S(_toggleClass,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_class.d.ts@2037
     */
    public native Object _toggleClass(Object klass, Object enabled);
}
