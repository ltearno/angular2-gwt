package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.client.interop.HTMLDocument;
import fr.lteconsulting.angular2gwt.client.interop.HTMLElement;

public class JsToolsInjector
{
	private static boolean injected = false;

	public static void inject()
	{
		if( injected )
			return;
		injected = true;

		HTMLDocument document = HTMLDocument.get();

		HTMLElement scriptElement = document.createElement( "script" );

		String content = "";
		content += "lteconsulting = {\n";
		content += "    defineProperty : function( object, name, definition ) {\n";
		content += "        let def = {};\n";
		content += "        if( 'get' in definition ) {\n";
		content += "            def.get = function() {\n";
		content += "                return definition.get( this );\n";
		content += "            };\n";
		content += "        }\n";
		content += "\n";
		content += "        if( 'set' in definition ) {\n";
		content += "            def.set = function( value ) {\n";
		content += "                definition.set( this, value );\n";
		content += "            }\n";
		content += "        }\n";
		content += "\n";
		content += "        Object.defineProperty( object, name, def );\n";
		content += "    },\n";

		content += "    propertyInObject: function( property, object ) {\n";
		content += "        return property in object;\n";
		content += "    },\n";

		content += "    getObjectProperty: function( object, property ) {\n";
		content += "        return object[property] || null;\n";
		content += "    },\n";

		content += "    setObjectProperty: function( object, property, value ) {\n";
		content += "        object[property] = value;\n";
		content += "    },\n";
		
		content += "    getArrayItem: function( array, index ) {\n";
		content += "        return array[index] || null;\n";
		content += "    },\n";

		content += "    setArrayItem: function( array, index, value ) {\n";
		content += "        array[index] = value;\n";
		content += "    },\n";

		content += "    getObjectIterator: function( object ) {\n";
		content += "        if( object[Symbol.iterator] )\n";
		content += "            return object[Symbol.iterator]();\n";
		content += "        return null;";
		content += "    },\n";

		content += "    debugPackage: function( package, packageName ) {\n";
		content += "        packageName = packageName || ''\n";
		content += "        for( let childName in package ) {\n";
		content += "            let child = package[childName];\n";
		content += "            if( typeof child === 'object' )\n";
		content += "                lteconsulting.debugPackage( child, packageName + '.' + childName );\n";
		content += "            else if( typeof child === 'function' )\n";
		content += "                console.log( 'jsName:' + child.name + ' javaName:' + packageName + '.' + childName );\n";
		content += "        }\n";
		content += "    },\n";

		content += "    convertObject: (function (prototypes){\n";
		content += "        return function(prototypeName, source){\n";
		content += "            function internal(prototypeName, source){\n";
		content += "                var prototype = prototypes[prototypeName];\n";
		content += "                if( ! prototype ) {\n";
		content += "                	prototype = window;\n";
		content += "                	var parts = prototypeName.split('.');\n";
		content += "                	for(var i in parts)\n";
		content += "                		prototype = prototype[parts[i]];\n";
		content += "                	prototypes[prototypeName] = prototype;\n";
		content += "                }\n";
		content += "                \n";
		content += "                var result = Object.create(prototype.prototype);\n";
		content += "                if(source)\n";
		content += "                {\n";
		content += "                	for (var prop in source)\n";
		content += "                		result[prop] = source[prop];\n";
		content += "                }\n";
		content += "                return result;\n";
		content += "            }\n";
		content += "            return internal(prototypeName, source);\n";
		content += "        }\n";
		content += "    })({})\n";

		content += "};\n";

		scriptElement.innerHTML = content;

		document.body.appendChild( scriptElement );
	}
}
