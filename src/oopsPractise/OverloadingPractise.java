package oopsPractise;

public class OverloadingPractise {
	public void m(int n) {
		System.out.println("int version");
	}
	public void m(float f) {
		System.out.println("float version");
	}

	public static void main(String[] args) {
		OverloadingPractise op=new OverloadingPractise();
		op.m(10);
		op.m(10.8f);
		op.m('a');//automatic promotion on overloading
		op.m(50l);//long
		

	}

}
