package introclasses;

/**
 * An example class Boxc with attributes, methods 
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 04 November 2024
 */

public class BoxC {
	double width;
	double height;
	double depth;
	
	/**
	 * Calculate the volume of a box by multipling width,height and depth
	 * @return the volume of the box 
	 */
	double volume() {

        double volumeResult=this.width * this.height * this.depth;
        return volumeResult;
	
}
	
    }


