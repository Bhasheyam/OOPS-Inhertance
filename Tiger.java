package hw1;

public class Tiger extends Creatures
{
	public Tiger(String name) 
	{
		super(name);
		super.toString();
	    
	}
//Abstract method move alone overridden and other methods are inherited and not implemented.
	@Override
	public void move() 
	{
		
		System.out.println(super.name1+" "+getClass().getSimpleName()+" has just pounced.");
		
		
	}
	
	
	

}
