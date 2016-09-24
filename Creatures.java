package hw1;

public abstract class Creatures extends Thing 
{
  //Global variable for the creature stomach reference.
	public String Tummy="null";  

	
	public Creatures(String name) 
	{
		super(name);
		super.toString();
		
	}	
	
	//Eat method for the subclass.method returns what the creature have eaten.
	void eat(Thing d)
	{	
		System.out.println(super.name1+" "+getClass().getSimpleName()+ " has just eaten a "+ d+".");	
		Tummy=d.toString();	
	}
	
	//Says what the animal have eaten last.
	void WhatdidyouEat()
	{
		if(Tummy.equalsIgnoreCase("null"))
		{
			System.out.println(super.name1+ " "+ getClass().getSimpleName()+ " has had nothing to eat.");					
		}
	    else 
	    {
		 System.out.println(super.name1+" "+getClass().getSimpleName()+ " has eaten a  "+Tummy+".");
		 Tummy=null;	
	    }
	 }
	
	//Abstract method for the subclass to inhert.
    public abstract void move();


}

