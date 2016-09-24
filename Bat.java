package hw1;

public class Bat extends Creatures implements Flyer {
//constructor and inherts the super class tostring method.
	public Bat(String name) {
		super(name);
		super.toString();
	}
	//Eat method is overridden and defined according to Bat class. other methods of abstract class are inherted not overridden.
	void eat (Thing tobeeaten)
	{
		if(tobeeaten instanceof Creatures)
		{
			System.out.println(super.name1+" "+getClass().getSimpleName()+ " has just eaten a "+ tobeeaten+".");
			
			super.Tummy=tobeeaten.toString();
		}
		else  if(tobeeaten instanceof Thing)
		{
			System.out.println(super.name1+" "+getClass().getSimpleName()+" wont eat "+ tobeeaten+".");
		}
		
		
			
	}
	//Overides the flyer interface methods
		public void fly()
		{
			System.out.println(super.name1+" "+ "Bat"+"s swooping through the dark.");
		}
		//overriding the abstract method according to the bat class.
		@Override
		public void move() {
			this.fly();		
			
		}
	

}
