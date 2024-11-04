package introclasses;


/**
 * Tester class for StackEgprogram class 
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 05 November 2024
 */
public class StackEgprogramTester {
	/**
	 * Testing the object creation for StackEgprogram
	 * Creating two objects for StackEgprogram. firstStack, secondStack
	 * Pushing all values onto( firstStack, secondStack)
	 * Displaying and popping all elements 
	 * @param args
	 */

	public static void main(String[] args) {
	
		StackEgprogram firstStack=new StackEgprogram();
		StackEgprogram secondStack=new StackEgprogram();
		
		for(int i=0;i<10;i++)
			firstStack.push(i);
		for(int i=10;i<20;i++)
			secondStack.push(i);
		
		System.out.println("Stack in firstStack: ");
		
		for(int i=0;i<10;i++)
			System.out.println(firstStack.pop());
		
         System.out.println("Stack in secondStack: ");
		
		for(int i=0;i<10;i++)
			System.out.println(secondStack.pop());
		
		
	}

}
