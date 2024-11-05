package methodsandclasses;
/**
 * An example class OverloadDemo1 with attributes, Demonstrate method overloading 
 * @author Gomathi
 * @category Methods and classes lesson
 * @version 0.0.1
 * @since 05 November 2024

 */
public class OverloadDemo2 {
	void test() {
		  System.out.println("No parameter");
	  }
	 
	  void test(int a,int b) {
		  System.out.println("a and b: "+a+"& "+b);
	  }
	  double test(double a) {
		  System.out.println("double a: "+a);
		  return a*a;
}
	  }
