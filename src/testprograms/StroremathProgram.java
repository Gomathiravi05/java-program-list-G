package testprograms;

import java.util.Scanner;

/**
 * Test the TemparatureProgram class
 * create looping statement
 * find the temparature
 * Display the result
 * @param args
 */
public class StroremathProgram {
/**
 * Test the class of StroremathProgram
 * Intialize values
 * Display total Amount
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int orange=3;
		double lemon=1.5;
		System.out.println("Enter oranges count");
		int numberoforanges=sc.nextInt();
		System.out.println("Enter lemons count");
		int numberoflemon=sc.nextInt();
		int total=(int)((orange*numberoforanges)+(lemon*numberoflemon));
		System.out.println("total Rs: "+total);
		
		
		
	}

}
