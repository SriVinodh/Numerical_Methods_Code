package find_root;

public class Problem1 extends Problem
{
	 private Polynomial eq;
	
	 Problem1(Polynomial a)
	 {
		 eq=a;
	 }
		
	 @Override
  	 public double evaluate(double x)
	 {
			return eq.evaluate(x);
	 }

	 	public Polynomial getEq() {
		return eq;
	}

}
