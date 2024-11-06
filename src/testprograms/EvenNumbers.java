package testprograms;
/**
 * An example class EvenNumbers
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 06 November 2024
 */
public class EvenNumbers {
/**
 * Find the even numbers
 * create variables intialize the value
 * using loop conditions
 * display the even number
 * @param args
 */
	public static void main(String[] args) {
		long number=81546903;
		while(number>0) {
			int digit= (int)(number % 10);
			if(digit%2==0) {
				System.out.println(digit+" ");
			}
			number=number/10;
		}

	}

}
