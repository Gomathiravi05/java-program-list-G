package introclasses;

/**
 * An example class BoxD with attributes, methods
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 04 November 2024
 */
public class BoxDTester {
	/**
	 * Testing the object creation for BoxD 
	 * Creating two objects for BoxD. firstBox, secondBox
	 * Finding the volume for both the box objects (firstBox, secondBox)
	 * Display volume in console 
	 * @param args
	 */
	public static void main(String[] args) {
		
		BoxD firstBox=new BoxD();
		BoxD secondBox=new BoxD();
		double volumeofthebox;
		
		
		volumeofthebox= firstBox.volume();

		System.out.println("Volume of the firstbox "+volumeofthebox);
		
		volumeofthebox=secondBox.volume();
		
		System.out.println("Volume of the second box"+volumeofthebox);
	

	}

}
