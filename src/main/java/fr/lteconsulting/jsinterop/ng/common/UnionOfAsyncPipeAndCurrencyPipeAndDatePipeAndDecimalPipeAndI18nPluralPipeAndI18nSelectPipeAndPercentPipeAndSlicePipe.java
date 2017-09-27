package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.PipeTransform;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe extends PipeTransform  {
    @JsOverlay
    public final AsyncPipe asAsyncPipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofAsyncPipe(AsyncPipe value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final CurrencyPipe asCurrencyPipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofCurrencyPipe(CurrencyPipe value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final DatePipe asDatePipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofDatePipe(DatePipe value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final DecimalPipe asDecimalPipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofDecimalPipe(DecimalPipe value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final I18nPluralPipe asI18nPluralPipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofI18nPluralPipe(I18nPluralPipe value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final I18nSelectPipe asI18nSelectPipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofI18nSelectPipe(I18nSelectPipe value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final PercentPipe asPercentPipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofPercentPipe(PercentPipe value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final SlicePipe asSlicePipe() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe ofSlicePipe(SlicePipe value) {
        return Js.uncheckedCast( value );
    }
    
}
