package introclasses;

/**
 * An example class BoxD with attributes, methods
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 04 November 2024
 */

public class BoxD {
    double width;
    double height;
    double depth;
/**
 * This method to assign value to the attributes 
 */
    BoxD() {
    	System.out.println("Constructing Box");
    	this.width=10;
    	this.height=10;
    	this.depth=10;
    }
    /**
     * Calculate the volume of a box by multipling width,height and depth
     * @return the volume of the box 

     */
    double volume() {
    	 double volumeResult=this.width * this.height * this.depth;
         return volumeResult;
    }

   
}

		
	