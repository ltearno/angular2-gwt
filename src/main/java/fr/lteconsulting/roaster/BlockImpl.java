package fr.lteconsulting.roaster;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// TODO add separator => white space if preceded or followed by another thing, nothing otherwise
public class BlockImpl implements Block, Thing
{
	List<Thing> things = new ArrayList<>();

	String indent;

	final int indentSize = 4;

	public BlockImpl()
	{
		indent = "";
	}

	private BlockImpl( String indent )
	{
		this.indent = indent;
	}

	@Override
	public void render( StringBuilder sb )
	{
		try
		{
			for( Thing thing : things )
				thing.render( sb );
		}
		catch( Exception e )
		{
			System.out.println( "EXCEPTION : " + e );
		}
	}

	@Override
	public Block block()
	{
		BlockImpl newBlock = createIndentedSubBlock();

		things.add( ( sb ) -> {
			sb.append( indent );
			sb.append( "{\n" );
			newBlock.render( sb );
			sb.append( indent );
			sb.append( "}\n" );
		} );

		return newBlock;
	}

	public Block block( Consumer<Block> blockReceiver )
	{
		Block block = block();
		blockReceiver.accept( block );
		return this;
	}

	@Override
	public BlockImpl indent()
	{
		BlockImpl newBlock = createIndentedSubBlock();

		things.add( ( sb ) -> {
			newBlock.render( sb );
		} );

		return newBlock;
	}

	@Override
	public Block indent( Consumer<Block> blockReceiver )
	{
		Block block = indent();
		blockReceiver.accept( block );

		return this;
	}

	@Override
	public BlockImpl javadoc()
	{
		BlockImpl newBlock = new BlockImpl( indent + " * " );

		things.add( ( sb ) -> {
			sb.append( indent );
			sb.append( "/**\n" );
			newBlock.render( sb );
			sb.append( indent );
			sb.append( " */\n" );
		} );

		return newBlock;
	}

	@Override
	public BlockImpl comment()
	{
		BlockImpl newBlock = new BlockImpl( indent + " * " );

		things.add( ( sb ) -> {
			sb.append( indent );
			sb.append( "/*\n" );
			newBlock.render( sb );
			sb.append( indent );
			sb.append( " */\n" );
		} );

		return newBlock;
	}

	@Override
	public Block separator()
	{
		// TODO to be implemented
		return line();
	}

	@Override
	public Block line()
	{
		things.add( ( sb ) -> {
			sb.append( "\n" );
		} );

		return this;
	}

	@Override
	public Block clazz( String name )
	{
		return clazz( name, null, null );
	}

	@Override
	public Block clazz( String name, String extend )
	{
		return clazz( name, extend, null );
	}

	@Override
	public Block clazz( String name, String[] implement )
	{
		return clazz( name, null, implement );
	}

	@Override
	public Block clazz( String name, String extend, String[] implement )
	{
		StringBuilder sb = new StringBuilder();

		sb.append( format( "public class [{class name}]", name ) );
		if( extend != null )
			sb.append( " extends " + extend );
		if( implement != null )
		{
			sb.append( " implements" );
			boolean add = false;
			for( String impl : implement )
			{
				if( add )
					sb.append( "," );
				else
					add = true;
				sb.append( " " + impl );
			}
		}

		line( sb.toString() );

		return block();
	}

	@Override
	public BlockImpl line( String format, Object... arguments )
	{
		String text = format( format, arguments );

		things.add( ( sb ) -> {
			sb.append( indent );
			sb.append( text );
			sb.append( "\n" );
		} );

		return this;
	}

	@Override
	public Block addAny( Thing youWant )
	{
		things.add( youWant );

		return this;
	}

	// TODO format as \"value\" when placeholder looks like [{#dhkdjhd}]
	private String format( String format, Object... arguments )
	{
		int paramIndex = 0;
		int start;
		while( (start = format.indexOf( "[{" )) >= 0 )
		{
			boolean stringOutput = false;
			int supposedIndex = start + 2;
			if( format.length() > supposedIndex && format.charAt( supposedIndex ) == '#' )
				stringOutput = true;

			if( paramIndex >= arguments.length )
			{
				format = "[ERROR, not enough parameters given in '" + format + "']";
				break;
			}
			int end = format.indexOf( "}]" );
			if( end < start + 2 )
			{
				format = "[ERROR, argument " + paramIndex + ", unmatched opening characters '[{']";
				break;
			}

			if( stringOutput )
				format = format.substring( 0, start ) + "\"" + arguments[paramIndex] + "\"" + format.substring( end + 2 );
			else
				format = format.substring( 0, start ) + arguments[paramIndex] + format.substring( end + 2 );

			paramIndex++;
		}

		return format;
	}

	private BlockImpl createIndentedSubBlock()
	{
		String childIndent = indent;
		int i = indentSize;
		while( i-- > 0 )
			childIndent += " ";

		return new BlockImpl( childIndent );
	}
}