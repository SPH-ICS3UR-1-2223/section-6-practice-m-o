package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
    	int i;
        for (i = 1; i <= width; i++) {
            System.out.print("#");
        }
        System.out.println();
        int repeats;
        
       
        for(repeats=1; repeats<height; repeats++) {
        	System.out.println("#"+width-2+"#");
        	
        }
        int u;
        for (u = 1; u <= width; u++) {
            System.out.print("#");
        }
        
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        
    }
}
