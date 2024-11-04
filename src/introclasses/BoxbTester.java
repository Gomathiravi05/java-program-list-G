package introclasses;
/**
 * Tester class for Boxb class 
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 04 November 2024
 */
public class BoxbTester {

	/**
	 * Testing the object creation for Boxb 
	 * Creating two objects for Boxb. firstBox, secondBox
	 * To assign value to the attributes 
	 * Finding the volume for both the box objects (firstBox, secondBox)
	 * Display volume in console 
	 * @param args
	 */
	public static void main(String[] args) {
		Boxb firstbox=new Boxb();
		Boxb secondbox=new Boxb();
		double volumeofbox;
		
		firstbox.width=10;
		firstbox.height=20;
		firstbox.depth=15;
		
		secondbox.width=3;
		secondbox.height=6;
		secondbox.depth=9;
		
		volumeofbox=firstbox.width*firstbox.height*firstbox.depth;

		System.out.println("Volume of the firstbox "+volumeofbox);
		
		volumeofbox=secondbox.width*secondbox.height*secondbox.depth;
		
		System.out.println("Volume of the secondbox "+volumeofbox);
	}

}
