package find_root;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Polynomial
{
     private int deg;

 	 private ArrayList<Double> coeff;

     Polynomial(int d)
     {
    	 deg=d;
    	 coeff=new ArrayList<Double>();
     }
 	 
 	public int getDeg() 
    {
		return deg;
	}
 
     public void set_coefficients(double[] a,int n)
     {
    	 for(int i=0;i<n;i++)
    		  coeff.add(a[i]);
     }
     
     public double evaluate(double x)
     {
    	 double result=0;
    	 for(int i=0;i<coeff.size();i++)
    		 result+=coeff.get(i)*Math.pow(x,coeff.size()-1-i);
    	 return result;
     }
     
     public String display()
     {
    	 StringBuilder out=new StringBuilder();
    	 int i;
    	 for(i=0;i<coeff.size()-1;i++)
    	 {
    		 out.append(Double.toString(coeff.get(i)));
    		 out.append("x"+"^"+Integer.toString(coeff.size()-1-i));
    		 out.append(" + ");
    	 }
    	 out.append(Double.toString(coeff.get(i)));
     	 
    	 return out.toString();
     }
     
}
