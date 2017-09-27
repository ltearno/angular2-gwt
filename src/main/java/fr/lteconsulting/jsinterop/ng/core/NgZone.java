package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone".NgZone
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone.d.ts:48
  * 1 constructors
  * An injectable service for executing work inside or outside of the Angular zone.
  * 
  * The most common use of this service is to optimize performance when starting a work consisting of
  * one or more asynchronous tasks that don't require UI updates or error handling to be handled by
  * Angular. Such tasks can be kicked off via {@link #runOutsideAngular} and if needed, these tasks
  * can reenter the Angular zone via {@link #run}.
  * 
  * <!-- TODO: add/fix links to:
  *    - docs explaining zones and the use of zones in Angular and change-detection
  *    - link to runOutsideAngular/run (throughout this file!)
  *    -->
  * 
  * ### Example
  * 
  * ```
  * import {Component, NgZone} from '@angular/core';
  * import {NgIf} from '@angular/common';
 */
@JsType(isNative=true, namespace="ng.core", name="NgZone")
public class NgZone
{

    /*
        Constructors
    */
    public NgZone(Object __0){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone.d.ts:3507
     */
    @JsMethod(namespace="ng.core.NgZone", name = "isInAngularZone")
    public static native Boolean isInAngularZone();
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone.d.ts:3546
     */
    @JsMethod(namespace="ng.core.NgZone", name = "assertInAngularZone")
    public static native void assertInAngularZone();
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone.d.ts:3586
     */
    @JsMethod(namespace="ng.core.NgZone", name = "assertNotInAngularZone")
    public static native void assertNotInAngularZone();

    /*
        Properties
    */

    public Boolean hasPendingMacrotasks;

    @JsProperty( name = "hasPendingMacrotasks")
    public native Boolean getHasPendingMacrotasks();

    @JsProperty( name = "hasPendingMacrotasks")
    public native void setHasPendingMacrotasks( Boolean value );

    public Boolean hasPendingMicrotasks;

    @JsProperty( name = "hasPendingMicrotasks")
    public native Boolean getHasPendingMicrotasks();

    @JsProperty( name = "hasPendingMicrotasks")
    public native void setHasPendingMicrotasks( Boolean value );

    /** 
      * Whether there are no outstanding microtasks or macrotasks.
     */
    public Boolean isStable;

    @JsProperty( name = "isStable")
    public native Boolean getIsStable();

    @JsProperty( name = "isStable")
    public native void setIsStable( Boolean value );

    /** 
      * Notifies that an error has been delivered.
     */
    public EventEmitter<Object> onError;

    @JsProperty( name = "onError")
    public native EventEmitter<Object> getOnError();

    @JsProperty( name = "onError")
    public native void setOnError( EventEmitter<Object> value );

    /** 
      * Notifies when there is no more microtasks enqueue in the current VM Turn.
      * This is a hint for Angular to do change detection, which may enqueue more microtasks.
      * For this reason this event can fire multiple times per VM Turn.
     */
    public EventEmitter<Object> onMicrotaskEmpty;

    @JsProperty( name = "onMicrotaskEmpty")
    public native EventEmitter<Object> getOnMicrotaskEmpty();

    @JsProperty( name = "onMicrotaskEmpty")
    public native void setOnMicrotaskEmpty( EventEmitter<Object> value );

    /** 
      * Notifies when the last `onMicrotaskEmpty` has run and there are no more microtasks, which
      * implies we are about to relinquish VM turn.
      * This event gets called just once.
     */
    public EventEmitter<Object> onStable;

    @JsProperty( name = "onStable")
    public native EventEmitter<Object> getOnStable();

    @JsProperty( name = "onStable")
    public native void setOnStable( EventEmitter<Object> value );

    /** 
      * Notifies when code enters Angular Zone. This gets fired first on VM Turn.
     */
    public EventEmitter<Object> onUnstable;

    @JsProperty( name = "onUnstable")
    public native EventEmitter<Object> getOnUnstable();

    @JsProperty( name = "onUnstable")
    public native void setOnUnstable( EventEmitter<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(run,3,,P(dFR--S(?,3,,)------)<3>))
      * TE Signature : S(run,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone.d.ts@4201
      * Executes the `fn` function synchronously within the Angular zone and returns value returned by
      * the function.
      * 
      * Running functions via `run` allows you to reenter Angular zone from a task that was executed
      * outside of the Angular zone (typically started via {@link #runOutsideAngular}).
      * 
      * Any future tasks or microtasks scheduled from within this function will continue executing from
      * within the Angular zone.
      * 
      * If a synchronous error happens it will be rethrown and not reported via `onError`.
     */
    public native Object run(Function<Object> fn);
    /** 
      * Std Signature : S(runGuarded,3,,P(dFR--S(?,3,,)------)<3>))
      * TE Signature : S(runGuarded,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone.d.ts@4363
      * Same as `run`, except that synchronous errors are caught and forwarded via `onError` and not
      * rethrown.
     */
    public native Object runGuarded(Function<Object> fn);
    /** 
      * Std Signature : S(runOutsideAngular,3,,P(dFR--S(?,3,,)------)<3>))
      * TE Signature : S(runOutsideAngular,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/zone/ng_zone.d.ts@5006
      * Executes the `fn` function synchronously in Angular's parent zone and returns value returned by
      * the function.
      * 
      * Running functions via {@link #runOutsideAngular} allows you to escape Angular's zone and do
      * work that
      * doesn't trigger Angular change-detection or is subject to Angular's error handling.
      * 
      * Any future tasks or microtasks scheduled from within this function will continue executing from
      * outside of the Angular zone.
      * 
      * Use {@link #run} to reenter the Angular zone and do work that updates the application model.
     */
    public native Object runOutsideAngular(Function<Object> fn);
}
