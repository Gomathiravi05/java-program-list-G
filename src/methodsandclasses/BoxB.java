package methodsandclasses;
/**
 * An example class BoxB with attributes, methods, and assign value to the attributes 
 * @author Gomathi
 * @category Methods and Classes lesson
 * @version 0.0.1
 * @since 06 November 2024
 */
public class BoxB {
	double width;
    double height;
    double depth;
    

   /**
* Set the value for width, height, and depth. Setting the diamention of the box
* @param pwidth Width of the box (Value must be possitive)
* @param pheight Height of the box (Value must be possitive)
* @param pdepth Depth of the box (Value must be possitive)

    */
   BoxB(double pwidth, double pheight, double pdepth) {
   	
   	// Setting the dimension 
       this.width =pwidth;
       this.height =pheight;
       this.depth =pdepth;
}
   /**
    * constructer used to nodimension specified
    */
   BoxB(){
   	this.width=-1;
   	this.height=-1;
   	this.depth=-1;
   	
   }
   /**
    * constructor used when cube is created
    * @param len lenth of the box
    */
   BoxB(double len){
   	width=height=depth=len;
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
