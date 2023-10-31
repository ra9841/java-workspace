package stringBuilderDemo;

public class StringBuildExamp {

	public static void main(String[] args) {
		StringBuilder name=new StringBuilder("Bijeta");
		System.out.println(name.append("Shrestha"));
		System.out.println(name.length());
		for(int i=0;i<name.length();i++) {
			System.out.println("i="+name.charAt(i));
		}
		System.out.println(name.substring(0,4));
		System.out.println(name.delete(0,2));
		System.out.println(name.reverse());
		

	}

}
