package hw1;

public class Ant extends Creatures
{
//Constructor creating name and inherts the tostrings method.
	public Ant(String name) 
	{
		super(name);
		super.toString();
	}
	
			
	//Move abstract method is been overridden.other methods of the abstract class are inherted and not overidden.
	@Override
	public void move() 
	{
		System.out.println(super.name1+ " "+"Ant is crawling Around.");
		
	}
	

}
