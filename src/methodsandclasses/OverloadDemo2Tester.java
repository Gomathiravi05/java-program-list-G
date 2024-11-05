package methodsandclasses;
/**
 *Tester class for OverloadDemo1 class
 * @author Gomathi
 * @category Methods and classes lesson
 * @version 0.0.1
 * @since 05 November 2024
 */
public class OverloadDemo2Tester {

	/**
	 * Testing the object creation for OverloadDemo1
	 * call all versions of testmethod
	 * pass the values.initialize the values.
	 * Disply the result 
	 * @param args
	 */
	public static void main(String[] args) {
		OverloadDemo1 ob=new OverloadDemo1();
		double result;
		int i=88;
		
		ob.test();
		ob.test(10,20);
		ob.test(i);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.25): "+result);
	
	}

}
