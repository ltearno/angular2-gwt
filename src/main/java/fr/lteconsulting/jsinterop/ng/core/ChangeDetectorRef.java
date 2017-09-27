package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detector_ref".ChangeDetectorRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detector_ref.d.ts:0
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ChangeDetectorRef
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(checkNoChanges,429,,)
      * TE Signature : S(checkNoChanges,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detector_ref.d.ts@4209
      * Checks the change detector and its children, and throws if any changes are detected.
      * 
      * This is used in development mode to verify that running change detection doesn't introduce
      * other changes.
     */
    void checkNoChanges();
    /** 
      * Std Signature : S(detach,429,,)
      * TE Signature : S(detach,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detector_ref.d.ts@3029
      * Detaches the change detector from the change detector tree.
      * 
      * The detached change detector will not be checked until it is reattached.
      * 
      * This can also be used in combination with {@link ChangeDetectorRef#detectChanges} to implement
      * local change
      * detection checks.
      * 
      * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
      * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
      * 
      * ### Example
      * 
      * The following example defines a component with a large list of readonly data.
      * Imagine the data changes constantly, many times per second. For performance reasons,
      * we want to check and update the list every five seconds. We can do that by detaching
      * the component's change detector and doing a local check every five seconds.
      * 
      * ```typescript
      * class DataProvider {
      *    // in a real application the returned data will be different every time
      *    get data() {
      *      return [1,2,3,4,5];
      *    }
      * }
     */
    void detach();
    /** 
      * Std Signature : S(detectChanges,429,,)
      * TE Signature : S(detectChanges,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detector_ref.d.ts@3938
      * Checks the change detector and its children.
      * 
      * This can also be used in combination with {@link ChangeDetectorRef#detach} to implement local
      * change detection
      * checks.
      * 
      * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
      * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
      * 
      * ### Example
      * 
      * The following example defines a component with a large list of readonly data.
      * Imagine, the data changes constantly, many times per second. For performance reasons,
      * we want to check and update the list every five seconds.
      * 
      * We can do that by detaching the component's change detector and doing a local change detection
      * check
      * every five seconds.
      * 
      * See {@link ChangeDetectorRef#detach} for more information.
     */
    void detectChanges();
    /** 
      * Std Signature : S(markForCheck,429,,)
      * TE Signature : S(markForCheck,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detector_ref.d.ts@1278
      * Marks all {@link ChangeDetectionStrategy#OnPush} ancestors as to be checked.
      * 
      * <!-- TODO: Add a link to a chapter on OnPush components -->
      * 
      * ### Example ([live demo](http://plnkr.co/edit/GC512b?p=preview))
      * 
      * ```typescript
     */
    void markForCheck();
    /** 
      * Std Signature : S(reattach,429,,)
      * TE Signature : S(reattach,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detector_ref.d.ts@5840
      * Reattach the change detector to the change detector tree.
      * 
      * This also marks OnPush ancestors as to be checked. This reattached change detector will be
      * checked during the next change detection run.
      * 
      * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
      * 
      * ### Example ([live demo](http://plnkr.co/edit/aUhZha?p=preview))
      * 
      * The following example creates a component displaying `live` data. The component will detach
      * its change detector from the main change detector tree when the component's live property
      * is set to false.
      * 
      * ```typescript
      * class DataProvider {
      *    data = 1;
      * 
      *    constructor() {
      *      setInterval(() => {
      *        this.data = this.data * 2;
      *      }, 500);
      *    }
      * }
     */
    void reattach();
}
