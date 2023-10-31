package oopsPractise;

public class OverloadingPractise3 {
	
	public void m(String str) {
		System.out.println("string version");
	}
	public void m(StringBuffer st) {
		System.out.println("stringBuffer version");
	}


	public static void main(String[] args) {
		OverloadingPractise3 op=new OverloadingPractise3();
						op.m("rabin");
						op.m(new StringBuffer("rabin"));
						//op.m(null);//there is no relation like parent and child
	}

}
