package methodsandclasses;
/**
 * Tester class for BoxA class 
 * @author Gomathi
 * @category Methods and Classes lesson
 * @version 0.0.1
 * @since 06 November 2024
 */
public class BoxATester {
 /**
 * Testing the object creation for BoxA
 * Creatingvarious boxes using constructors for BoxA. firstBox, secondBox, cubeBox
 * get volumes of all
 * display the volumes in console	 
 * @param args
 */
	public static void main(String[] args) {
		
		BoxA firstBox=new BoxA();
		BoxA secondBox=new BoxA();
		BoxA cubeBox=new BoxA();
		double volumeofthebox;
		
		firstBox.width=10;
		firstBox.height=20;
		firstBox.depth=15;
		
		cubeBox.width=7;
		cubeBox.height=7;
		cubeBox.depth=7;
		
		volumeofthebox= firstBox.volume();

		System.out.println("Volume of the firstbox "+volumeofthebox);
		
		volumeofthebox=secondBox.volume();
		
		System.out.println("Volume of the second box"+volumeofthebox);
	
        volumeofthebox=cubeBox.volume();
		
		System.out.println("Volume of the second box"+volumeofthebox);
	
	}

}
