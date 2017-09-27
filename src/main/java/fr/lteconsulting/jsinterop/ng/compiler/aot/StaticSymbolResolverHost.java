package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver".StaticSymbolResolverHost
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts:469

  * The host of the SymbolResolverHost disconnects the implementation from TypeScript / other
  * language
  * services and from underlying file systems.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface StaticSymbolResolverHost
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(fileNameToModuleName,1,,P(d1),P(d1))
      * TE Signature : S(fileNameToModuleName,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@1752
      * Converts a file path to a module name that can be used as an `import.
      * I.e. `path/to/importedFile.ts` should be imported by `path/to/containingFile.ts`.
      * 
      * See ImportResolver.
     */
    String fileNameToModuleName(String importedFilePath, String containingFilePath);
    /** 
      * Std Signature : S(getMetadataFor,7<C(----3----)>,,P(d1))
      * TE Signature : S(getMetadataFor,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@1176
      * Return a ModuleMetadata for the given module.
      * Angular CLI will produce this metadata for a module whenever a .d.ts files is
      * produced and the module has exported variables or classes with decorators. Module metadata can
      * also be produced directly from TypeScript sources by using MetadataCollector in tools/metadata.
     */
    Array<AnonymousType717> getMetadataFor(String modulePath);
    /** 
      * Std Signature : S(moduleNameToFileName,1,,P(d1))
      * TE Signature : S(moduleNameToFileName,P(d1))
      * 
     */
    String moduleNameToFileName(String moduleName);
    /** 
      * Std Signature : S(moduleNameToFileName,1,,P(d1),P(d1))
      * TE Signature : S(moduleNameToFileName,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@1450
      * Converts a module name that is used in an `import` to a file path.
      * I.e.
      * `path/to/containingFile.ts` containing `import {...} from 'module-name'`.
     */
    String moduleNameToFileName(String moduleName, String containingFile /* optional */);
}
