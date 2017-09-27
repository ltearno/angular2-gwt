package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Iterable;
import fr.lteconsulting.jsinterop.browser.NgIterable_UnionOfArrayOfTAndIterableOfT;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_for_of".NgForOfContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_for_of.d.ts:346
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="NgForOfContext")
public class NgForOfContext<T>
{

    /*
        Constructors
    */
    public NgForOfContext(T $implicit, NgIterable_UnionOfArrayOfTAndIterableOfT<T> ngForOf, Number index, Number count){
    }

    /*
        Properties
    */

    public T $implicit;

    @JsProperty( name = "$implicit")
    public native T get$implicit();

    @JsProperty( name = "$implicit")
    public native void set$implicit( T value );

    public Number count;

    @JsProperty( name = "count")
    public native Number getCount();

    @JsProperty( name = "count")
    public native void setCount( Number value );

    public Boolean even;

    @JsProperty( name = "even")
    public native Boolean getEven();

    @JsProperty( name = "even")
    public native void setEven( Boolean value );

    public Boolean first;

    @JsProperty( name = "first")
    public native Boolean getFirst();

    @JsProperty( name = "first")
    public native void setFirst( Boolean value );

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    public Boolean last;

    @JsProperty( name = "last")
    public native Boolean getLast();

    @JsProperty( name = "last")
    public native void setLast( Boolean value );

    public NgIterable_UnionOfArrayOfTAndIterableOfT<T> ngForOf;

    @JsProperty( name = "ngForOf")
    public native NgIterable_UnionOfArrayOfTAndIterableOfT<T> getNgForOf();

    @JsProperty( name = "ngForOf")
    public native void setNgForOf( NgIterable_UnionOfArrayOfTAndIterableOfT<T> value );

    @JsOverlay
    public final void setNgForOf( Array<T> value ) { setNgForOf(NgIterable_UnionOfArrayOfTAndIterableOfT.ofArrayOfT( value )); }

    @JsOverlay
    public final void setNgForOf( Iterable<T> value ) { setNgForOf(NgIterable_UnionOfArrayOfTAndIterableOfT.ofIterableOfT( value )); }

    public Boolean odd;

    @JsProperty( name = "odd")
    public native Boolean getOdd();

    @JsProperty( name = "odd")
    public native void setOdd( Boolean value );
}
