package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs".IterableDifferFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:4214

  * Provides a factory for {@link IterableDiffer}.
 */
@JsType(isNative=true, namespace="ng.core", name="IterableDifferFactory")
public class IterableDifferFactory
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(create,1198<V->,V-,)
      * TE Signature : S(create,)
      * 
     */
    public native <V> IterableDiffer<V> create();
    /** 
      * Std Signature : S(create,1198<V->,V-,P(d366))
      * TE Signature : S(create,P(d366))
      * 
     */
    public native <V> IterableDiffer<V> create(ChangeDetectorRef _cdr /* optional */);
    /** 
      * Std Signature : S(create,1198<V->,V-,P(d366),P(dFT--S(?,3,,P(d2),P(dT-))------)<V->))
      * TE Signature : S(create,P(d366),P(dF--S(?,P(d2),P(d3))------)))
      * 
     */
    public native <V> IterableDiffer<V> create(ChangeDetectorRef _cdr /* optional */, TrackByFunction<V> trackByFn /* optional */);
    /** 
      * Std Signature : S(create,1198<V->,V-,P(dFT--S(?,3,,P(d2),P(dT-))------)<V->))
      * TE Signature : S(create,P(dF--S(?,P(d2),P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@4369
     */
    public native <V> IterableDiffer<V> create(TrackByFunction<V> trackByFn /* optional */);
    /** 
      * Std Signature : S(create,1198<V->,V-,P(dFT--S(?,3,,P(d2),P(dT-))------)<V->),P(dFT--S(?,3,,P(d2),P(dT-))------)<V->))
      * TE Signature : S(create,P(dF--S(?,P(d2),P(d3))------)),P(dF--S(?,P(d2),P(d3))------)))
      * 
     */
    public native <V> IterableDiffer<V> create(TrackByFunction<V> _cdr /* optional */, TrackByFunction<V> trackByFn /* optional */);
    /** 
      * Std Signature : S(create,1198<V->,V-,P(dU(V-366,FT--S(?,3,,P(d2),P(dT-))------)<V->)))
      * TE Signature : S(create,P(dU(-366,F--S(?,P(d2),P(d3))------))))
      * 
     */
    public native <V> IterableDiffer<V> create(UnionOfChangeDetectorRefAndTrackByFunctionOfV<V> _cdr /* optional */);
    /** 
      * Std Signature : S(create,1198<V->,V-,P(dU(V-366,FT--S(?,3,,P(d2),P(dT-))------)<V->)),P(dFT--S(?,3,,P(d2),P(dT-))------)<V->))
      * TE Signature : S(create,P(dU(-366,F--S(?,P(d2),P(d3))------))),P(dF--S(?,P(d2),P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@4538
      * VERSION 1
     */
    public native <V> IterableDiffer<V> create(UnionOfChangeDetectorRefAndTrackByFunctionOfV<V> _cdr /* optional */, TrackByFunction<V> trackByFn /* optional */);
    /** 
      * Std Signature : S(supports,27,,P(d3))
      * TE Signature : S(supports,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@4332
     */
    public native Boolean supports(Object objects);
}
