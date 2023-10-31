package oopsPractise;

public class ChildOverriddingClass extends OverridingPractise {


		public  void marriage() {
			System.out.println("bijeta");
		}
		public static void main(String[] args) {
			ChildOverriddingClass c=new ChildOverriddingClass();
			c.property();
			c.marriage();//child
			
			OverridingPractise op=new OverridingPractise();
			op.marriage();//parent
			
			OverridingPractise op1=new ChildOverriddingClass();
			op1.marriage();//child

		}

	}

//overriding is the process in which,if the method in parent class which child wants to override,by redefifning it in child class
