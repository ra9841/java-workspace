package compoundInterest;

public class BaseClass {
	 int p=2000;
	 int t=2;
    public void bank1() {
    	double r=1.0;
		double amt=Math.pow((1+r/100),t);
		double amt1=p*amt;
		double ci= amt1-p;
		System.out.println("The compound interst of bank1="+ ci);
		
    	

	}
}
