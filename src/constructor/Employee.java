package constructor;

public class Employee {
	long salary;
	String name;
	public Employee() {               //no parameter
		salary=10000;
		name="Rabin";	
	}
	public Employee(long a,String b) {   //with parameter
		salary=a;
		name=b;
	}
	public static void main(String[]args) {
		Employee employ=new Employee(10000,"Rabin");
		System.out.println("salary=" + employ.salary);
		System.out.println("name =" + employ.name);
		
	}
	
		
	}


