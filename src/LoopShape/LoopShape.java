package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
    
        for (int i = 1; i <= width; i++) {
            System.out.print("#");
        }
        System.out.println();
        int repeats;
        
       
        for(repeats=1; repeats< height-1; repeats++) {
        	System.out.print("#");
        	for(int i =0; i < width - 2; i++) {
        		System.out.print(" ");
        	}
        	if (width > 1) {
        		System.out.println("#");
        	}else {
        		System.out.println();
        	}
        }
      if (height > 1) {
        for(int k = 0; k < width; k++) {
        	System.out.print("#");
        }
    	  
        }
        System.out.println();
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        //draw height
    	System.out.println("#");
    	for(int l = 0; l < leg-2; l++) {
    		System.out.print("#");
    		for(int j = 0; j < l; j++) {
    			System.out.print(" ");
    		}
    		System.out.println("#");
    		
    	}
    	//draw bottom
    	for(int k = 0; k < leg; k++) {
    		System.out.print("#");
    	}
    }
}
