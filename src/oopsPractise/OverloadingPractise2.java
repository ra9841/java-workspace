package oopsPractise;

public class OverloadingPractise2 {
	public void m(Object o) {
		System.out.println("object version");
	}
	public void m(String str) {
		System.out.println("string version");
	}

	public static void main(String[] args) {
		OverloadingPractise2 op=new OverloadingPractise2();
		op.m(new Object());
		op.m("rabin");
		op.m(null);//it will take child.As object is parent and String is child(child get priority)

	}

}
