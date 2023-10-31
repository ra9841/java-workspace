package assignment;

public class FoorLoop2 {

	public static void main(String[] args) {
		int i,count,j;
	
		    for(i=1;i<=100;i++) {
			//System.out.println(i);
			count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2) {
				System.out.println("The prime number=" + i);
			}
				
		}

	}

	}
