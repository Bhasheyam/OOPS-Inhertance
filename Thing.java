package hw1;

public class Thing extends Object 
{
	public String refname=getClass().getSimpleName();
	String name1;
	public Thing(String name)
	{
		this.name1=name;
	}
//Overides to-string for the subclasses.
	public String toString()
    {
	     if(refname.equalsIgnoreCase("Thing"))
	       {
	         return  this.name1; 
	       }
	     else 
	       {
		     return this.name1+"  "+refname;
	       }
     } 

}

