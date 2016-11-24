package fr.lteconsulting.roaster;

/**
 * Main point : generate java source text
 * 
 * some structural methods :
 * 
 * - block() generates an indented block where one can write code
 * - indent() generates an indented source chunk
 * - l( String format, Object... parameters ) writes a line
 * 
 * The l(...)'s format parameter is for example :
 * 
 * l( "public [{class name}]( String [{paramName}] )", "MyClass", "name" );
 * the string between [{}] does not matter, it is just for you to remember semantic
 */
public class Tests
{
	public static void main( String[] args )
	{
		BlockImpl b = new BlockImpl();

		Block comment = b.javadoc();
		comment.line( "This file is for...." );
		comment.line( "This file is for...." );
		comment.line( "This file is for...." );
		comment.line( "This file is for...." );

		b.line( "public class Arint implements Toto" ).block().line( "// no problem" ).line( "int a = [{initial value}];", "salut" );

		b.line();

		Block myClass = b.clazz( "OneClass", "ASimpleObject", new String[] { "SuperInterface", "MegaInterface" } );
		myClass.javadoc().line( "This is a special class" ).line( "which can do magical things..." );
		myClass.line( "int a = 2;" ).line( "int b = a;" ).line( "nop;" );

		b.line();

		b.line( "public class OneClass extends ASimpleObject implements SuperInterface, MegaInterface" );
		b.block( ( m ) -> {
			m.javadoc().line( "This is a special class" ).line( "which can do magical things..." );
			m.line( "int a = 2;" ).line( "int b = a;" ).line( "nop;" );
		} );

		JavaClassText c = new JavaClassText( "fr.lteconsulting" );
		c.rootBlock().clazz( "Toto" ).line( "public void doWhat( int a )" ).block( ( u ) -> {
			u.line( "coucou = [{#}];", 4 );
		} );

		StringBuilder sb = new StringBuilder();
		c.render( sb );

		b.render( sb );
		System.out.println( sb );
	}
}
