package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: MSNavigatorDoNotTrack
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:732752
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSNavigatorDoNotTrack")
public class MSNavigatorDoNotTrackImpl implements MSNavigatorDoNotTrack
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(confirmSiteSpecificTrackingException,27,,P(d152))
      * TE Signature : S(confirmSiteSpecificTrackingException,P(d152))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@732792
     */
    public native Boolean confirmSiteSpecificTrackingException(ConfirmSiteSpecificExceptionsInformation args);
    /** 
      * Std Signature : S(confirmWebWideTrackingException,27,,P(d153))
      * TE Signature : S(confirmWebWideTrackingException,P(d153))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@732891
     */
    public native Boolean confirmWebWideTrackingException(ExceptionInformation args);
    /** 
      * Std Signature : S(removeSiteSpecificTrackingException,289,,P(d153))
      * TE Signature : S(removeSiteSpecificTrackingException,P(d153))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@732965
     */
    public native void removeSiteSpecificTrackingException(ExceptionInformation args);
    /** 
      * Std Signature : S(removeWebWideTrackingException,289,,P(d153))
      * TE Signature : S(removeWebWideTrackingException,P(d153))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@733040
     */
    public native void removeWebWideTrackingException(ExceptionInformation args);
    /** 
      * Std Signature : S(storeSiteSpecificTrackingException,289,,P(d154))
      * TE Signature : S(storeSiteSpecificTrackingException,P(d154))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@733110
     */
    public native void storeSiteSpecificTrackingException(StoreSiteSpecificExceptionsInformation args);
    /** 
      * Std Signature : S(storeWebWideTrackingException,289,,P(d155))
      * TE Signature : S(storeWebWideTrackingException,P(d155))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@733202
     */
    public native void storeWebWideTrackingException(StoreExceptionsInformation args);
}
