package hw1;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Classtester{ 

	   public static void main(String[] args) {
		   int n;
	     Result rs = JUnitCore.runClasses(classhierarcytest.class);
	      for (Failure fa : rs.getFailures()) {
	         System.out.println(fa.toString());
	      }     
	      n=rs.getRunCount();
	      System.out.println(n+"test are completed");
	    System.out.println(rs.wasSuccessful()); 
	   }
	}  	


