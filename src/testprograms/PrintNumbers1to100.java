package testprograms;
/**
 * An example class PrintNumbers1to100 
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 06 November 2024
 */
public class PrintNumbers1to100 {
	/**
	 * create integers one to hundred
	 * Using array and conditional loops
	 * display the values
	 * @param args
	 */

	public static void main(String[] args) {
		int array[]=new int[100];
		for(int i=1;i<array.length;i++) {
			if(i%3==0 &&i%5==0) {
				System.out.println("Grapes");
			}
			else if(i%5==0){
				System.out.println("Orange");
			}
			else if(i%3==0){
				System.out.println("Apple");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
