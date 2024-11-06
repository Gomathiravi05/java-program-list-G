package testprograms;

import java.util.Scanner;

/**
 * An example class TemparatureProgram
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 07 November 2024
 */
public class TemparatureProgram {
/**
 * Test the TemparatureProgram class
 * create looping statement
 * find the temparature
 * Display the result
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("Is it raining? ");
		Scanner sc=new Scanner(System.in);
		String answer=sc.next();
		if(answer.equals("yes")) {
			System.out.println("To get an umberla");
		}
		else {
			System.out.println("Enter the temperature: ");
			int temperature=sc.nextInt();
			if(temperature<32) {
				System.out.println("To get Heavy Jacket");
				
			}
			else if(temperature>32 && temperature<50) {
				System.out.println("To get light Jacket");
			}
			else {
				System.out.println("Don't get Jacket");
			}
		}
	}

}
