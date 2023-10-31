package compoundInterest;

public class ChildClassB extends BaseClass{
	public void bank3() {
		double r=0.08;
		double amt=Math.pow((1+r/100),t);
		double amt1=p*amt;
		double ci= amt1-p;
				System.out.println("The compound interest of bank3 =" +ci);
		
	}
	

}
