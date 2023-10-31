package comparableComparatorSort2;

public class Employee implements Comparable<Employee> {
          String name;
          String department;
          String city;
		public Employee() {
			super();
		}
		public Employee(String name, String department, String city) {
			super();
			this.name = name;
			this.department = department;
			this.city = city;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", department=" + department + ", city=" + city + "]";
		}
		@Override
		public int compareTo(Employee o) {
			int x=(this.name).compareTo(o.name); //sorting on ascending order
			//int x=(o.name).compareTo(this.name);   //sorting on descending order
			
			return x;
		}
		
          
}
