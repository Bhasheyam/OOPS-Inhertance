package hw1;

public class Fly extends Creatures implements Flyer
{
	
	public Fly(String name) 
	{
		super(name);
		super.toString();	
	}
	//Overides the flyer interface methods
	 @Override
	 public void fly() 
	   {
	    System.out.println(super.name1+" "+"fly is buzzing around in flight.");
		
	   }
	//overriding the abstract method according to the fly class.
	@Override
	  public void move() 
	   {
		  this.fly();
		
	   }
	//Eat method is overridden and defined according to Fly class. other methods of abstract class are inherted not overridden.
	 void eat (Thing tobeeaten)
	   {
		 if(tobeeaten instanceof Creatures )
		   {
			System.out.println(super.name1+" "+getClass().getSimpleName()+" wont eat "+ tobeeaten+".");	
		   }
		  else if (tobeeaten instanceof Thing)
		   {
			System.out.println(super.name1+" "+getClass().getSimpleName()+" has just eaten a "+ tobeeaten+".");
			super.Tummy=tobeeaten.toString();	
		    }
		   
        }
}