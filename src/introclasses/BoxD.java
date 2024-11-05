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
 * This is the parameterless constructor of BoxD
 * The attributes of the object is assigned value 10 as initial dimension
 */
    BoxD() {
    	System.out.println("Constructing Box");
    	final double INITIAL_VALUE=10;
    	this.width=INITIAL_VALUE;
    	this.height=INITIAL_VALUE;
    	this.depth=INITIAL_VALUE;
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

		
	