package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentAddress
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:540947
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:541368
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentAddress")
public class PaymentAddress
{

    /*
        Constructors
    */
    public PaymentAddress(){
    }

    /*
        Properties
    */

    public Array<String> addressLine;

    @JsProperty( name = "addressLine")
    public native Array<String> getAddressLine();

    @JsProperty( name = "addressLine")
    public native void setAddressLine( Array<String> value );

    public String city;

    @JsProperty( name = "city")
    public native String getCity();

    @JsProperty( name = "city")
    public native void setCity( String value );

    public String country;

    @JsProperty( name = "country")
    public native String getCountry();

    @JsProperty( name = "country")
    public native void setCountry( String value );

    public String dependentLocality;

    @JsProperty( name = "dependentLocality")
    public native String getDependentLocality();

    @JsProperty( name = "dependentLocality")
    public native void setDependentLocality( String value );

    public String languageCode;

    @JsProperty( name = "languageCode")
    public native String getLanguageCode();

    @JsProperty( name = "languageCode")
    public native void setLanguageCode( String value );

    public String organization;

    @JsProperty( name = "organization")
    public native String getOrganization();

    @JsProperty( name = "organization")
    public native void setOrganization( String value );

    public String phone;

    @JsProperty( name = "phone")
    public native String getPhone();

    @JsProperty( name = "phone")
    public native void setPhone( String value );

    public String postalCode;

    @JsProperty( name = "postalCode")
    public native String getPostalCode();

    @JsProperty( name = "postalCode")
    public native void setPostalCode( String value );

    public String recipient;

    @JsProperty( name = "recipient")
    public native String getRecipient();

    @JsProperty( name = "recipient")
    public native void setRecipient( String value );

    public String region;

    @JsProperty( name = "region")
    public native String getRegion();

    @JsProperty( name = "region")
    public native void setRegion( String value );

    public String sortingCode;

    @JsProperty( name = "sortingCode")
    public native String getSortingCode();

    @JsProperty( name = "sortingCode")
    public native void setSortingCode( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toJSON,3,,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@541339
     */
    public native Object toJSON();
}
