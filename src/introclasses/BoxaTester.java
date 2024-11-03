package introclasses;
/**
 * Tester class for Boxa class 
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 04 November 2024
 */
public class BoxaTester {
	/**
	 * Testing the object creation for Boxa 
	 * Creating two objects for Boxa. firstBox, secondBox
	 * Setting the dimensions for the boxes
	 * Handling IllegalArgumentException thrown by setDim method by displaying the message and terminating the code
	 * Finding the volume for both the box objects (firstBox, secondBox)
	 * Display volume in console 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Boxa firstBox=new Boxa();
		Boxa secondBox=new Boxa();
		double volumeofBox;
		// Named constants for firstBox object
		final double FIRSTBOX_WIDTH=10;
		final double FIRSTBOX_HEIGHT=20;
		final double FIRSTBOX_DEPTH=30;
		
		try {
			firstBox.setDimension(FIRSTBOX_WIDTH, FIRSTBOX_HEIGHT, FIRSTBOX_DEPTH);
		} catch (IllegalArgumentException e) {
			String errormessage =e.getMessage();
			System.out.println(errormessage);
			return;
		}
		// Named constants for secondBox object
		final double SECONDBOX_WIDTH=-3;
		final double SECONDBOX_HEIGHT=6;
		final double SECONDBOX_DEPTH=9;
		
		try {
			secondBox.setDimension( SECONDBOX_WIDTH, SECONDBOX_HEIGHT, SECONDBOX_DEPTH);
		} catch (IllegalArgumentException e) {
			
			String errormessage =e.getMessage();
			System.out.println(errormessage);
			return;
		}
		
		volumeofBox=firstBox.volume();

		System.out.println("Volume of first box "+volumeofBox);
		
		volumeofBox=secondBox.volume();
		
		System.out.println("Volume of second box "+volumeofBox);
	}

}
