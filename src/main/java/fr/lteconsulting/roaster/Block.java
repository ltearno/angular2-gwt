package fr.lteconsulting.roaster;

import java.util.function.Consumer;

/*
 * TODO : add a method to separate blocks
 */
public interface Block
{
	Block block();

	Block block( Consumer<Block> blockReceiver );

	Block comment();

	Block javadoc();

	Block indent();

	Block indent( Consumer<Block> blockReceiver );

	Block clazz( String name );

	Block clazz( String name, String[] implement );

	Block clazz( String name, String extend );

	Block clazz( String name, String extend, String[] implement );

	Block separator();

	Block line();

	Block line( String format, Object... arguments );

	Block addAny( Thing youWant );
}