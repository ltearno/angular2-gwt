package fr.lteconsulting.angular2gwt.server;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.lteconsulting.angular2gwt.client.Hero;

@RestController
@EnableAutoConfiguration
public class HeroesController
{
	private final AtomicInteger counter = new AtomicInteger();

	private List<Hero> heroes = new ArrayList<>( Arrays.asList(
	// @formatter:off
			new Hero( counter.incrementAndGet(), "Injector", "Do nothing", null ), 
			new Hero( counter.incrementAndGet(), "Windstorm", "Do nothing", null ), 
			new Hero( counter.incrementAndGet(), "Bombasto", "Do nothing", null ), 
			new Hero( counter.incrementAndGet(), "Magneta", "Do nothing", null ),
			new Hero( counter.incrementAndGet(), "Tornado", "Do nothing", null ) ) );
	// @formatter:on

	@RequestMapping( "/heroes" )
	List<Hero> heroes()
	{
		return heroes;
	}

	@RequestMapping( "/addHero" )
	Hero addHero()
	{
		Hero hero = new Hero( counter.incrementAndGet(), "<no name>", "", "" );

		heroes.add( hero );

		return hero;
	}

	@RequestMapping( "/deleteHero" )
	void deleteHero( @RequestParam int id )
	{
		heroes.stream().filter( h -> h.getId() == id ).findFirst().ifPresent( heroes::remove );
	}

	public static void main( String[] args ) throws Exception
	{
		SpringApplication.run( HeroesController.class, args );
	}
}