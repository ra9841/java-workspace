package assignment;

public class BreakContinueloop {

	public static void main(String[] args) {
    for(int i=1;i<=15;i++) {
    	if(i==9) {                      //Two loops:in one loop break at 9 position and in second continue at 9
    		break;
    	}
    	System.out.println(i);
    }
    System.out.println("....");
    
    	
    	for(int i=1;i<=20;i++) {
    		if(i==9) {
    			continue;
    		}
    		System.out.println(i);
    		  	
    }

	}

}
