package constructor;

import java.io.IOException;

public class ChildClass extends ParentClass{
	
//if parent class throws exception then child class aslo show have throw exception
	//try catch will not work
	ChildClass() throws IOException {
		super();
		
	}

	public static void main(String[] args) throws IOException {
		ChildClass c=new ChildClass();

	}

}
