package find_root;

import java.util.Random;

public abstract class Problem
{
	 protected double root=0;
	 protected double start=0;
	 protected double end=0;
	 protected double step_run=0;
	 protected double step_formula=0;
	 
	 public abstract double evaluate(double x);
	 
     public boolean solve()
     {
    	 //check if 0 is a root
    	 if(evaluate(0)==0)
    	 { root=0; return true;}
    	 
    	  Random rand=new Random();
    	  //upper limit 100000, lower limit -100000
    	  
    	  int count=0;
    	  boolean error=false;
    	  double a,b;
    	  while(true)
    	  {
    		  b=rand.nextInt(100);         //upper limit
    		  a=rand.nextInt(100)-100;  //lower limit
    		  if(evaluate(a)*evaluate(b)<=0)
    			  break;
    		  count++;
    		  if(count>10000)
    		  {
    			  error=true;
    			  break;
    		  }
    	  }
    	  start=a;
    	  end=b;
    	  
    	  if(error)                       //couldnt find a and b.so end random trials.
    	      return false;
    	  
    	  
    	  if(evaluate(a)==0)
    	  {  root=a; return true;}
    	  if(evaluate(b)==0)
    	  {  root=b; return true;}
    	  //obtained a and b.now execute algorithm.
    	  double cur_mid,prev_mid=1;
    	  cur_mid=(a+b)/2;
    	  if(evaluate(cur_mid)<=0.001)
    	  { root=cur_mid; return true;}
    	  
      	  //now calculate steps by formula
    	  step_formula=(Math.log10(b-a)-Math.log10(0.001))/Math.log10(2);
  
    	  step_run=0;                    //started execution.
    	  
    	  while(true)
    	  {
		    	  if(evaluate(cur_mid)==0)          //if its a root
		    	  { root=cur_mid; return true;}
		    	  
		          if((evaluate(cur_mid)<=0.001)&&(Math.abs((cur_mid-prev_mid)/cur_mid)<=0.001))
		          { root=cur_mid;return true;}
    	  
		    	  prev_mid=cur_mid;
		    	  if(evaluate(cur_mid)*evaluate(a)<0)
		    		    b=cur_mid;
		    	  else if(evaluate(cur_mid)*evaluate(b)<0)
		    		    a=cur_mid;
		    	  cur_mid=(a+b)/2;
		    	  step_run++;
		  }
    	  
     }
    
    public void status()
    {
	    	  System.out.println("intervel from " +getStart()+" to "+getEnd());
		      System.out.println("number of steps during runtime: "+getSteps());
		      System.out.println("number of steps by formula: "+getStepsFormula()+'\n');
	}
     
    public double getSteps()
    {
    	return step_run;
    }
    
    public double getStepsFormula()
    {
    	return step_formula;
    }
	
	public double getRoot() {
		return root;
	}
	public double getStart() {
		return start;
	}
	public double getEnd() {
		return end;
	}
}

