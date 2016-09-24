package hw1;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class classhierarcytest 
{
	// Creating instance for creatures and thing to test the functionalities.
	Creatures[] Creaturearray=new Creatures[6];
	Thing T;
	PrintStream sys;
	private final ByteArrayOutputStream c1=new ByteArrayOutputStream();
	@Before
	public void instancecreation()
	{
		T=new Thing("book");
		Creaturearray[0]=(Tiger)new Tiger("moew");
	    Creaturearray[1]=(Ant)new Ant("weedle");	   
	    Creaturearray[2]=(Bat)new Bat("charizad");
	    Creaturearray[3]=(Bat)new Bat("piggy");	
	    Creaturearray[4]=(Fly)new Fly("zubat");
	    Creaturearray[5]=(Fly)new Fly("dragonite");	
	    sys=System.out;
	    System.setOut(new PrintStream(c1));
	   
	    
	}
	
	@After
	public void flushfor()
	{
		System.setOut(sys);

	}
	// test for all the methods and functionality in the class hierarchy
	@Test
	public void checkthing()
	{
		String Check="book";
		String checkthing;
		checkthing=T.toString();
		assertTrue(Check.toString().equals(checkthing.toString()));
		
	}
	@Test
	public void checking1() 
	{ 
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[0].move();
		checkinghelp=c1.toString().trim();
		Checkinghelp1="moew Tiger has just pounced.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
		}
	
	@Test
	public void checking2()
	{
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[0].eat(T);
		checkinghelp=c1.toString().trim();
		Checkinghelp1="moew Tiger has just eaten a book.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
	}
	@Test
	public void checking3()
	{
		
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[0].WhatdidyouEat();
		checkinghelp=c1.toString().trim();
		Checkinghelp1="moew Tiger has had nothing to eat.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
	}
	@Test
	public void checking4() 
	{ 
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[1].move();
		checkinghelp=c1.toString().trim();
		Checkinghelp1="weedle Ant is crawling Around.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
		}
	
	@Test
	public void checking5()
	{
		String checkinghelp;
		String Checkinghelp1;
		String subcheck;
		Creaturearray[1].eat(T);
		Creaturearray[1].WhatdidyouEat();
		checkinghelp=c1.toString().trim();
		subcheck=checkinghelp.substring(35, 64);
		Checkinghelp1="weedle Ant has eaten a  book.";
		assertEquals(subcheck.toString(),Checkinghelp1.toString());
	}
	@Test
	public void checking6() 
	{ 
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[2].move();
		checkinghelp=c1.toString().trim();
		Checkinghelp1="charizad Bats swooping through the dark.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
		}
	
	@Test
	public void checking7()
	{
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[2].eat(T);
		checkinghelp=c1.toString().trim();
		Checkinghelp1="charizad Bat wont eat book.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
	}
	@Test
	public void checking8()
	{
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[3].eat(Creaturearray[1]);
		checkinghelp=c1.toString().trim();
		Checkinghelp1="piggy Bat has just eaten a weedle  Ant.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
	}	
	@Test
	public void checking9()
	{
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[4].eat(Creaturearray[1]);
		checkinghelp=c1.toString().trim();
		Checkinghelp1="zubat Fly wont eat weedle  Ant.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
	}
	@Test
	public void checking10() 
	{ 
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[5].move();
		checkinghelp=c1.toString().trim();
		Checkinghelp1="dragonite fly is buzzing around in flight.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
		}
	
	@Test
	public void checking11()
	{
		String checkinghelp;
		String Checkinghelp1;
		Creaturearray[5].eat(T);
		checkinghelp=c1.toString().trim();
		Checkinghelp1="dragonite Fly has just eaten a book.";
		assertEquals(checkinghelp.toString(),Checkinghelp1.toString());
	}
	
	
	
}

	
	
	
