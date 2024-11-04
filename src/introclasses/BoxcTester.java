package introclasses;
/**
 * Tester class for BoxC class 
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 04 November 2024
 */
public class BoxcTester {

	/**
	 * Testing the object creation for BoxC 
	 * Creating two objects for BoxC. firstBox, secondBox
	 * to assign value to the attributes.
	 * Finding the volume for both the box objects (firstBox, secondBox)
	 * Display volume in console 
	 * @param args
	 */
	public static void main(String[] args) {
		
		BoxC firstbox=new BoxC();
		BoxC secondbox=new BoxC();
		double volumeofthebox;
		
		firstbox.width=10;
		firstbox.height=20;
		firstbox.depth=15;
		
		secondbox.width=3;
		secondbox.height=6;
		secondbox.depth=9;
		
		volumeofthebox=firstbox.volume();

		System.out.println("Volume of the firstbox "+volumeofthebox);
		
		volumeofthebox=secondbox.volume();
		
		System.out.println("Volume of the secondbox "+volumeofthebox);
	}

}
