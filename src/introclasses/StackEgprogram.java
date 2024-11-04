package introclasses;
/**
 * An example class StackEgprogram that performs a basic stack with push and pop operations.
 * @author Gomathi
 * @category Introduction to Classes lesson
 * @version 0.0.1
 * @since 05 November 2024
 */
public class StackEgprogram {

	int stck[]=new int[10];
	int tos;
	/**
	 *  Initializes the top-of-stack (tos) 
	 */
	 StackEgprogram () {
		tos=-1;
	 }
	/**
	 * Pushes an item onto the stack.
	 * If the stack is full, displays a message.
     * Else it increments the tos and adds the item to the stack.
	 * @param item to be pushed onto the stack
     
	 */
	 void push(int item) {
		if(tos==9) 
			System.out.println("Stack is full.");
			else
				stck[++tos]=item;
	 }
	/**
	 * Pops an item from the stack.
     * If tos is less than 0, displays an underflow message and returns 0.
     * else, it returns the top element and decrements the tos.
	 * @return popped from tos or displays 0 stack is empty 
	 */
	 int pop() {
		if(tos<0) {
			System.out.println("Stack underflow.");
			
			return 0;
		}
		else
			return stck[tos--];
	
	}

}
