package testprograms;

import java.util.Scanner;

/**
 * An example class ThreedigitNumber
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 06 November 2024
 */

public class ThreedigitNumber {
/**
 * get three digit value
 * create cube for each digit
 * add cube numbers
 * display equal or not
 * @param args
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        
        int firstdigit=number%10;
        int seconddigit=(number/10)%10;
        int thirddigit=number/100;
        
        int firstdigitcube=firstdigit*firstdigit*firstdigit;
        int seconddigitcube=seconddigit*seconddigit*seconddigit;
        int thirddigitcube=thirddigit*thirddigit*thirddigit;
        
        System.out.println("firstdigitcube"+firstdigitcube);
        System.out.println("seconddigitcube"+seconddigitcube);
        System.out.println("thirddigitcube"+thirddigitcube);
        
        int total=firstdigitcube+seconddigitcube+thirddigitcube;
        System.out.println("Total value: "+total);
        
        if(total==number) {
        	System.out.println("Equal");
        }
        else {
        	System.out.println("Not equal");
        }
        

	}

}
