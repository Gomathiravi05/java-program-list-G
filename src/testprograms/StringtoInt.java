package testprograms;
/**
 * An example class StringtoInt 
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 06 November 2024
 */
public class StringtoInt {
/**
 * converting strings to integers
 * @param args
 */
	public static void main(String[] args) {
		String s1 = "100";
        String s2 = "50";
        
       
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        
        int total = num1 + num2;
        System.out.println("Total value of the nos: "+total);
	}

}
