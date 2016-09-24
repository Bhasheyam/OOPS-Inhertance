package hw1;

public class TestCreatures extends Object
{
//defining the limit of thing and creatrure.
	public static final int THING_COUNT=10;
	public static final int Creatures_COUNT=6;
	public static void main(String s[])
	{
	
		//Creation of Thing and Creature Instance
				Thing Thingarray[]=new Thing[THING_COUNT];
				Creatures Creaturearray[]=new Creatures[Creatures_COUNT];
				
				
				Thingarray[0]=new Thing("book");
			    Thingarray[1]=new Thing("grass");
			    Thingarray[2]=new Thing("brush");
			    Thingarray[3]=new Thing("wood");
			    Thingarray[4]=new Thing("rock");
			    Thingarray[5]=new Thing("jackfruit");
			    Thingarray[6]=new Thing("plant");
			    Thingarray[7]=new Thing("herb");	
			    Thingarray[8]=new Thing("meat");
			    Thingarray[9]=new Thing("wheat");
			    Creaturearray[0]=(Tiger)new Tiger("moew");
			    Creaturearray[1]=(Bat)new Bat("piggy");	   
			    Creaturearray[2]=(Bat)new Bat("charizad");
			    Creaturearray[3]=(Fly)new Fly("zubat");
			    Creaturearray[4]=(Fly)new Fly("dragonite");	
			    Creaturearray[5]=(Ant)new Ant("weedle");
			
			    //Scanning the array and implementing the class hierarchy
		        //Object[] alltogether=ArrayUtils.add(Thingarray,Creaturearray);

			    System.out.println("Things:");
		System.out.println("");
		for(Thing arrele:Thingarray)
			    {
		    	  System.out.println(arrele);   
		         }
		System.out.println("");
		System.out.println("Creatures");
		System.out.println("");
		for(int i=0;i<=5;i++)
		{
			
			if(i==2 || i==4)
			{
				System.out.println(Creaturearray[i]); 
				Creaturearray[i].eat(Creaturearray[1]);
				Creaturearray[i].WhatdidyouEat();
				Creaturearray[i].move();
				System.out.println("");
			}
			
			else if(i==5)
			{
				System.out.println(Creaturearray[i]); 
				Creaturearray[i].WhatdidyouEat();
				Creaturearray[i].move();
			}
			else
			{
			System.out.println(Creaturearray[i]); 
			Creaturearray[i].eat(Thingarray[1]);
			Creaturearray[i].WhatdidyouEat();
			Creaturearray[i].move();
			System.out.println("");
			 }
				
			
    }
		
	
	
	
	
		
		
		
  }
}
