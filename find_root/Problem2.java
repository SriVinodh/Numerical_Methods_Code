package find_root;

public class Problem2 extends Problem
{
	 private String equation;
	 
	 Problem2(String s)
	 {
		  equation=s;
	 }

	 @Override
	 public double evaluate(double x)
	 {
		 return x-Math.cos(x);
	 }
	 
	 public String getequation()
	 {
		 return equation;
	 }
}

