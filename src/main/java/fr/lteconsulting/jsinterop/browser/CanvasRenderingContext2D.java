package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CanvasRenderingContext2D
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:311567
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:314274
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CanvasRenderingContext2D")
public class CanvasRenderingContext2D extends CanvasPathMethods
{

    /*
        Constructors
    */
    public CanvasRenderingContext2D(){
    }

    /*
        Properties
    */

    public HTMLCanvasElement canvas;

    @JsProperty( name = "canvas")
    public native HTMLCanvasElement getCanvas();

    @JsProperty( name = "canvas")
    public native void setCanvas( HTMLCanvasElement value );

    public UnionOfCanvasGradientAndCanvasPatternAndString fillStyle;

    @JsProperty( name = "fillStyle")
    public native UnionOfCanvasGradientAndCanvasPatternAndString getFillStyle();

    @JsProperty( name = "fillStyle")
    public native void setFillStyle( UnionOfCanvasGradientAndCanvasPatternAndString value );

    @JsOverlay
    public final void setFillStyle( CanvasGradient value ) { setFillStyle(UnionOfCanvasGradientAndCanvasPatternAndString.ofCanvasGradient( value )); }

    @JsOverlay
    public final void setFillStyle( CanvasPattern value ) { setFillStyle(UnionOfCanvasGradientAndCanvasPatternAndString.ofCanvasPattern( value )); }

    @JsOverlay
    public final void setFillStyle( String value ) { setFillStyle(UnionOfCanvasGradientAndCanvasPatternAndString.ofString( value )); }

    public String font;

    @JsProperty( name = "font")
    public native String getFont();

    @JsProperty( name = "font")
    public native void setFont( String value );

    public Number globalAlpha;

    @JsProperty( name = "globalAlpha")
    public native Number getGlobalAlpha();

    @JsProperty( name = "globalAlpha")
    public native void setGlobalAlpha( Number value );

    public String globalCompositeOperation;

    @JsProperty( name = "globalCompositeOperation")
    public native String getGlobalCompositeOperation();

    @JsProperty( name = "globalCompositeOperation")
    public native void setGlobalCompositeOperation( String value );

    public Boolean imageSmoothingEnabled;

    @JsProperty( name = "imageSmoothingEnabled")
    public native Boolean getImageSmoothingEnabled();

    @JsProperty( name = "imageSmoothingEnabled")
    public native void setImageSmoothingEnabled( Boolean value );

    public String lineCap;

    @JsProperty( name = "lineCap")
    public native String getLineCap();

    @JsProperty( name = "lineCap")
    public native void setLineCap( String value );

    public Number lineDashOffset;

    @JsProperty( name = "lineDashOffset")
    public native Number getLineDashOffset();

    @JsProperty( name = "lineDashOffset")
    public native void setLineDashOffset( Number value );

    public String lineJoin;

    @JsProperty( name = "lineJoin")
    public native String getLineJoin();

    @JsProperty( name = "lineJoin")
    public native void setLineJoin( String value );

    public Number lineWidth;

    @JsProperty( name = "lineWidth")
    public native Number getLineWidth();

    @JsProperty( name = "lineWidth")
    public native void setLineWidth( Number value );

    public Number miterLimit;

    @JsProperty( name = "miterLimit")
    public native Number getMiterLimit();

    @JsProperty( name = "miterLimit")
    public native void setMiterLimit( Number value );

    public Boolean mozImageSmoothingEnabled;

    @JsProperty( name = "mozImageSmoothingEnabled")
    public native Boolean getMozImageSmoothingEnabled();

    @JsProperty( name = "mozImageSmoothingEnabled")
    public native void setMozImageSmoothingEnabled( Boolean value );

    public String msFillRule;

    @JsProperty( name = "msFillRule")
    public native String getMsFillRule();

    @JsProperty( name = "msFillRule")
    public native void setMsFillRule( String value );

    public Boolean oImageSmoothingEnabled;

    @JsProperty( name = "oImageSmoothingEnabled")
    public native Boolean getOImageSmoothingEnabled();

    @JsProperty( name = "oImageSmoothingEnabled")
    public native void setOImageSmoothingEnabled( Boolean value );

    public Number shadowBlur;

    @JsProperty( name = "shadowBlur")
    public native Number getShadowBlur();

    @JsProperty( name = "shadowBlur")
    public native void setShadowBlur( Number value );

    public String shadowColor;

    @JsProperty( name = "shadowColor")
    public native String getShadowColor();

    @JsProperty( name = "shadowColor")
    public native void setShadowColor( String value );

    public Number shadowOffsetX;

    @JsProperty( name = "shadowOffsetX")
    public native Number getShadowOffsetX();

    @JsProperty( name = "shadowOffsetX")
    public native void setShadowOffsetX( Number value );

    public Number shadowOffsetY;

    @JsProperty( name = "shadowOffsetY")
    public native Number getShadowOffsetY();

    @JsProperty( name = "shadowOffsetY")
    public native void setShadowOffsetY( Number value );

    public UnionOfCanvasGradientAndCanvasPatternAndString strokeStyle;

    @JsProperty( name = "strokeStyle")
    public native UnionOfCanvasGradientAndCanvasPatternAndString getStrokeStyle();

    @JsProperty( name = "strokeStyle")
    public native void setStrokeStyle( UnionOfCanvasGradientAndCanvasPatternAndString value );

    @JsOverlay
    public final void setStrokeStyle( CanvasGradient value ) { setStrokeStyle(UnionOfCanvasGradientAndCanvasPatternAndString.ofCanvasGradient( value )); }

    @JsOverlay
    public final void setStrokeStyle( CanvasPattern value ) { setStrokeStyle(UnionOfCanvasGradientAndCanvasPatternAndString.ofCanvasPattern( value )); }

    @JsOverlay
    public final void setStrokeStyle( String value ) { setStrokeStyle(UnionOfCanvasGradientAndCanvasPatternAndString.ofString( value )); }

    public String textAlign;

    @JsProperty( name = "textAlign")
    public native String getTextAlign();

    @JsProperty( name = "textAlign")
    public native void setTextAlign( String value );

    public String textBaseline;

    @JsProperty( name = "textBaseline")
    public native String getTextBaseline();

    @JsProperty( name = "textBaseline")
    public native void setTextBaseline( String value );

    public Boolean webkitImageSmoothingEnabled;

    @JsProperty( name = "webkitImageSmoothingEnabled")
    public native Boolean getWebkitImageSmoothingEnabled();

    @JsProperty( name = "webkitImageSmoothingEnabled")
    public native void setWebkitImageSmoothingEnabled( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(beginPath,289,,)
      * TE Signature : S(beginPath,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312327
     */
    public native void beginPath();
    /** 
      * Std Signature : S(clearRect,289,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(clearRect,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312350
     */
    public native void clearRect(Number x, Number y, Number w, Number h);
    /** 
      * Std Signature : S(clip,289,,)
      * TE Signature : S(clip,)
      * 
     */
    public native void clip();
    /** 
      * Std Signature : S(clip,289,,P(d1))
      * TE Signature : S(clip,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312415
     */
    public native void clip(String fillRule /* optional */);
    /** 
      * Std Signature : S(createImageData,233,,P(d2))
      * TE Signature : S(createImageData,P(d2))
      * 
     */
    public native ImageData createImageData(Number imageDataOrSw);
    /** 
      * Std Signature : S(createImageData,233,,P(d2),P(d2))
      * TE Signature : S(createImageData,P(d2),P(d2))
      * 
     */
    public native ImageData createImageData(Number imageDataOrSw, Number sh /* optional */);
    /** 
      * Std Signature : S(createImageData,233,,P(d233))
      * TE Signature : S(createImageData,P(d233))
      * 
     */
    public native ImageData createImageData(ImageData imageDataOrSw);
    /** 
      * Std Signature : S(createImageData,233,,P(d233),P(d2))
      * TE Signature : S(createImageData,P(d233),P(d2))
      * 
     */
    public native ImageData createImageData(ImageData imageDataOrSw, Number sh /* optional */);
    /** 
      * Std Signature : S(createImageData,233,,P(dU(-233,2)))
      * TE Signature : S(createImageData,P(dU(-233,2)))
      * 
     */
    public native ImageData createImageData(UnionOfImageDataAndNumber imageDataOrSw);
    /** 
      * Std Signature : S(createImageData,233,,P(dU(-233,2)),P(d2))
      * TE Signature : S(createImageData,P(dU(-233,2)),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312450
     */
    public native ImageData createImageData(UnionOfImageDataAndNumber imageDataOrSw, Number sh /* optional */);
    /** 
      * Std Signature : S(createLinearGradient,359,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(createLinearGradient,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312530
     */
    public native CanvasGradient createLinearGradient(Number x0, Number y0, Number x1, Number y1);
    /** 
      * Std Signature : S(createPattern,360,,P(d230),P(d1))
      * TE Signature : S(createPattern,P(d230),P(d1))
      * 
     */
    public native CanvasPattern createPattern(HTMLCanvasElement image, String repetition);
    /** 
      * Std Signature : S(createPattern,360,,P(d231),P(d1))
      * TE Signature : S(createPattern,P(d231),P(d1))
      * 
     */
    public native CanvasPattern createPattern(HTMLImageElement image, String repetition);
    /** 
      * Std Signature : S(createPattern,360,,P(d232),P(d1))
      * TE Signature : S(createPattern,P(d232),P(d1))
      * 
     */
    public native CanvasPattern createPattern(HTMLVideoElement image, String repetition);
    /** 
      * Std Signature : S(createPattern,360,,P(dU(-230,231,232)),P(d1))
      * TE Signature : S(createPattern,P(dU(-230,231,232)),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312620
     */
    public native CanvasPattern createPattern(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, String repetition);
    /** 
      * Std Signature : S(createRadialGradient,359,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(createRadialGradient,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312738
     */
    public native CanvasGradient createRadialGradient(Number x0, Number y0, Number r0, Number x1, Number y1, Number r1);
    /** 
      * Std Signature : S(drawFocusIfNeeded,289,,P(d49))
      * TE Signature : S(drawFocusIfNeeded,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312852
     */
    public native void drawFocusIfNeeded(Element element);
    /** 
      * Std Signature : S(drawImage,289,,P(d230),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d230),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLCanvasElement image, Number offsetX, Number offsetY);
    /** 
      * Std Signature : S(drawImage,289,,P(d230),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d230),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLCanvasElement image, Number offsetX, Number offsetY, Number width /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d230),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d230),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLCanvasElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLCanvasElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLCanvasElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLCanvasElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d230),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLCanvasElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */, Number canvasImageHeight /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d231),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d231),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLImageElement image, Number offsetX, Number offsetY);
    /** 
      * Std Signature : S(drawImage,289,,P(d231),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d231),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLImageElement image, Number offsetX, Number offsetY, Number width /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d231),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d231),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLImageElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLImageElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLImageElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLImageElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d231),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLImageElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */, Number canvasImageHeight /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d232),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d232),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLVideoElement image, Number offsetX, Number offsetY);
    /** 
      * Std Signature : S(drawImage,289,,P(d232),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d232),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d232),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d232),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(d232),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(HTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */, Number canvasImageHeight /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(dU(-230,231,232)),P(d2),P(d2))
      * TE Signature : S(drawImage,P(dU(-230,231,232)),P(d2),P(d2))
      * 
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, Number offsetX, Number offsetY);
    /** 
      * Std Signature : S(drawImage,289,,P(dU(-230,231,232)),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(dU(-230,231,232)),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */);
    /** 
      * Std Signature : S(drawImage,289,,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawImage,P(dU(-230,231,232)),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@312899
     */
    public native void drawImage(UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement image, Number offsetX, Number offsetY, Number width /* optional */, Number height /* optional */, Number canvasOffsetX /* optional */, Number canvasOffsetY /* optional */, Number canvasImageWidth /* optional */, Number canvasImageHeight /* optional */);
    /** 
      * Std Signature : S(fill,289,,)
      * TE Signature : S(fill,)
      * 
     */
    public native void fill();
    /** 
      * Std Signature : S(fill,289,,P(d1))
      * TE Signature : S(fill,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313154
     */
    public native void fill(String fillRule /* optional */);
    /** 
      * Std Signature : S(fillRect,289,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(fillRect,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313189
     */
    public native void fillRect(Number x, Number y, Number w, Number h);
    /** 
      * Std Signature : S(fillText,289,,P(d1),P(d2),P(d2))
      * TE Signature : S(fillText,P(d1),P(d2),P(d2))
      * 
     */
    public native void fillText(String text, Number x, Number y);
    /** 
      * Std Signature : S(fillText,289,,P(d1),P(d2),P(d2),P(d2))
      * TE Signature : S(fillText,P(d1),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313253
     */
    public native void fillText(String text, Number x, Number y, Number maxWidth /* optional */);
    /** 
      * Std Signature : S(getImageData,233,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(getImageData,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313328
     */
    public native ImageData getImageData(Number sx, Number sy, Number sw, Number sh);
    /** 
      * Std Signature : S(getLineDash,7<2>,,)
      * TE Signature : S(getLineDash,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313405
     */
    public native Array<Number> getLineDash();
    /** 
      * Std Signature : S(isPointInPath,27,,P(d2),P(d2))
      * TE Signature : S(isPointInPath,P(d2),P(d2))
      * 
     */
    public native Boolean isPointInPath(Number x, Number y);
    /** 
      * Std Signature : S(isPointInPath,27,,P(d2),P(d2),P(d1))
      * TE Signature : S(isPointInPath,P(d2),P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313434
     */
    public native Boolean isPointInPath(Number x, Number y, String fillRule /* optional */);
    /** 
      * Std Signature : S(measureText,546,,P(d1))
      * TE Signature : S(measureText,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313503
     */
    public native TextMetrics measureText(String text);
    /** 
      * Std Signature : S(putImageData,289,,P(d233),P(d2),P(d2))
      * TE Signature : S(putImageData,P(d233),P(d2),P(d2))
      * 
     */
    public native void putImageData(ImageData imagedata, Number dx, Number dy);
    /** 
      * Std Signature : S(putImageData,289,,P(d233),P(d2),P(d2),P(d2))
      * TE Signature : S(putImageData,P(d233),P(d2),P(d2),P(d2))
      * 
     */
    public native void putImageData(ImageData imagedata, Number dx, Number dy, Number dirtyX /* optional */);
    /** 
      * Std Signature : S(putImageData,289,,P(d233),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(putImageData,P(d233),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void putImageData(ImageData imagedata, Number dx, Number dy, Number dirtyX /* optional */, Number dirtyY /* optional */);
    /** 
      * Std Signature : S(putImageData,289,,P(d233),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(putImageData,P(d233),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void putImageData(ImageData imagedata, Number dx, Number dy, Number dirtyX /* optional */, Number dirtyY /* optional */, Number dirtyWidth /* optional */);
    /** 
      * Std Signature : S(putImageData,289,,P(d233),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(putImageData,P(d233),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313547
     */
    public native void putImageData(ImageData imagedata, Number dx, Number dy, Number dirtyX /* optional */, Number dirtyY /* optional */, Number dirtyWidth /* optional */, Number dirtyHeight /* optional */);
    /** 
      * Std Signature : S(restore,289,,)
      * TE Signature : S(restore,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313694
     */
    public native void restore();
    /** 
      * Std Signature : S(rotate,289,,P(d2))
      * TE Signature : S(rotate,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313715
     */
    public native void rotate(Number angle);
    /** 
      * Std Signature : S(save,289,,)
      * TE Signature : S(save,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313748
     */
    public native void save();
    /** 
      * Std Signature : S(scale,289,,P(d2),P(d2))
      * TE Signature : S(scale,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313766
     */
    public native void scale(Number x, Number y);
    /** 
      * Std Signature : S(setLineDash,289,,P(d7<2>))
      * TE Signature : S(setLineDash,P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313805
     */
    public native void setLineDash(Array<Number> segments);
    /** 
      * Std Signature : S(setTransform,289,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(setTransform,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313848
     */
    public native void setTransform(Number m11, Number m12, Number m21, Number m22, Number dx, Number dy);
    /** 
      * Std Signature : S(stroke,289,,)
      * TE Signature : S(stroke,)
      * 
     */
    public native void stroke();
    /** 
      * Std Signature : S(stroke,289,,P(d236))
      * TE Signature : S(stroke,P(d236))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313948
     */
    public native void stroke(Path2D path /* optional */);
    /** 
      * Std Signature : S(strokeRect,289,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(strokeRect,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@313981
     */
    public native void strokeRect(Number x, Number y, Number w, Number h);
    /** 
      * Std Signature : S(strokeText,289,,P(d1),P(d2),P(d2))
      * TE Signature : S(strokeText,P(d1),P(d2),P(d2))
      * 
     */
    public native void strokeText(String text, Number x, Number y);
    /** 
      * Std Signature : S(strokeText,289,,P(d1),P(d2),P(d2),P(d2))
      * TE Signature : S(strokeText,P(d1),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@314047
     */
    public native void strokeText(String text, Number x, Number y, Number maxWidth /* optional */);
    /** 
      * Std Signature : S(transform,289,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(transform,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@314124
     */
    public native void transform(Number m11, Number m12, Number m21, Number m22, Number dx, Number dy);
    /** 
      * Std Signature : S(translate,289,,P(d2),P(d2))
      * TE Signature : S(translate,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@314221
     */
    public native void translate(Number x, Number y);
}
