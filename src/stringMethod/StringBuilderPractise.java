package stringMethod;

public class StringBuilderPractise {

	public static void main(String[] args) {//two thing take out.one is buffer and sycronized from StringBuffer.,then it is StringBuilder
		StringBuilder sb=new StringBuilder("rabin");//mutable.Every method in StringBuffer is same to StringBuilder
		sb=new StringBuilder("shrestha");
		sb=new StringBuilder("yes ");
		sb.append(false);
		sb.append(" No");
		System.out.println(sb);

	}

}
