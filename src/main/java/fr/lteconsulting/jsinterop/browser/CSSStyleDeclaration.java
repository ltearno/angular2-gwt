package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: CSSStyleDeclaration
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:296808
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:308970
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSStyleDeclaration")
public class CSSStyleDeclaration
{

    /*
        Constructors
    */
    public CSSStyleDeclaration(){
    }

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public String alignContent;

    @JsProperty( name = "alignContent")
    public native String getAlignContent();

    @JsProperty( name = "alignContent")
    public native void setAlignContent( String value );

    public String alignItems;

    @JsProperty( name = "alignItems")
    public native String getAlignItems();

    @JsProperty( name = "alignItems")
    public native void setAlignItems( String value );

    public String alignSelf;

    @JsProperty( name = "alignSelf")
    public native String getAlignSelf();

    @JsProperty( name = "alignSelf")
    public native void setAlignSelf( String value );

    public String alignmentBaseline;

    @JsProperty( name = "alignmentBaseline")
    public native String getAlignmentBaseline();

    @JsProperty( name = "alignmentBaseline")
    public native void setAlignmentBaseline( String value );

    public String animation;

    @JsProperty( name = "animation")
    public native String getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( String value );

    public String animationDelay;

    @JsProperty( name = "animationDelay")
    public native String getAnimationDelay();

    @JsProperty( name = "animationDelay")
    public native void setAnimationDelay( String value );

    public String animationDirection;

    @JsProperty( name = "animationDirection")
    public native String getAnimationDirection();

    @JsProperty( name = "animationDirection")
    public native void setAnimationDirection( String value );

    public String animationDuration;

    @JsProperty( name = "animationDuration")
    public native String getAnimationDuration();

    @JsProperty( name = "animationDuration")
    public native void setAnimationDuration( String value );

    public String animationFillMode;

    @JsProperty( name = "animationFillMode")
    public native String getAnimationFillMode();

    @JsProperty( name = "animationFillMode")
    public native void setAnimationFillMode( String value );

    public String animationIterationCount;

    @JsProperty( name = "animationIterationCount")
    public native String getAnimationIterationCount();

    @JsProperty( name = "animationIterationCount")
    public native void setAnimationIterationCount( String value );

    public String animationName;

    @JsProperty( name = "animationName")
    public native String getAnimationName();

    @JsProperty( name = "animationName")
    public native void setAnimationName( String value );

    public String animationPlayState;

    @JsProperty( name = "animationPlayState")
    public native String getAnimationPlayState();

    @JsProperty( name = "animationPlayState")
    public native void setAnimationPlayState( String value );

    public String animationTimingFunction;

    @JsProperty( name = "animationTimingFunction")
    public native String getAnimationTimingFunction();

    @JsProperty( name = "animationTimingFunction")
    public native void setAnimationTimingFunction( String value );

    public String backfaceVisibility;

    @JsProperty( name = "backfaceVisibility")
    public native String getBackfaceVisibility();

    @JsProperty( name = "backfaceVisibility")
    public native void setBackfaceVisibility( String value );

    public String background;

    @JsProperty( name = "background")
    public native String getBackground();

    @JsProperty( name = "background")
    public native void setBackground( String value );

    public String backgroundAttachment;

    @JsProperty( name = "backgroundAttachment")
    public native String getBackgroundAttachment();

    @JsProperty( name = "backgroundAttachment")
    public native void setBackgroundAttachment( String value );

    public String backgroundClip;

    @JsProperty( name = "backgroundClip")
    public native String getBackgroundClip();

    @JsProperty( name = "backgroundClip")
    public native void setBackgroundClip( String value );

    public String backgroundColor;

    @JsProperty( name = "backgroundColor")
    public native String getBackgroundColor();

    @JsProperty( name = "backgroundColor")
    public native void setBackgroundColor( String value );

    public String backgroundImage;

    @JsProperty( name = "backgroundImage")
    public native String getBackgroundImage();

    @JsProperty( name = "backgroundImage")
    public native void setBackgroundImage( String value );

    public String backgroundOrigin;

    @JsProperty( name = "backgroundOrigin")
    public native String getBackgroundOrigin();

    @JsProperty( name = "backgroundOrigin")
    public native void setBackgroundOrigin( String value );

    public String backgroundPosition;

    @JsProperty( name = "backgroundPosition")
    public native String getBackgroundPosition();

    @JsProperty( name = "backgroundPosition")
    public native void setBackgroundPosition( String value );

    public String backgroundPositionX;

    @JsProperty( name = "backgroundPositionX")
    public native String getBackgroundPositionX();

    @JsProperty( name = "backgroundPositionX")
    public native void setBackgroundPositionX( String value );

    public String backgroundPositionY;

    @JsProperty( name = "backgroundPositionY")
    public native String getBackgroundPositionY();

    @JsProperty( name = "backgroundPositionY")
    public native void setBackgroundPositionY( String value );

    public String backgroundRepeat;

    @JsProperty( name = "backgroundRepeat")
    public native String getBackgroundRepeat();

    @JsProperty( name = "backgroundRepeat")
    public native void setBackgroundRepeat( String value );

    public String backgroundSize;

    @JsProperty( name = "backgroundSize")
    public native String getBackgroundSize();

    @JsProperty( name = "backgroundSize")
    public native void setBackgroundSize( String value );

    public String baselineShift;

    @JsProperty( name = "baselineShift")
    public native String getBaselineShift();

    @JsProperty( name = "baselineShift")
    public native void setBaselineShift( String value );

    public String border;

    @JsProperty( name = "border")
    public native String getBorder();

    @JsProperty( name = "border")
    public native void setBorder( String value );

    public String borderBottom;

    @JsProperty( name = "borderBottom")
    public native String getBorderBottom();

    @JsProperty( name = "borderBottom")
    public native void setBorderBottom( String value );

    public String borderBottomColor;

    @JsProperty( name = "borderBottomColor")
    public native String getBorderBottomColor();

    @JsProperty( name = "borderBottomColor")
    public native void setBorderBottomColor( String value );

    public String borderBottomLeftRadius;

    @JsProperty( name = "borderBottomLeftRadius")
    public native String getBorderBottomLeftRadius();

    @JsProperty( name = "borderBottomLeftRadius")
    public native void setBorderBottomLeftRadius( String value );

    public String borderBottomRightRadius;

    @JsProperty( name = "borderBottomRightRadius")
    public native String getBorderBottomRightRadius();

    @JsProperty( name = "borderBottomRightRadius")
    public native void setBorderBottomRightRadius( String value );

    public String borderBottomStyle;

    @JsProperty( name = "borderBottomStyle")
    public native String getBorderBottomStyle();

    @JsProperty( name = "borderBottomStyle")
    public native void setBorderBottomStyle( String value );

    public String borderBottomWidth;

    @JsProperty( name = "borderBottomWidth")
    public native String getBorderBottomWidth();

    @JsProperty( name = "borderBottomWidth")
    public native void setBorderBottomWidth( String value );

    public String borderCollapse;

    @JsProperty( name = "borderCollapse")
    public native String getBorderCollapse();

    @JsProperty( name = "borderCollapse")
    public native void setBorderCollapse( String value );

    public String borderColor;

    @JsProperty( name = "borderColor")
    public native String getBorderColor();

    @JsProperty( name = "borderColor")
    public native void setBorderColor( String value );

    public String borderImage;

    @JsProperty( name = "borderImage")
    public native String getBorderImage();

    @JsProperty( name = "borderImage")
    public native void setBorderImage( String value );

    public String borderImageOutset;

    @JsProperty( name = "borderImageOutset")
    public native String getBorderImageOutset();

    @JsProperty( name = "borderImageOutset")
    public native void setBorderImageOutset( String value );

    public String borderImageRepeat;

    @JsProperty( name = "borderImageRepeat")
    public native String getBorderImageRepeat();

    @JsProperty( name = "borderImageRepeat")
    public native void setBorderImageRepeat( String value );

    public String borderImageSlice;

    @JsProperty( name = "borderImageSlice")
    public native String getBorderImageSlice();

    @JsProperty( name = "borderImageSlice")
    public native void setBorderImageSlice( String value );

    public String borderImageSource;

    @JsProperty( name = "borderImageSource")
    public native String getBorderImageSource();

    @JsProperty( name = "borderImageSource")
    public native void setBorderImageSource( String value );

    public String borderImageWidth;

    @JsProperty( name = "borderImageWidth")
    public native String getBorderImageWidth();

    @JsProperty( name = "borderImageWidth")
    public native void setBorderImageWidth( String value );

    public String borderLeft;

    @JsProperty( name = "borderLeft")
    public native String getBorderLeft();

    @JsProperty( name = "borderLeft")
    public native void setBorderLeft( String value );

    public String borderLeftColor;

    @JsProperty( name = "borderLeftColor")
    public native String getBorderLeftColor();

    @JsProperty( name = "borderLeftColor")
    public native void setBorderLeftColor( String value );

    public String borderLeftStyle;

    @JsProperty( name = "borderLeftStyle")
    public native String getBorderLeftStyle();

    @JsProperty( name = "borderLeftStyle")
    public native void setBorderLeftStyle( String value );

    public String borderLeftWidth;

    @JsProperty( name = "borderLeftWidth")
    public native String getBorderLeftWidth();

    @JsProperty( name = "borderLeftWidth")
    public native void setBorderLeftWidth( String value );

    public String borderRadius;

    @JsProperty( name = "borderRadius")
    public native String getBorderRadius();

    @JsProperty( name = "borderRadius")
    public native void setBorderRadius( String value );

    public String borderRight;

    @JsProperty( name = "borderRight")
    public native String getBorderRight();

    @JsProperty( name = "borderRight")
    public native void setBorderRight( String value );

    public String borderRightColor;

    @JsProperty( name = "borderRightColor")
    public native String getBorderRightColor();

    @JsProperty( name = "borderRightColor")
    public native void setBorderRightColor( String value );

    public String borderRightStyle;

    @JsProperty( name = "borderRightStyle")
    public native String getBorderRightStyle();

    @JsProperty( name = "borderRightStyle")
    public native void setBorderRightStyle( String value );

    public String borderRightWidth;

    @JsProperty( name = "borderRightWidth")
    public native String getBorderRightWidth();

    @JsProperty( name = "borderRightWidth")
    public native void setBorderRightWidth( String value );

    public String borderSpacing;

    @JsProperty( name = "borderSpacing")
    public native String getBorderSpacing();

    @JsProperty( name = "borderSpacing")
    public native void setBorderSpacing( String value );

    public String borderStyle;

    @JsProperty( name = "borderStyle")
    public native String getBorderStyle();

    @JsProperty( name = "borderStyle")
    public native void setBorderStyle( String value );

    public String borderTop;

    @JsProperty( name = "borderTop")
    public native String getBorderTop();

    @JsProperty( name = "borderTop")
    public native void setBorderTop( String value );

    public String borderTopColor;

    @JsProperty( name = "borderTopColor")
    public native String getBorderTopColor();

    @JsProperty( name = "borderTopColor")
    public native void setBorderTopColor( String value );

    public String borderTopLeftRadius;

    @JsProperty( name = "borderTopLeftRadius")
    public native String getBorderTopLeftRadius();

    @JsProperty( name = "borderTopLeftRadius")
    public native void setBorderTopLeftRadius( String value );

    public String borderTopRightRadius;

    @JsProperty( name = "borderTopRightRadius")
    public native String getBorderTopRightRadius();

    @JsProperty( name = "borderTopRightRadius")
    public native void setBorderTopRightRadius( String value );

    public String borderTopStyle;

    @JsProperty( name = "borderTopStyle")
    public native String getBorderTopStyle();

    @JsProperty( name = "borderTopStyle")
    public native void setBorderTopStyle( String value );

    public String borderTopWidth;

    @JsProperty( name = "borderTopWidth")
    public native String getBorderTopWidth();

    @JsProperty( name = "borderTopWidth")
    public native void setBorderTopWidth( String value );

    public String borderWidth;

    @JsProperty( name = "borderWidth")
    public native String getBorderWidth();

    @JsProperty( name = "borderWidth")
    public native void setBorderWidth( String value );

    public String bottom;

    @JsProperty( name = "bottom")
    public native String getBottom();

    @JsProperty( name = "bottom")
    public native void setBottom( String value );

    public String boxShadow;

    @JsProperty( name = "boxShadow")
    public native String getBoxShadow();

    @JsProperty( name = "boxShadow")
    public native void setBoxShadow( String value );

    public String boxSizing;

    @JsProperty( name = "boxSizing")
    public native String getBoxSizing();

    @JsProperty( name = "boxSizing")
    public native void setBoxSizing( String value );

    public String breakAfter;

    @JsProperty( name = "breakAfter")
    public native String getBreakAfter();

    @JsProperty( name = "breakAfter")
    public native void setBreakAfter( String value );

    public String breakBefore;

    @JsProperty( name = "breakBefore")
    public native String getBreakBefore();

    @JsProperty( name = "breakBefore")
    public native void setBreakBefore( String value );

    public String breakInside;

    @JsProperty( name = "breakInside")
    public native String getBreakInside();

    @JsProperty( name = "breakInside")
    public native void setBreakInside( String value );

    public String captionSide;

    @JsProperty( name = "captionSide")
    public native String getCaptionSide();

    @JsProperty( name = "captionSide")
    public native void setCaptionSide( String value );

    public String clear;

    @JsProperty( name = "clear")
    public native String getClear();

    @JsProperty( name = "clear")
    public native void setClear( String value );

    public String clip;

    @JsProperty( name = "clip")
    public native String getClip();

    @JsProperty( name = "clip")
    public native void setClip( String value );

    public String clipPath;

    @JsProperty( name = "clipPath")
    public native String getClipPath();

    @JsProperty( name = "clipPath")
    public native void setClipPath( String value );

    public String clipRule;

    @JsProperty( name = "clipRule")
    public native String getClipRule();

    @JsProperty( name = "clipRule")
    public native void setClipRule( String value );

    public String color;

    @JsProperty( name = "color")
    public native String getColor();

    @JsProperty( name = "color")
    public native void setColor( String value );

    public String colorInterpolationFilters;

    @JsProperty( name = "colorInterpolationFilters")
    public native String getColorInterpolationFilters();

    @JsProperty( name = "colorInterpolationFilters")
    public native void setColorInterpolationFilters( String value );

    public Object columnCount;

    @JsProperty( name = "columnCount")
    public native Object getColumnCount();

    @JsProperty( name = "columnCount")
    public native void setColumnCount( Object value );

    public String columnFill;

    @JsProperty( name = "columnFill")
    public native String getColumnFill();

    @JsProperty( name = "columnFill")
    public native void setColumnFill( String value );

    public Object columnGap;

    @JsProperty( name = "columnGap")
    public native Object getColumnGap();

    @JsProperty( name = "columnGap")
    public native void setColumnGap( Object value );

    public String columnRule;

    @JsProperty( name = "columnRule")
    public native String getColumnRule();

    @JsProperty( name = "columnRule")
    public native void setColumnRule( String value );

    public Object columnRuleColor;

    @JsProperty( name = "columnRuleColor")
    public native Object getColumnRuleColor();

    @JsProperty( name = "columnRuleColor")
    public native void setColumnRuleColor( Object value );

    public String columnRuleStyle;

    @JsProperty( name = "columnRuleStyle")
    public native String getColumnRuleStyle();

    @JsProperty( name = "columnRuleStyle")
    public native void setColumnRuleStyle( String value );

    public Object columnRuleWidth;

    @JsProperty( name = "columnRuleWidth")
    public native Object getColumnRuleWidth();

    @JsProperty( name = "columnRuleWidth")
    public native void setColumnRuleWidth( Object value );

    public String columnSpan;

    @JsProperty( name = "columnSpan")
    public native String getColumnSpan();

    @JsProperty( name = "columnSpan")
    public native void setColumnSpan( String value );

    public Object columnWidth;

    @JsProperty( name = "columnWidth")
    public native Object getColumnWidth();

    @JsProperty( name = "columnWidth")
    public native void setColumnWidth( Object value );

    public String columns;

    @JsProperty( name = "columns")
    public native String getColumns();

    @JsProperty( name = "columns")
    public native void setColumns( String value );

    public String content;

    @JsProperty( name = "content")
    public native String getContent();

    @JsProperty( name = "content")
    public native void setContent( String value );

    public String counterIncrement;

    @JsProperty( name = "counterIncrement")
    public native String getCounterIncrement();

    @JsProperty( name = "counterIncrement")
    public native void setCounterIncrement( String value );

    public String counterReset;

    @JsProperty( name = "counterReset")
    public native String getCounterReset();

    @JsProperty( name = "counterReset")
    public native void setCounterReset( String value );

    public String cssFloat;

    @JsProperty( name = "cssFloat")
    public native String getCssFloat();

    @JsProperty( name = "cssFloat")
    public native void setCssFloat( String value );

    public String cssText;

    @JsProperty( name = "cssText")
    public native String getCssText();

    @JsProperty( name = "cssText")
    public native void setCssText( String value );

    public String cursor;

    @JsProperty( name = "cursor")
    public native String getCursor();

    @JsProperty( name = "cursor")
    public native void setCursor( String value );

    public String direction;

    @JsProperty( name = "direction")
    public native String getDirection();

    @JsProperty( name = "direction")
    public native void setDirection( String value );

    public String display;

    @JsProperty( name = "display")
    public native String getDisplay();

    @JsProperty( name = "display")
    public native void setDisplay( String value );

    public String dominantBaseline;

    @JsProperty( name = "dominantBaseline")
    public native String getDominantBaseline();

    @JsProperty( name = "dominantBaseline")
    public native void setDominantBaseline( String value );

    public String emptyCells;

    @JsProperty( name = "emptyCells")
    public native String getEmptyCells();

    @JsProperty( name = "emptyCells")
    public native void setEmptyCells( String value );

    public String enableBackground;

    @JsProperty( name = "enableBackground")
    public native String getEnableBackground();

    @JsProperty( name = "enableBackground")
    public native void setEnableBackground( String value );

    public String fill;

    @JsProperty( name = "fill")
    public native String getFill();

    @JsProperty( name = "fill")
    public native void setFill( String value );

    public String fillOpacity;

    @JsProperty( name = "fillOpacity")
    public native String getFillOpacity();

    @JsProperty( name = "fillOpacity")
    public native void setFillOpacity( String value );

    public String fillRule;

    @JsProperty( name = "fillRule")
    public native String getFillRule();

    @JsProperty( name = "fillRule")
    public native void setFillRule( String value );

    public String filter;

    @JsProperty( name = "filter")
    public native String getFilter();

    @JsProperty( name = "filter")
    public native void setFilter( String value );

    public String flex;

    @JsProperty( name = "flex")
    public native String getFlex();

    @JsProperty( name = "flex")
    public native void setFlex( String value );

    public String flexBasis;

    @JsProperty( name = "flexBasis")
    public native String getFlexBasis();

    @JsProperty( name = "flexBasis")
    public native void setFlexBasis( String value );

    public String flexDirection;

    @JsProperty( name = "flexDirection")
    public native String getFlexDirection();

    @JsProperty( name = "flexDirection")
    public native void setFlexDirection( String value );

    public String flexFlow;

    @JsProperty( name = "flexFlow")
    public native String getFlexFlow();

    @JsProperty( name = "flexFlow")
    public native void setFlexFlow( String value );

    public String flexGrow;

    @JsProperty( name = "flexGrow")
    public native String getFlexGrow();

    @JsProperty( name = "flexGrow")
    public native void setFlexGrow( String value );

    public String flexShrink;

    @JsProperty( name = "flexShrink")
    public native String getFlexShrink();

    @JsProperty( name = "flexShrink")
    public native void setFlexShrink( String value );

    public String flexWrap;

    @JsProperty( name = "flexWrap")
    public native String getFlexWrap();

    @JsProperty( name = "flexWrap")
    public native void setFlexWrap( String value );

    public String floodColor;

    @JsProperty( name = "floodColor")
    public native String getFloodColor();

    @JsProperty( name = "floodColor")
    public native void setFloodColor( String value );

    public String floodOpacity;

    @JsProperty( name = "floodOpacity")
    public native String getFloodOpacity();

    @JsProperty( name = "floodOpacity")
    public native void setFloodOpacity( String value );

    public String font;

    @JsProperty( name = "font")
    public native String getFont();

    @JsProperty( name = "font")
    public native void setFont( String value );

    public String fontFamily;

    @JsProperty( name = "fontFamily")
    public native String getFontFamily();

    @JsProperty( name = "fontFamily")
    public native void setFontFamily( String value );

    public String fontFeatureSettings;

    @JsProperty( name = "fontFeatureSettings")
    public native String getFontFeatureSettings();

    @JsProperty( name = "fontFeatureSettings")
    public native void setFontFeatureSettings( String value );

    public String fontSize;

    @JsProperty( name = "fontSize")
    public native String getFontSize();

    @JsProperty( name = "fontSize")
    public native void setFontSize( String value );

    public String fontSizeAdjust;

    @JsProperty( name = "fontSizeAdjust")
    public native String getFontSizeAdjust();

    @JsProperty( name = "fontSizeAdjust")
    public native void setFontSizeAdjust( String value );

    public String fontStretch;

    @JsProperty( name = "fontStretch")
    public native String getFontStretch();

    @JsProperty( name = "fontStretch")
    public native void setFontStretch( String value );

    public String fontStyle;

    @JsProperty( name = "fontStyle")
    public native String getFontStyle();

    @JsProperty( name = "fontStyle")
    public native void setFontStyle( String value );

    public String fontVariant;

    @JsProperty( name = "fontVariant")
    public native String getFontVariant();

    @JsProperty( name = "fontVariant")
    public native void setFontVariant( String value );

    public String fontWeight;

    @JsProperty( name = "fontWeight")
    public native String getFontWeight();

    @JsProperty( name = "fontWeight")
    public native void setFontWeight( String value );

    public String glyphOrientationHorizontal;

    @JsProperty( name = "glyphOrientationHorizontal")
    public native String getGlyphOrientationHorizontal();

    @JsProperty( name = "glyphOrientationHorizontal")
    public native void setGlyphOrientationHorizontal( String value );

    public String glyphOrientationVertical;

    @JsProperty( name = "glyphOrientationVertical")
    public native String getGlyphOrientationVertical();

    @JsProperty( name = "glyphOrientationVertical")
    public native void setGlyphOrientationVertical( String value );

    public String height;

    @JsProperty( name = "height")
    public native String getHeight();

    @JsProperty( name = "height")
    public native void setHeight( String value );

    public String imeMode;

    @JsProperty( name = "imeMode")
    public native String getImeMode();

    @JsProperty( name = "imeMode")
    public native void setImeMode( String value );

    public String justifyContent;

    @JsProperty( name = "justifyContent")
    public native String getJustifyContent();

    @JsProperty( name = "justifyContent")
    public native void setJustifyContent( String value );

    public String kerning;

    @JsProperty( name = "kerning")
    public native String getKerning();

    @JsProperty( name = "kerning")
    public native void setKerning( String value );

    public String layoutGrid;

    @JsProperty( name = "layoutGrid")
    public native String getLayoutGrid();

    @JsProperty( name = "layoutGrid")
    public native void setLayoutGrid( String value );

    public String layoutGridChar;

    @JsProperty( name = "layoutGridChar")
    public native String getLayoutGridChar();

    @JsProperty( name = "layoutGridChar")
    public native void setLayoutGridChar( String value );

    public String layoutGridLine;

    @JsProperty( name = "layoutGridLine")
    public native String getLayoutGridLine();

    @JsProperty( name = "layoutGridLine")
    public native void setLayoutGridLine( String value );

    public String layoutGridMode;

    @JsProperty( name = "layoutGridMode")
    public native String getLayoutGridMode();

    @JsProperty( name = "layoutGridMode")
    public native void setLayoutGridMode( String value );

    public String layoutGridType;

    @JsProperty( name = "layoutGridType")
    public native String getLayoutGridType();

    @JsProperty( name = "layoutGridType")
    public native void setLayoutGridType( String value );

    public String left;

    @JsProperty( name = "left")
    public native String getLeft();

    @JsProperty( name = "left")
    public native void setLeft( String value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public String letterSpacing;

    @JsProperty( name = "letterSpacing")
    public native String getLetterSpacing();

    @JsProperty( name = "letterSpacing")
    public native void setLetterSpacing( String value );

    public String lightingColor;

    @JsProperty( name = "lightingColor")
    public native String getLightingColor();

    @JsProperty( name = "lightingColor")
    public native void setLightingColor( String value );

    public String lineBreak;

    @JsProperty( name = "lineBreak")
    public native String getLineBreak();

    @JsProperty( name = "lineBreak")
    public native void setLineBreak( String value );

    public String lineHeight;

    @JsProperty( name = "lineHeight")
    public native String getLineHeight();

    @JsProperty( name = "lineHeight")
    public native void setLineHeight( String value );

    public String listStyle;

    @JsProperty( name = "listStyle")
    public native String getListStyle();

    @JsProperty( name = "listStyle")
    public native void setListStyle( String value );

    public String listStyleImage;

    @JsProperty( name = "listStyleImage")
    public native String getListStyleImage();

    @JsProperty( name = "listStyleImage")
    public native void setListStyleImage( String value );

    public String listStylePosition;

    @JsProperty( name = "listStylePosition")
    public native String getListStylePosition();

    @JsProperty( name = "listStylePosition")
    public native void setListStylePosition( String value );

    public String listStyleType;

    @JsProperty( name = "listStyleType")
    public native String getListStyleType();

    @JsProperty( name = "listStyleType")
    public native void setListStyleType( String value );

    public String margin;

    @JsProperty( name = "margin")
    public native String getMargin();

    @JsProperty( name = "margin")
    public native void setMargin( String value );

    public String marginBottom;

    @JsProperty( name = "marginBottom")
    public native String getMarginBottom();

    @JsProperty( name = "marginBottom")
    public native void setMarginBottom( String value );

    public String marginLeft;

    @JsProperty( name = "marginLeft")
    public native String getMarginLeft();

    @JsProperty( name = "marginLeft")
    public native void setMarginLeft( String value );

    public String marginRight;

    @JsProperty( name = "marginRight")
    public native String getMarginRight();

    @JsProperty( name = "marginRight")
    public native void setMarginRight( String value );

    public String marginTop;

    @JsProperty( name = "marginTop")
    public native String getMarginTop();

    @JsProperty( name = "marginTop")
    public native void setMarginTop( String value );

    public String marker;

    @JsProperty( name = "marker")
    public native String getMarker();

    @JsProperty( name = "marker")
    public native void setMarker( String value );

    public String markerEnd;

    @JsProperty( name = "markerEnd")
    public native String getMarkerEnd();

    @JsProperty( name = "markerEnd")
    public native void setMarkerEnd( String value );

    public String markerMid;

    @JsProperty( name = "markerMid")
    public native String getMarkerMid();

    @JsProperty( name = "markerMid")
    public native void setMarkerMid( String value );

    public String markerStart;

    @JsProperty( name = "markerStart")
    public native String getMarkerStart();

    @JsProperty( name = "markerStart")
    public native void setMarkerStart( String value );

    public String mask;

    @JsProperty( name = "mask")
    public native String getMask();

    @JsProperty( name = "mask")
    public native void setMask( String value );

    public String maxHeight;

    @JsProperty( name = "maxHeight")
    public native String getMaxHeight();

    @JsProperty( name = "maxHeight")
    public native void setMaxHeight( String value );

    public String maxWidth;

    @JsProperty( name = "maxWidth")
    public native String getMaxWidth();

    @JsProperty( name = "maxWidth")
    public native void setMaxWidth( String value );

    public String minHeight;

    @JsProperty( name = "minHeight")
    public native String getMinHeight();

    @JsProperty( name = "minHeight")
    public native void setMinHeight( String value );

    public String minWidth;

    @JsProperty( name = "minWidth")
    public native String getMinWidth();

    @JsProperty( name = "minWidth")
    public native void setMinWidth( String value );

    public String msContentZoomChaining;

    @JsProperty( name = "msContentZoomChaining")
    public native String getMsContentZoomChaining();

    @JsProperty( name = "msContentZoomChaining")
    public native void setMsContentZoomChaining( String value );

    public String msContentZoomLimit;

    @JsProperty( name = "msContentZoomLimit")
    public native String getMsContentZoomLimit();

    @JsProperty( name = "msContentZoomLimit")
    public native void setMsContentZoomLimit( String value );

    public Object msContentZoomLimitMax;

    @JsProperty( name = "msContentZoomLimitMax")
    public native Object getMsContentZoomLimitMax();

    @JsProperty( name = "msContentZoomLimitMax")
    public native void setMsContentZoomLimitMax( Object value );

    public Object msContentZoomLimitMin;

    @JsProperty( name = "msContentZoomLimitMin")
    public native Object getMsContentZoomLimitMin();

    @JsProperty( name = "msContentZoomLimitMin")
    public native void setMsContentZoomLimitMin( Object value );

    public String msContentZoomSnap;

    @JsProperty( name = "msContentZoomSnap")
    public native String getMsContentZoomSnap();

    @JsProperty( name = "msContentZoomSnap")
    public native void setMsContentZoomSnap( String value );

    public String msContentZoomSnapPoints;

    @JsProperty( name = "msContentZoomSnapPoints")
    public native String getMsContentZoomSnapPoints();

    @JsProperty( name = "msContentZoomSnapPoints")
    public native void setMsContentZoomSnapPoints( String value );

    public String msContentZoomSnapType;

    @JsProperty( name = "msContentZoomSnapType")
    public native String getMsContentZoomSnapType();

    @JsProperty( name = "msContentZoomSnapType")
    public native void setMsContentZoomSnapType( String value );

    public String msContentZooming;

    @JsProperty( name = "msContentZooming")
    public native String getMsContentZooming();

    @JsProperty( name = "msContentZooming")
    public native void setMsContentZooming( String value );

    public String msFlowFrom;

    @JsProperty( name = "msFlowFrom")
    public native String getMsFlowFrom();

    @JsProperty( name = "msFlowFrom")
    public native void setMsFlowFrom( String value );

    public String msFlowInto;

    @JsProperty( name = "msFlowInto")
    public native String getMsFlowInto();

    @JsProperty( name = "msFlowInto")
    public native void setMsFlowInto( String value );

    public String msFontFeatureSettings;

    @JsProperty( name = "msFontFeatureSettings")
    public native String getMsFontFeatureSettings();

    @JsProperty( name = "msFontFeatureSettings")
    public native void setMsFontFeatureSettings( String value );

    public Object msGridColumn;

    @JsProperty( name = "msGridColumn")
    public native Object getMsGridColumn();

    @JsProperty( name = "msGridColumn")
    public native void setMsGridColumn( Object value );

    public String msGridColumnAlign;

    @JsProperty( name = "msGridColumnAlign")
    public native String getMsGridColumnAlign();

    @JsProperty( name = "msGridColumnAlign")
    public native void setMsGridColumnAlign( String value );

    public Object msGridColumnSpan;

    @JsProperty( name = "msGridColumnSpan")
    public native Object getMsGridColumnSpan();

    @JsProperty( name = "msGridColumnSpan")
    public native void setMsGridColumnSpan( Object value );

    public String msGridColumns;

    @JsProperty( name = "msGridColumns")
    public native String getMsGridColumns();

    @JsProperty( name = "msGridColumns")
    public native void setMsGridColumns( String value );

    public Object msGridRow;

    @JsProperty( name = "msGridRow")
    public native Object getMsGridRow();

    @JsProperty( name = "msGridRow")
    public native void setMsGridRow( Object value );

    public String msGridRowAlign;

    @JsProperty( name = "msGridRowAlign")
    public native String getMsGridRowAlign();

    @JsProperty( name = "msGridRowAlign")
    public native void setMsGridRowAlign( String value );

    public Object msGridRowSpan;

    @JsProperty( name = "msGridRowSpan")
    public native Object getMsGridRowSpan();

    @JsProperty( name = "msGridRowSpan")
    public native void setMsGridRowSpan( Object value );

    public String msGridRows;

    @JsProperty( name = "msGridRows")
    public native String getMsGridRows();

    @JsProperty( name = "msGridRows")
    public native void setMsGridRows( String value );

    public String msHighContrastAdjust;

    @JsProperty( name = "msHighContrastAdjust")
    public native String getMsHighContrastAdjust();

    @JsProperty( name = "msHighContrastAdjust")
    public native void setMsHighContrastAdjust( String value );

    public String msHyphenateLimitChars;

    @JsProperty( name = "msHyphenateLimitChars")
    public native String getMsHyphenateLimitChars();

    @JsProperty( name = "msHyphenateLimitChars")
    public native void setMsHyphenateLimitChars( String value );

    public Object msHyphenateLimitLines;

    @JsProperty( name = "msHyphenateLimitLines")
    public native Object getMsHyphenateLimitLines();

    @JsProperty( name = "msHyphenateLimitLines")
    public native void setMsHyphenateLimitLines( Object value );

    public Object msHyphenateLimitZone;

    @JsProperty( name = "msHyphenateLimitZone")
    public native Object getMsHyphenateLimitZone();

    @JsProperty( name = "msHyphenateLimitZone")
    public native void setMsHyphenateLimitZone( Object value );

    public String msHyphens;

    @JsProperty( name = "msHyphens")
    public native String getMsHyphens();

    @JsProperty( name = "msHyphens")
    public native void setMsHyphens( String value );

    public String msImeAlign;

    @JsProperty( name = "msImeAlign")
    public native String getMsImeAlign();

    @JsProperty( name = "msImeAlign")
    public native void setMsImeAlign( String value );

    public String msOverflowStyle;

    @JsProperty( name = "msOverflowStyle")
    public native String getMsOverflowStyle();

    @JsProperty( name = "msOverflowStyle")
    public native void setMsOverflowStyle( String value );

    public String msScrollChaining;

    @JsProperty( name = "msScrollChaining")
    public native String getMsScrollChaining();

    @JsProperty( name = "msScrollChaining")
    public native void setMsScrollChaining( String value );

    public String msScrollLimit;

    @JsProperty( name = "msScrollLimit")
    public native String getMsScrollLimit();

    @JsProperty( name = "msScrollLimit")
    public native void setMsScrollLimit( String value );

    public Object msScrollLimitXMax;

    @JsProperty( name = "msScrollLimitXMax")
    public native Object getMsScrollLimitXMax();

    @JsProperty( name = "msScrollLimitXMax")
    public native void setMsScrollLimitXMax( Object value );

    public Object msScrollLimitXMin;

    @JsProperty( name = "msScrollLimitXMin")
    public native Object getMsScrollLimitXMin();

    @JsProperty( name = "msScrollLimitXMin")
    public native void setMsScrollLimitXMin( Object value );

    public Object msScrollLimitYMax;

    @JsProperty( name = "msScrollLimitYMax")
    public native Object getMsScrollLimitYMax();

    @JsProperty( name = "msScrollLimitYMax")
    public native void setMsScrollLimitYMax( Object value );

    public Object msScrollLimitYMin;

    @JsProperty( name = "msScrollLimitYMin")
    public native Object getMsScrollLimitYMin();

    @JsProperty( name = "msScrollLimitYMin")
    public native void setMsScrollLimitYMin( Object value );

    public String msScrollRails;

    @JsProperty( name = "msScrollRails")
    public native String getMsScrollRails();

    @JsProperty( name = "msScrollRails")
    public native void setMsScrollRails( String value );

    public String msScrollSnapPointsX;

    @JsProperty( name = "msScrollSnapPointsX")
    public native String getMsScrollSnapPointsX();

    @JsProperty( name = "msScrollSnapPointsX")
    public native void setMsScrollSnapPointsX( String value );

    public String msScrollSnapPointsY;

    @JsProperty( name = "msScrollSnapPointsY")
    public native String getMsScrollSnapPointsY();

    @JsProperty( name = "msScrollSnapPointsY")
    public native void setMsScrollSnapPointsY( String value );

    public String msScrollSnapType;

    @JsProperty( name = "msScrollSnapType")
    public native String getMsScrollSnapType();

    @JsProperty( name = "msScrollSnapType")
    public native void setMsScrollSnapType( String value );

    public String msScrollSnapX;

    @JsProperty( name = "msScrollSnapX")
    public native String getMsScrollSnapX();

    @JsProperty( name = "msScrollSnapX")
    public native void setMsScrollSnapX( String value );

    public String msScrollSnapY;

    @JsProperty( name = "msScrollSnapY")
    public native String getMsScrollSnapY();

    @JsProperty( name = "msScrollSnapY")
    public native void setMsScrollSnapY( String value );

    public String msScrollTranslation;

    @JsProperty( name = "msScrollTranslation")
    public native String getMsScrollTranslation();

    @JsProperty( name = "msScrollTranslation")
    public native void setMsScrollTranslation( String value );

    public String msTextCombineHorizontal;

    @JsProperty( name = "msTextCombineHorizontal")
    public native String getMsTextCombineHorizontal();

    @JsProperty( name = "msTextCombineHorizontal")
    public native void setMsTextCombineHorizontal( String value );

    public Object msTextSizeAdjust;

    @JsProperty( name = "msTextSizeAdjust")
    public native Object getMsTextSizeAdjust();

    @JsProperty( name = "msTextSizeAdjust")
    public native void setMsTextSizeAdjust( Object value );

    public String msTouchAction;

    @JsProperty( name = "msTouchAction")
    public native String getMsTouchAction();

    @JsProperty( name = "msTouchAction")
    public native void setMsTouchAction( String value );

    public String msTouchSelect;

    @JsProperty( name = "msTouchSelect")
    public native String getMsTouchSelect();

    @JsProperty( name = "msTouchSelect")
    public native void setMsTouchSelect( String value );

    public String msUserSelect;

    @JsProperty( name = "msUserSelect")
    public native String getMsUserSelect();

    @JsProperty( name = "msUserSelect")
    public native void setMsUserSelect( String value );

    public String msWrapFlow;

    @JsProperty( name = "msWrapFlow")
    public native String getMsWrapFlow();

    @JsProperty( name = "msWrapFlow")
    public native void setMsWrapFlow( String value );

    public Object msWrapMargin;

    @JsProperty( name = "msWrapMargin")
    public native Object getMsWrapMargin();

    @JsProperty( name = "msWrapMargin")
    public native void setMsWrapMargin( Object value );

    public String msWrapThrough;

    @JsProperty( name = "msWrapThrough")
    public native String getMsWrapThrough();

    @JsProperty( name = "msWrapThrough")
    public native void setMsWrapThrough( String value );

    public String opacity;

    @JsProperty( name = "opacity")
    public native String getOpacity();

    @JsProperty( name = "opacity")
    public native void setOpacity( String value );

    public String order;

    @JsProperty( name = "order")
    public native String getOrder();

    @JsProperty( name = "order")
    public native void setOrder( String value );

    public String orphans;

    @JsProperty( name = "orphans")
    public native String getOrphans();

    @JsProperty( name = "orphans")
    public native void setOrphans( String value );

    public String outline;

    @JsProperty( name = "outline")
    public native String getOutline();

    @JsProperty( name = "outline")
    public native void setOutline( String value );

    public String outlineColor;

    @JsProperty( name = "outlineColor")
    public native String getOutlineColor();

    @JsProperty( name = "outlineColor")
    public native void setOutlineColor( String value );

    public String outlineOffset;

    @JsProperty( name = "outlineOffset")
    public native String getOutlineOffset();

    @JsProperty( name = "outlineOffset")
    public native void setOutlineOffset( String value );

    public String outlineStyle;

    @JsProperty( name = "outlineStyle")
    public native String getOutlineStyle();

    @JsProperty( name = "outlineStyle")
    public native void setOutlineStyle( String value );

    public String outlineWidth;

    @JsProperty( name = "outlineWidth")
    public native String getOutlineWidth();

    @JsProperty( name = "outlineWidth")
    public native void setOutlineWidth( String value );

    public String overflow;

    @JsProperty( name = "overflow")
    public native String getOverflow();

    @JsProperty( name = "overflow")
    public native void setOverflow( String value );

    public String overflowX;

    @JsProperty( name = "overflowX")
    public native String getOverflowX();

    @JsProperty( name = "overflowX")
    public native void setOverflowX( String value );

    public String overflowY;

    @JsProperty( name = "overflowY")
    public native String getOverflowY();

    @JsProperty( name = "overflowY")
    public native void setOverflowY( String value );

    public String padding;

    @JsProperty( name = "padding")
    public native String getPadding();

    @JsProperty( name = "padding")
    public native void setPadding( String value );

    public String paddingBottom;

    @JsProperty( name = "paddingBottom")
    public native String getPaddingBottom();

    @JsProperty( name = "paddingBottom")
    public native void setPaddingBottom( String value );

    public String paddingLeft;

    @JsProperty( name = "paddingLeft")
    public native String getPaddingLeft();

    @JsProperty( name = "paddingLeft")
    public native void setPaddingLeft( String value );

    public String paddingRight;

    @JsProperty( name = "paddingRight")
    public native String getPaddingRight();

    @JsProperty( name = "paddingRight")
    public native void setPaddingRight( String value );

    public String paddingTop;

    @JsProperty( name = "paddingTop")
    public native String getPaddingTop();

    @JsProperty( name = "paddingTop")
    public native void setPaddingTop( String value );

    public String pageBreakAfter;

    @JsProperty( name = "pageBreakAfter")
    public native String getPageBreakAfter();

    @JsProperty( name = "pageBreakAfter")
    public native void setPageBreakAfter( String value );

    public String pageBreakBefore;

    @JsProperty( name = "pageBreakBefore")
    public native String getPageBreakBefore();

    @JsProperty( name = "pageBreakBefore")
    public native void setPageBreakBefore( String value );

    public String pageBreakInside;

    @JsProperty( name = "pageBreakInside")
    public native String getPageBreakInside();

    @JsProperty( name = "pageBreakInside")
    public native void setPageBreakInside( String value );

    public CSSRule parentRule;

    @JsProperty( name = "parentRule")
    public native CSSRule getParentRule();

    @JsProperty( name = "parentRule")
    public native void setParentRule( CSSRule value );

    public String perspective;

    @JsProperty( name = "perspective")
    public native String getPerspective();

    @JsProperty( name = "perspective")
    public native void setPerspective( String value );

    public String perspectiveOrigin;

    @JsProperty( name = "perspectiveOrigin")
    public native String getPerspectiveOrigin();

    @JsProperty( name = "perspectiveOrigin")
    public native void setPerspectiveOrigin( String value );

    public String pointerEvents;

    @JsProperty( name = "pointerEvents")
    public native String getPointerEvents();

    @JsProperty( name = "pointerEvents")
    public native void setPointerEvents( String value );

    public String position;

    @JsProperty( name = "position")
    public native String getPosition();

    @JsProperty( name = "position")
    public native void setPosition( String value );

    public String quotes;

    @JsProperty( name = "quotes")
    public native String getQuotes();

    @JsProperty( name = "quotes")
    public native void setQuotes( String value );

    public String resize;

    @JsProperty( name = "resize")
    public native String getResize();

    @JsProperty( name = "resize")
    public native void setResize( String value );

    public String right;

    @JsProperty( name = "right")
    public native String getRight();

    @JsProperty( name = "right")
    public native void setRight( String value );

    public String rotate;

    @JsProperty( name = "rotate")
    public native String getRotate();

    @JsProperty( name = "rotate")
    public native void setRotate( String value );

    public String rubyAlign;

    @JsProperty( name = "rubyAlign")
    public native String getRubyAlign();

    @JsProperty( name = "rubyAlign")
    public native void setRubyAlign( String value );

    public String rubyOverhang;

    @JsProperty( name = "rubyOverhang")
    public native String getRubyOverhang();

    @JsProperty( name = "rubyOverhang")
    public native void setRubyOverhang( String value );

    public String rubyPosition;

    @JsProperty( name = "rubyPosition")
    public native String getRubyPosition();

    @JsProperty( name = "rubyPosition")
    public native void setRubyPosition( String value );

    public String scale;

    @JsProperty( name = "scale")
    public native String getScale();

    @JsProperty( name = "scale")
    public native void setScale( String value );

    public String stopColor;

    @JsProperty( name = "stopColor")
    public native String getStopColor();

    @JsProperty( name = "stopColor")
    public native void setStopColor( String value );

    public String stopOpacity;

    @JsProperty( name = "stopOpacity")
    public native String getStopOpacity();

    @JsProperty( name = "stopOpacity")
    public native void setStopOpacity( String value );

    public String stroke;

    @JsProperty( name = "stroke")
    public native String getStroke();

    @JsProperty( name = "stroke")
    public native void setStroke( String value );

    public String strokeDasharray;

    @JsProperty( name = "strokeDasharray")
    public native String getStrokeDasharray();

    @JsProperty( name = "strokeDasharray")
    public native void setStrokeDasharray( String value );

    public String strokeDashoffset;

    @JsProperty( name = "strokeDashoffset")
    public native String getStrokeDashoffset();

    @JsProperty( name = "strokeDashoffset")
    public native void setStrokeDashoffset( String value );

    public String strokeLinecap;

    @JsProperty( name = "strokeLinecap")
    public native String getStrokeLinecap();

    @JsProperty( name = "strokeLinecap")
    public native void setStrokeLinecap( String value );

    public String strokeLinejoin;

    @JsProperty( name = "strokeLinejoin")
    public native String getStrokeLinejoin();

    @JsProperty( name = "strokeLinejoin")
    public native void setStrokeLinejoin( String value );

    public String strokeMiterlimit;

    @JsProperty( name = "strokeMiterlimit")
    public native String getStrokeMiterlimit();

    @JsProperty( name = "strokeMiterlimit")
    public native void setStrokeMiterlimit( String value );

    public String strokeOpacity;

    @JsProperty( name = "strokeOpacity")
    public native String getStrokeOpacity();

    @JsProperty( name = "strokeOpacity")
    public native void setStrokeOpacity( String value );

    public String strokeWidth;

    @JsProperty( name = "strokeWidth")
    public native String getStrokeWidth();

    @JsProperty( name = "strokeWidth")
    public native void setStrokeWidth( String value );

    public String tableLayout;

    @JsProperty( name = "tableLayout")
    public native String getTableLayout();

    @JsProperty( name = "tableLayout")
    public native void setTableLayout( String value );

    public String textAlign;

    @JsProperty( name = "textAlign")
    public native String getTextAlign();

    @JsProperty( name = "textAlign")
    public native void setTextAlign( String value );

    public String textAlignLast;

    @JsProperty( name = "textAlignLast")
    public native String getTextAlignLast();

    @JsProperty( name = "textAlignLast")
    public native void setTextAlignLast( String value );

    public String textAnchor;

    @JsProperty( name = "textAnchor")
    public native String getTextAnchor();

    @JsProperty( name = "textAnchor")
    public native void setTextAnchor( String value );

    public String textDecoration;

    @JsProperty( name = "textDecoration")
    public native String getTextDecoration();

    @JsProperty( name = "textDecoration")
    public native void setTextDecoration( String value );

    public String textIndent;

    @JsProperty( name = "textIndent")
    public native String getTextIndent();

    @JsProperty( name = "textIndent")
    public native void setTextIndent( String value );

    public String textJustify;

    @JsProperty( name = "textJustify")
    public native String getTextJustify();

    @JsProperty( name = "textJustify")
    public native void setTextJustify( String value );

    public String textKashida;

    @JsProperty( name = "textKashida")
    public native String getTextKashida();

    @JsProperty( name = "textKashida")
    public native void setTextKashida( String value );

    public String textKashidaSpace;

    @JsProperty( name = "textKashidaSpace")
    public native String getTextKashidaSpace();

    @JsProperty( name = "textKashidaSpace")
    public native void setTextKashidaSpace( String value );

    public String textOverflow;

    @JsProperty( name = "textOverflow")
    public native String getTextOverflow();

    @JsProperty( name = "textOverflow")
    public native void setTextOverflow( String value );

    public String textShadow;

    @JsProperty( name = "textShadow")
    public native String getTextShadow();

    @JsProperty( name = "textShadow")
    public native void setTextShadow( String value );

    public String textTransform;

    @JsProperty( name = "textTransform")
    public native String getTextTransform();

    @JsProperty( name = "textTransform")
    public native void setTextTransform( String value );

    public String textUnderlinePosition;

    @JsProperty( name = "textUnderlinePosition")
    public native String getTextUnderlinePosition();

    @JsProperty( name = "textUnderlinePosition")
    public native void setTextUnderlinePosition( String value );

    public String top;

    @JsProperty( name = "top")
    public native String getTop();

    @JsProperty( name = "top")
    public native void setTop( String value );

    public String touchAction;

    @JsProperty( name = "touchAction")
    public native String getTouchAction();

    @JsProperty( name = "touchAction")
    public native void setTouchAction( String value );

    public String transform;

    @JsProperty( name = "transform")
    public native String getTransform();

    @JsProperty( name = "transform")
    public native void setTransform( String value );

    public String transformOrigin;

    @JsProperty( name = "transformOrigin")
    public native String getTransformOrigin();

    @JsProperty( name = "transformOrigin")
    public native void setTransformOrigin( String value );

    public String transformStyle;

    @JsProperty( name = "transformStyle")
    public native String getTransformStyle();

    @JsProperty( name = "transformStyle")
    public native void setTransformStyle( String value );

    public String transition;

    @JsProperty( name = "transition")
    public native String getTransition();

    @JsProperty( name = "transition")
    public native void setTransition( String value );

    public String transitionDelay;

    @JsProperty( name = "transitionDelay")
    public native String getTransitionDelay();

    @JsProperty( name = "transitionDelay")
    public native void setTransitionDelay( String value );

    public String transitionDuration;

    @JsProperty( name = "transitionDuration")
    public native String getTransitionDuration();

    @JsProperty( name = "transitionDuration")
    public native void setTransitionDuration( String value );

    public String transitionProperty;

    @JsProperty( name = "transitionProperty")
    public native String getTransitionProperty();

    @JsProperty( name = "transitionProperty")
    public native void setTransitionProperty( String value );

    public String transitionTimingFunction;

    @JsProperty( name = "transitionTimingFunction")
    public native String getTransitionTimingFunction();

    @JsProperty( name = "transitionTimingFunction")
    public native void setTransitionTimingFunction( String value );

    public String translate;

    @JsProperty( name = "translate")
    public native String getTranslate();

    @JsProperty( name = "translate")
    public native void setTranslate( String value );

    public String unicodeBidi;

    @JsProperty( name = "unicodeBidi")
    public native String getUnicodeBidi();

    @JsProperty( name = "unicodeBidi")
    public native void setUnicodeBidi( String value );

    public String userSelect;

    @JsProperty( name = "userSelect")
    public native String getUserSelect();

    @JsProperty( name = "userSelect")
    public native void setUserSelect( String value );

    public String verticalAlign;

    @JsProperty( name = "verticalAlign")
    public native String getVerticalAlign();

    @JsProperty( name = "verticalAlign")
    public native void setVerticalAlign( String value );

    public String visibility;

    @JsProperty( name = "visibility")
    public native String getVisibility();

    @JsProperty( name = "visibility")
    public native void setVisibility( String value );

    public String webkitAlignContent;

    @JsProperty( name = "webkitAlignContent")
    public native String getWebkitAlignContent();

    @JsProperty( name = "webkitAlignContent")
    public native void setWebkitAlignContent( String value );

    public String webkitAlignItems;

    @JsProperty( name = "webkitAlignItems")
    public native String getWebkitAlignItems();

    @JsProperty( name = "webkitAlignItems")
    public native void setWebkitAlignItems( String value );

    public String webkitAlignSelf;

    @JsProperty( name = "webkitAlignSelf")
    public native String getWebkitAlignSelf();

    @JsProperty( name = "webkitAlignSelf")
    public native void setWebkitAlignSelf( String value );

    public String webkitAnimation;

    @JsProperty( name = "webkitAnimation")
    public native String getWebkitAnimation();

    @JsProperty( name = "webkitAnimation")
    public native void setWebkitAnimation( String value );

    public String webkitAnimationDelay;

    @JsProperty( name = "webkitAnimationDelay")
    public native String getWebkitAnimationDelay();

    @JsProperty( name = "webkitAnimationDelay")
    public native void setWebkitAnimationDelay( String value );

    public String webkitAnimationDirection;

    @JsProperty( name = "webkitAnimationDirection")
    public native String getWebkitAnimationDirection();

    @JsProperty( name = "webkitAnimationDirection")
    public native void setWebkitAnimationDirection( String value );

    public String webkitAnimationDuration;

    @JsProperty( name = "webkitAnimationDuration")
    public native String getWebkitAnimationDuration();

    @JsProperty( name = "webkitAnimationDuration")
    public native void setWebkitAnimationDuration( String value );

    public String webkitAnimationFillMode;

    @JsProperty( name = "webkitAnimationFillMode")
    public native String getWebkitAnimationFillMode();

    @JsProperty( name = "webkitAnimationFillMode")
    public native void setWebkitAnimationFillMode( String value );

    public String webkitAnimationIterationCount;

    @JsProperty( name = "webkitAnimationIterationCount")
    public native String getWebkitAnimationIterationCount();

    @JsProperty( name = "webkitAnimationIterationCount")
    public native void setWebkitAnimationIterationCount( String value );

    public String webkitAnimationName;

    @JsProperty( name = "webkitAnimationName")
    public native String getWebkitAnimationName();

    @JsProperty( name = "webkitAnimationName")
    public native void setWebkitAnimationName( String value );

    public String webkitAnimationPlayState;

    @JsProperty( name = "webkitAnimationPlayState")
    public native String getWebkitAnimationPlayState();

    @JsProperty( name = "webkitAnimationPlayState")
    public native void setWebkitAnimationPlayState( String value );

    public String webkitAnimationTimingFunction;

    @JsProperty( name = "webkitAnimationTimingFunction")
    public native String getWebkitAnimationTimingFunction();

    @JsProperty( name = "webkitAnimationTimingFunction")
    public native void setWebkitAnimationTimingFunction( String value );

    public String webkitAppearance;

    @JsProperty( name = "webkitAppearance")
    public native String getWebkitAppearance();

    @JsProperty( name = "webkitAppearance")
    public native void setWebkitAppearance( String value );

    public String webkitBackfaceVisibility;

    @JsProperty( name = "webkitBackfaceVisibility")
    public native String getWebkitBackfaceVisibility();

    @JsProperty( name = "webkitBackfaceVisibility")
    public native void setWebkitBackfaceVisibility( String value );

    public String webkitBackgroundClip;

    @JsProperty( name = "webkitBackgroundClip")
    public native String getWebkitBackgroundClip();

    @JsProperty( name = "webkitBackgroundClip")
    public native void setWebkitBackgroundClip( String value );

    public String webkitBackgroundOrigin;

    @JsProperty( name = "webkitBackgroundOrigin")
    public native String getWebkitBackgroundOrigin();

    @JsProperty( name = "webkitBackgroundOrigin")
    public native void setWebkitBackgroundOrigin( String value );

    public String webkitBackgroundSize;

    @JsProperty( name = "webkitBackgroundSize")
    public native String getWebkitBackgroundSize();

    @JsProperty( name = "webkitBackgroundSize")
    public native void setWebkitBackgroundSize( String value );

    public String webkitBorderBottomLeftRadius;

    @JsProperty( name = "webkitBorderBottomLeftRadius")
    public native String getWebkitBorderBottomLeftRadius();

    @JsProperty( name = "webkitBorderBottomLeftRadius")
    public native void setWebkitBorderBottomLeftRadius( String value );

    public String webkitBorderBottomRightRadius;

    @JsProperty( name = "webkitBorderBottomRightRadius")
    public native String getWebkitBorderBottomRightRadius();

    @JsProperty( name = "webkitBorderBottomRightRadius")
    public native void setWebkitBorderBottomRightRadius( String value );

    public String webkitBorderImage;

    @JsProperty( name = "webkitBorderImage")
    public native String getWebkitBorderImage();

    @JsProperty( name = "webkitBorderImage")
    public native void setWebkitBorderImage( String value );

    public String webkitBorderRadius;

    @JsProperty( name = "webkitBorderRadius")
    public native String getWebkitBorderRadius();

    @JsProperty( name = "webkitBorderRadius")
    public native void setWebkitBorderRadius( String value );

    public String webkitBorderTopLeftRadius;

    @JsProperty( name = "webkitBorderTopLeftRadius")
    public native String getWebkitBorderTopLeftRadius();

    @JsProperty( name = "webkitBorderTopLeftRadius")
    public native void setWebkitBorderTopLeftRadius( String value );

    public String webkitBorderTopRightRadius;

    @JsProperty( name = "webkitBorderTopRightRadius")
    public native String getWebkitBorderTopRightRadius();

    @JsProperty( name = "webkitBorderTopRightRadius")
    public native void setWebkitBorderTopRightRadius( String value );

    public String webkitBoxAlign;

    @JsProperty( name = "webkitBoxAlign")
    public native String getWebkitBoxAlign();

    @JsProperty( name = "webkitBoxAlign")
    public native void setWebkitBoxAlign( String value );

    public String webkitBoxDirection;

    @JsProperty( name = "webkitBoxDirection")
    public native String getWebkitBoxDirection();

    @JsProperty( name = "webkitBoxDirection")
    public native void setWebkitBoxDirection( String value );

    public String webkitBoxFlex;

    @JsProperty( name = "webkitBoxFlex")
    public native String getWebkitBoxFlex();

    @JsProperty( name = "webkitBoxFlex")
    public native void setWebkitBoxFlex( String value );

    public String webkitBoxOrdinalGroup;

    @JsProperty( name = "webkitBoxOrdinalGroup")
    public native String getWebkitBoxOrdinalGroup();

    @JsProperty( name = "webkitBoxOrdinalGroup")
    public native void setWebkitBoxOrdinalGroup( String value );

    public String webkitBoxOrient;

    @JsProperty( name = "webkitBoxOrient")
    public native String getWebkitBoxOrient();

    @JsProperty( name = "webkitBoxOrient")
    public native void setWebkitBoxOrient( String value );

    public String webkitBoxPack;

    @JsProperty( name = "webkitBoxPack")
    public native String getWebkitBoxPack();

    @JsProperty( name = "webkitBoxPack")
    public native void setWebkitBoxPack( String value );

    public String webkitBoxSizing;

    @JsProperty( name = "webkitBoxSizing")
    public native String getWebkitBoxSizing();

    @JsProperty( name = "webkitBoxSizing")
    public native void setWebkitBoxSizing( String value );

    public String webkitColumnBreakAfter;

    @JsProperty( name = "webkitColumnBreakAfter")
    public native String getWebkitColumnBreakAfter();

    @JsProperty( name = "webkitColumnBreakAfter")
    public native void setWebkitColumnBreakAfter( String value );

    public String webkitColumnBreakBefore;

    @JsProperty( name = "webkitColumnBreakBefore")
    public native String getWebkitColumnBreakBefore();

    @JsProperty( name = "webkitColumnBreakBefore")
    public native void setWebkitColumnBreakBefore( String value );

    public String webkitColumnBreakInside;

    @JsProperty( name = "webkitColumnBreakInside")
    public native String getWebkitColumnBreakInside();

    @JsProperty( name = "webkitColumnBreakInside")
    public native void setWebkitColumnBreakInside( String value );

    public Object webkitColumnCount;

    @JsProperty( name = "webkitColumnCount")
    public native Object getWebkitColumnCount();

    @JsProperty( name = "webkitColumnCount")
    public native void setWebkitColumnCount( Object value );

    public Object webkitColumnGap;

    @JsProperty( name = "webkitColumnGap")
    public native Object getWebkitColumnGap();

    @JsProperty( name = "webkitColumnGap")
    public native void setWebkitColumnGap( Object value );

    public String webkitColumnRule;

    @JsProperty( name = "webkitColumnRule")
    public native String getWebkitColumnRule();

    @JsProperty( name = "webkitColumnRule")
    public native void setWebkitColumnRule( String value );

    public Object webkitColumnRuleColor;

    @JsProperty( name = "webkitColumnRuleColor")
    public native Object getWebkitColumnRuleColor();

    @JsProperty( name = "webkitColumnRuleColor")
    public native void setWebkitColumnRuleColor( Object value );

    public String webkitColumnRuleStyle;

    @JsProperty( name = "webkitColumnRuleStyle")
    public native String getWebkitColumnRuleStyle();

    @JsProperty( name = "webkitColumnRuleStyle")
    public native void setWebkitColumnRuleStyle( String value );

    public Object webkitColumnRuleWidth;

    @JsProperty( name = "webkitColumnRuleWidth")
    public native Object getWebkitColumnRuleWidth();

    @JsProperty( name = "webkitColumnRuleWidth")
    public native void setWebkitColumnRuleWidth( Object value );

    public String webkitColumnSpan;

    @JsProperty( name = "webkitColumnSpan")
    public native String getWebkitColumnSpan();

    @JsProperty( name = "webkitColumnSpan")
    public native void setWebkitColumnSpan( String value );

    public Object webkitColumnWidth;

    @JsProperty( name = "webkitColumnWidth")
    public native Object getWebkitColumnWidth();

    @JsProperty( name = "webkitColumnWidth")
    public native void setWebkitColumnWidth( Object value );

    public String webkitColumns;

    @JsProperty( name = "webkitColumns")
    public native String getWebkitColumns();

    @JsProperty( name = "webkitColumns")
    public native void setWebkitColumns( String value );

    public String webkitFilter;

    @JsProperty( name = "webkitFilter")
    public native String getWebkitFilter();

    @JsProperty( name = "webkitFilter")
    public native void setWebkitFilter( String value );

    public String webkitFlex;

    @JsProperty( name = "webkitFlex")
    public native String getWebkitFlex();

    @JsProperty( name = "webkitFlex")
    public native void setWebkitFlex( String value );

    public String webkitFlexBasis;

    @JsProperty( name = "webkitFlexBasis")
    public native String getWebkitFlexBasis();

    @JsProperty( name = "webkitFlexBasis")
    public native void setWebkitFlexBasis( String value );

    public String webkitFlexDirection;

    @JsProperty( name = "webkitFlexDirection")
    public native String getWebkitFlexDirection();

    @JsProperty( name = "webkitFlexDirection")
    public native void setWebkitFlexDirection( String value );

    public String webkitFlexFlow;

    @JsProperty( name = "webkitFlexFlow")
    public native String getWebkitFlexFlow();

    @JsProperty( name = "webkitFlexFlow")
    public native void setWebkitFlexFlow( String value );

    public String webkitFlexGrow;

    @JsProperty( name = "webkitFlexGrow")
    public native String getWebkitFlexGrow();

    @JsProperty( name = "webkitFlexGrow")
    public native void setWebkitFlexGrow( String value );

    public String webkitFlexShrink;

    @JsProperty( name = "webkitFlexShrink")
    public native String getWebkitFlexShrink();

    @JsProperty( name = "webkitFlexShrink")
    public native void setWebkitFlexShrink( String value );

    public String webkitFlexWrap;

    @JsProperty( name = "webkitFlexWrap")
    public native String getWebkitFlexWrap();

    @JsProperty( name = "webkitFlexWrap")
    public native void setWebkitFlexWrap( String value );

    public String webkitJustifyContent;

    @JsProperty( name = "webkitJustifyContent")
    public native String getWebkitJustifyContent();

    @JsProperty( name = "webkitJustifyContent")
    public native void setWebkitJustifyContent( String value );

    public String webkitOrder;

    @JsProperty( name = "webkitOrder")
    public native String getWebkitOrder();

    @JsProperty( name = "webkitOrder")
    public native void setWebkitOrder( String value );

    public String webkitPerspective;

    @JsProperty( name = "webkitPerspective")
    public native String getWebkitPerspective();

    @JsProperty( name = "webkitPerspective")
    public native void setWebkitPerspective( String value );

    public String webkitPerspectiveOrigin;

    @JsProperty( name = "webkitPerspectiveOrigin")
    public native String getWebkitPerspectiveOrigin();

    @JsProperty( name = "webkitPerspectiveOrigin")
    public native void setWebkitPerspectiveOrigin( String value );

    public String webkitTapHighlightColor;

    @JsProperty( name = "webkitTapHighlightColor")
    public native String getWebkitTapHighlightColor();

    @JsProperty( name = "webkitTapHighlightColor")
    public native void setWebkitTapHighlightColor( String value );

    public String webkitTextFillColor;

    @JsProperty( name = "webkitTextFillColor")
    public native String getWebkitTextFillColor();

    @JsProperty( name = "webkitTextFillColor")
    public native void setWebkitTextFillColor( String value );

    public Object webkitTextSizeAdjust;

    @JsProperty( name = "webkitTextSizeAdjust")
    public native Object getWebkitTextSizeAdjust();

    @JsProperty( name = "webkitTextSizeAdjust")
    public native void setWebkitTextSizeAdjust( Object value );

    public String webkitTextStroke;

    @JsProperty( name = "webkitTextStroke")
    public native String getWebkitTextStroke();

    @JsProperty( name = "webkitTextStroke")
    public native void setWebkitTextStroke( String value );

    public String webkitTextStrokeColor;

    @JsProperty( name = "webkitTextStrokeColor")
    public native String getWebkitTextStrokeColor();

    @JsProperty( name = "webkitTextStrokeColor")
    public native void setWebkitTextStrokeColor( String value );

    public String webkitTextStrokeWidth;

    @JsProperty( name = "webkitTextStrokeWidth")
    public native String getWebkitTextStrokeWidth();

    @JsProperty( name = "webkitTextStrokeWidth")
    public native void setWebkitTextStrokeWidth( String value );

    public String webkitTransform;

    @JsProperty( name = "webkitTransform")
    public native String getWebkitTransform();

    @JsProperty( name = "webkitTransform")
    public native void setWebkitTransform( String value );

    public String webkitTransformOrigin;

    @JsProperty( name = "webkitTransformOrigin")
    public native String getWebkitTransformOrigin();

    @JsProperty( name = "webkitTransformOrigin")
    public native void setWebkitTransformOrigin( String value );

    public String webkitTransformStyle;

    @JsProperty( name = "webkitTransformStyle")
    public native String getWebkitTransformStyle();

    @JsProperty( name = "webkitTransformStyle")
    public native void setWebkitTransformStyle( String value );

    public String webkitTransition;

    @JsProperty( name = "webkitTransition")
    public native String getWebkitTransition();

    @JsProperty( name = "webkitTransition")
    public native void setWebkitTransition( String value );

    public String webkitTransitionDelay;

    @JsProperty( name = "webkitTransitionDelay")
    public native String getWebkitTransitionDelay();

    @JsProperty( name = "webkitTransitionDelay")
    public native void setWebkitTransitionDelay( String value );

    public String webkitTransitionDuration;

    @JsProperty( name = "webkitTransitionDuration")
    public native String getWebkitTransitionDuration();

    @JsProperty( name = "webkitTransitionDuration")
    public native void setWebkitTransitionDuration( String value );

    public String webkitTransitionProperty;

    @JsProperty( name = "webkitTransitionProperty")
    public native String getWebkitTransitionProperty();

    @JsProperty( name = "webkitTransitionProperty")
    public native void setWebkitTransitionProperty( String value );

    public String webkitTransitionTimingFunction;

    @JsProperty( name = "webkitTransitionTimingFunction")
    public native String getWebkitTransitionTimingFunction();

    @JsProperty( name = "webkitTransitionTimingFunction")
    public native void setWebkitTransitionTimingFunction( String value );

    public String webkitUserModify;

    @JsProperty( name = "webkitUserModify")
    public native String getWebkitUserModify();

    @JsProperty( name = "webkitUserModify")
    public native void setWebkitUserModify( String value );

    public String webkitUserSelect;

    @JsProperty( name = "webkitUserSelect")
    public native String getWebkitUserSelect();

    @JsProperty( name = "webkitUserSelect")
    public native void setWebkitUserSelect( String value );

    public String webkitWritingMode;

    @JsProperty( name = "webkitWritingMode")
    public native String getWebkitWritingMode();

    @JsProperty( name = "webkitWritingMode")
    public native void setWebkitWritingMode( String value );

    public String whiteSpace;

    @JsProperty( name = "whiteSpace")
    public native String getWhiteSpace();

    @JsProperty( name = "whiteSpace")
    public native void setWhiteSpace( String value );

    public String widows;

    @JsProperty( name = "widows")
    public native String getWidows();

    @JsProperty( name = "widows")
    public native void setWidows( String value );

    public String width;

    @JsProperty( name = "width")
    public native String getWidth();

    @JsProperty( name = "width")
    public native void setWidth( String value );

    public String wordBreak;

    @JsProperty( name = "wordBreak")
    public native String getWordBreak();

    @JsProperty( name = "wordBreak")
    public native void setWordBreak( String value );

    public String wordSpacing;

    @JsProperty( name = "wordSpacing")
    public native String getWordSpacing();

    @JsProperty( name = "wordSpacing")
    public native void setWordSpacing( String value );

    public String wordWrap;

    @JsProperty( name = "wordWrap")
    public native String getWordWrap();

    @JsProperty( name = "wordWrap")
    public native void setWordWrap( String value );

    public String writingMode;

    @JsProperty( name = "writingMode")
    public native String getWritingMode();

    @JsProperty( name = "writingMode")
    public native void setWritingMode( String value );

    public String zIndex;

    @JsProperty( name = "zIndex")
    public native String getZIndex();

    @JsProperty( name = "zIndex")
    public native void setZIndex( String value );

    public String zoom;

    @JsProperty( name = "zoom")
    public native String getZoom();

    @JsProperty( name = "zoom")
    public native void setZoom( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getPropertyPriority,1,,P(d1))
      * TE Signature : S(getPropertyPriority,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@308655
     */
    public native String getPropertyPriority(String propertyName);
    /** 
      * Std Signature : S(getPropertyValue,1,,P(d1))
      * TE Signature : S(getPropertyValue,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@308710
     */
    public native String getPropertyValue(String propertyName);
    /** 
      * Std Signature : S(item,1,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@308762
     */
    public native String item(Number index);
    /** 
      * Std Signature : S(removeProperty,1,,P(d1))
      * TE Signature : S(removeProperty,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@308795
     */
    public native String removeProperty(String propertyName);
    /** 
      * Std Signature : S(setProperty,289,,P(d1),P(d1))
      * TE Signature : S(setProperty,P(d1),P(d1))
      * 
     */
    public native void setProperty(String propertyName, String value);
    /** 
      * Std Signature : S(setProperty,289,,P(d1),P(d1),P(d1))
      * TE Signature : S(setProperty,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@308845
     */
    public native void setProperty(String propertyName, String value, String priority /* optional */);
}
