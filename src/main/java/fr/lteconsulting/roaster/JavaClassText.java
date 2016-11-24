package fr.lteconsulting.roaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaClassText
{
	private BlockImpl rootBlock;
	private Set<String> imports;

	public JavaClassText( String pack )
	{
		imports = new HashSet<>();

		rootBlock = new BlockImpl();

		rootBlock.line( "package [{package name}];", pack );
		rootBlock.line( "" );

		rootBlock.addAny( this::renderImports );
	}

	public Block rootBlock()
	{
		return rootBlock;
	}

	public void render( StringBuilder sb )
	{
		rootBlock.render( sb );
	}

	private void renderImports( StringBuilder sb )
	{
		List<String> list = new ArrayList<>( imports );
		Collections.sort( list );
		for( String imp : imports )
			sb.append( "import " + imp + ";\n" );
		if( !list.isEmpty() )
			sb.append( "\n" );
	}

	public void addImport( String imp )
	{
		imports.add( imp );
	}
}