package find_root;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
    	//problem 1.
    	 int deg=3;
    	 double[] coeff={1,-3,6,-5};
         Polynomial e1=new Polynomial(deg);
    	 e1.set_coefficients(coeff,deg+1);
    	 Problem es1=new Problem1(e1);
    	 if(es1.solve())
    	 {    System.out.println("problem 1 solved! ");
    	      System.out.println("A root of the equation "+e1.display()+" is "+es1.getRoot());
    	      es1.status();
    	 }
    	 else
    		  System.out.println("couldnt find a root");
    	 
    	 //problem 2
    	 //x-cosx, tolerance 0.001
    	 Problem es2=new Problem2("x-cosx");
    	 if(es2.solve())
    	 {
    		 System.out.println("problem 2 solved! ");
    	     System.out.println("A root of the equation x-cosx is "+es2.getRoot());
   	         es2.status();
    	 }
    	 else
    		 System.out.println("couldnt find a root");
    }
}
