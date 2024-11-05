package methodsandclasses;
/**
 * Tester class for Passobject class 
 * @author Gomathi
 * @category Methods and Classes lesson
 * @version 0.0.1
 * @since 06 November 2024
 */
public class PassobjectTester {
/**
 * Testing the object creation for Passobject
 * Creating two objects for Passobject. firstBox, secondBox, thirdBox
 * put values 
 * display the values in console	 
 * @param args
 */
	public static void main(String[] args) {
		Passobject firstBox= new Passobject(100, 22);
		Passobject secondBox = new Passobject(100, 22);
		Passobject thirdBox = new Passobject(-1, -1);
		
		System.out.println("firstbox == secondbox: "+ firstBox.equalTo(secondBox));
		System.out.println("firstbox == thirddbox: "+ firstBox.equalTo(thirdBox));
		
		
	}

}
