package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import fr.lteconsulting.angular2gwt.client.interop.ng.core.SafeHtml;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.SafeResourceUrl;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.SafeScript;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.SafeStyle;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.SafeUrl;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.SecurityContext;
import jsinterop.annotations.JsType;

/**
 * DomSanitizationService helps preventing Cross Site Scripting Security bugs (XSS) by sanitizing
 * values to be safe to use in the different DOM contexts.
 *
 * For example, when binding a URL in an `<a [href]="someValue">` hyperlink, `someValue` will be
 * sanitized so that an attacker cannot inject e.g. a `javascript:` URL that would execute code on
 * the website.
 *
 * In specific situations, it might be necessary to disable sanitization, for example if the
 * application genuinely needs to produce a `javascript:` style link with a dynamic value in it.
 * Users can bypass security by constructing a value with one of the `bypassSecurityTrust...`
 * methods, and then binding to that value from the template.
 *
 * These situations should be very rare, and extraordinary care must be taken to avoid creating a
 * Cross Site Scripting (XSS) security bug!
 *
 * When using `bypassSecurityTrust...`, make sure to call the method as early as possible and as
 * close as possible to the source of the value, to make it easy to verify no security bug is
 * created by its use.
 *
 * It is not required (and not recommended) to bypass security if the value is safe, e.g. a URL that
 * does not start with a suspicious protocol, or an HTML snippet that does not contain dangerous
 * code. The sanitizer leaves safe values intact.
 *
 * @security Calling any of the `bypassSecurityTrust...` APIs disables Angular's built-in
 *           sanitization for the value passed in. Carefully check and audit all values and code paths going
 *           into this call. Make sure any user data is appropriately escaped for this security context.
 *           For more detail, see the [Security Guide](http://g.co/ng/security).
 *
 * @stable
 */
@JsType( isNative = true, namespace = "ng.platformBrowser" )
public class DomSanitizationService
{
	/**
	 * <p>Sanitizes a value for use in the given SecurityContext.
	 * 
	 * <p>Use constants defined in the {@link SecurityContext} class.
	 *
	 * <p>If value is trusted for the context, this method will unwrap the contained safe value and use
	 * it directly. Otherwise, value will be sanitized to be safe in the given context, for example
	 * by replacing URLs that have an unsafe protocol part (such as `javascript:`). The implementation
	 * is responsible to make sure that the value can definitely be safely used in the given context.
	 */
	public native String sanitize( int context, Object value );

	/**
	 * Bypass security and trust the given value to be safe HTML. Only use this when the bound HTML
	 * is unsafe (e.g. contains `<script>` tags) and the code should be executed. The sanitizer will
	 * leave safe HTML intact, so in most situations this method should not be used.
	 *
	 * **WARNING:** calling this method with untrusted user data exposes your application to XSS
	 * security risks!
	 */
	public native SafeHtml bypassSecurityTrustHtml( String value );

	/**
	 * Bypass security and trust the given value to be safe style value (CSS).
	 *
	 * **WARNING:** calling this method with untrusted user data exposes your application to XSS
	 * security risks!
	 */
	public native SafeStyle bypassSecurityTrustStyle( String value );

	/**
	 * Bypass security and trust the given value to be safe JavaScript.
	 *
	 * **WARNING:** calling this method with untrusted user data exposes your application to XSS
	 * security risks!
	 */
	public native SafeScript bypassSecurityTrustScript( String value );

	/**
	 * Bypass security and trust the given value to be a safe style URL, i.e. a value that can be used
	 * in hyperlinks or `<img src>`.
	 *
	 * **WARNING:** calling this method with untrusted user data exposes your application to XSS
	 * security risks!
	 */
	public native SafeUrl bypassSecurityTrustUrl( String value );

	/**
	 * Bypass security and trust the given value to be a safe resource URL, i.e. a location that may
	 * be used to load executable code from, like `<script src>`, or `<iframe src>`.
	 *
	 * **WARNING:** calling this method with untrusted user data exposes your application to XSS
	 * security risks!
	 */
	public native SafeResourceUrl bypassSecurityTrustResourceUrl( String value );
}
