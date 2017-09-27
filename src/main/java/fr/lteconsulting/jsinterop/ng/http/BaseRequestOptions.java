package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options".BaseRequestOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options.d.ts:3139
  * 1 constructors
  * Subclass of {@link RequestOptions}, with default values.
  * 
  * Default values:
  *   * method: {@link RequestMethod RequestMethod.Get}
  *   * headers: empty {@link Headers} object
  * 
  * This class could be extended and bound to the {@link RequestOptions} class
  * when configuring an {@link Injector}, in order to override the default options
  * used by {@link Http} to create and send {@link Request Requests}.
  * 
  * ```typescript
  * import {BaseRequestOptions, RequestOptions} from '@angular/http';
  * 
  * class MyOptions extends BaseRequestOptions {
  *    search: string = 'coreTeam=true';
  * }
  * 
  * {provide: RequestOptions, useClass: MyOptions};
  * ```
  * 
  * The options could also be extended when manually creating a {@link Request}
  * object.
  * 
  * ```
  * import {BaseRequestOptions, Request, RequestMethod} from '@angular/http';
  * 
  * const options = new BaseRequestOptions();
  * const req = new Request(options.merge({
  *    method: RequestMethod.Post,
  *    url: 'https://google.com'
  * }));
  * console.log('req.method:', RequestMethod[req.method]); // Post
  * console.log('options.url:', options.url); // null
  * console.log('req.url:', req.url); // https://google.com
  * ```
 */
@JsType(isNative=true, namespace="ng.http", name="BaseRequestOptions")
public class BaseRequestOptions extends RequestOptions
{

    /*
        Constructors
    */
    public BaseRequestOptions(){
        super(null);
    }
}
