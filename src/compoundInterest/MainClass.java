package compoundInterest;

public class MainClass {

	public static void main(String[] args) {
		BaseClass bc;
		          bc= new BaseClass();                 //up casting
		          bc.bank1();
		          
		          bc=new ChildClassA();                //up casting
		          ChildClassA ca=(ChildClassA)bc;      //down casting
		          ca.bank2();
		          
		          bc=new ChildClassB();                //up casting
		          ChildClassB cb=(ChildClassB)bc;      //down casting
		          cb.bank3();
		          
		          bc=new ChildClassC();               //up casting
		          ChildClassC cc=(ChildClassC)bc;     //down casting
		          cc.bank4();
		         }

}
