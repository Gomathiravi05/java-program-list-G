package introclasses;
/**
 * An example class Boxa with attributes, methods, and setter method to assign value to the attributes 
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 04 November 2024
 */
public class Boxa {
	// Attributes of the class. Global variables 
     private double width;
     private double height;
     private double depth;
/**
 * Calculate the volume of a box by multipling width,height and depth
 * @return the volume of the box 
 */
    double volume() {
        double volumeResult=this.width * this.height * this.depth;
        return volumeResult;
        
    }
/**
 * Set the value for width, height, and depth. Setting the diamention of the box
 * @param pwidth Width of the box (Value must be possitive)
 * @param pheight Height of the box (Value must be possitive)
 * @param pdepth Depth of the box (Value must be possitive)
 * @throws IllegalArgumentException if the value is negative or zero
 */
    void setDimension(double pwidth, double pheight, double pdepth) {
    	
    	// Validating the dimensions
    	validateDimension("width", pwidth);
    	validateDimension("height", pheight);
    	validateDimension("depth", pdepth);
    	// Setting the dimension 
        this.width =pwidth;
        this.height =pheight;
        this.depth =pdepth;
    }
    /**
     * Validates that a dimension is positive.
     * @param dimensionName The name of the dimension being validated
     * @param value The value to validate
     * @throws IllegalArgumentException if the value is negative or zero
     */
    private void validateDimension(String dimensionName, double value) {
        if (value <= 0) {
            throw new IllegalArgumentException(
                dimensionName + " must be positive. Received: " + value);
        }
    }
}



