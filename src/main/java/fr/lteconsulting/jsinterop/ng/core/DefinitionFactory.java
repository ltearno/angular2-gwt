package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsFunction;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".DefinitionFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:679

  * Factory for ViewDefinitions/NgModuleDefinitions.
  * We use a function so we can reexeute it in case an error happens and use the given logger
  * function to log the error from the definition of the node, which is shown in all browser
  * logs.
 */
@JsFunction
public interface DefinitionFactory<D extends Definition<?>>{
    D call(NodeLogger logger);
}
