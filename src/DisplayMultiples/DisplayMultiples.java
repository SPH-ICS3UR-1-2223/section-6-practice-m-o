package DisplayMultiples;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
		System.out.println("Give me the number to multiply:");
		int Numfirst=in.nextInt();
    	for (int Numsec=1; Numsec<=12; Numsec++) {
    		System.out.println(Numfirst * Numsec);
    		
    	}
    	
    	
    	
    }

}
