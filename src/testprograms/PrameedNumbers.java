package testprograms;
/**
 * An example class PrameedNumbers
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 07 November 2024
 */
public class PrameedNumbers {
	/**
	 * Testing the PrameedNumbers class 
	 * create pyrameed pattern with numbers
	 * create forloop intialise the values for rows,spaces,column
	 * Display the pyrameed pattern
	 * @param args
	 */

	public static void main(String[] args) {
        int rows = 9; 
        for (int i = 1; i <= rows; i++) {
           for (int space = 1; space <= rows - i; space++) {
                System.out.print(".");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            
            System.out.println();
        }
	}

}
