package testprograms;

import java.util.Scanner;
/**
 * An example class StringCharacter
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 06 November 2024
 */
public class StringCharacter {
/**
 * Test the StringCharacter class
 * create scanner method to get String
 * check all are alphabets 
 * check count characer morethan 8
 * Display the result
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name=sc.next();
		char[] array=name.toCharArray();
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0)
			{
				count++;
			}
			}
		
		if(name.matches("[a-zA-Z]+")) {
			System.out.println("All characters are in alphabets");
		}else {
			System.out.println("all characters not in alphabets");	
		}
		
		if(count>8) {
			System.out.println("Character not lessthan 8");
		}
		else {
			System.out.println("Character lessthan 8");
		}
	}

}
