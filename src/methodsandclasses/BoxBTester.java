package methodsandclasses;
/**
 * Tester class for BoxB class 
 * @author Gomathi
 * @category Methods and Classes lesson
 * @version 0.0.1
 * @since 06 November 2024
 */
public class BoxBTester {
	/**
	 * Testing the object creation for BoxA
	 * Creatingvarious boxes using constructors for BoxB. BoxA. firstBox, secondBox, cubeBox
	 * get volumes of all
	 * display the volumes in console	 
	 * @param args
	 */
	public static void main(String[] args) {
		BoxB firstBox=new BoxB();
		BoxB secondBox=new BoxB();
		BoxB cubeBox=new BoxB();
		BoxB cloneBox=new BoxB();
		double volumeofthebox;
		
		firstBox.width=10;
		firstBox.height=20;
		firstBox.depth=15;
		
		cubeBox.width=7;
		cubeBox.height=7;
		cubeBox.depth=7;
		
		cloneBox.width=firstBox.width;
		cloneBox.height=firstBox.height;
		cloneBox.depth=firstBox.depth;
		
		volumeofthebox= firstBox.volume();

		System.out.println("Volume of the firstbox "+volumeofthebox);
		
		volumeofthebox=secondBox.volume();
		
		System.out.println("Volume of the second box"+volumeofthebox);
	
        volumeofthebox=cubeBox.volume();
		
		System.out.println("Volume of the cube box"+volumeofthebox);
		
		 volumeofthebox=cloneBox.volume();
		 System.out.println("Volume of the clone box "+volumeofthebox);
			
			
		
	

	}

}
