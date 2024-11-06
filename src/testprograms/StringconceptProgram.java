package testprograms;
/**
 * An example class StringconceptProgram
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 06 November 2024
 */
public class StringconceptProgram {
/**
 * create string variables
 * put it in methods
 * display String values 
 * @param args
 */
	public static void main(String[] args) {
		String s2="Tom and Jerry are good friends";
		int count=1;
		String rev="";
		char[] array=s2.toCharArray();
		
		for(int i=array.length-1;i>=0;i--) {
			  rev=rev+array[i];
			}
		System.out.println("Reverse String: "+rev);
		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0)
			{
				count++;
			}
			}
		 System.out.println("count the characters: "+count);
		
		 System.out.println("Uppercase: " + s2.toUpperCase());
		 
		   

	}

}
