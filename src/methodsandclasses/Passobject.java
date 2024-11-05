package methodsandclasses;
/**
 * An example class Passobject with attributes, methods, and assign value to the attributes 
 * @author Gomathi
 * @category Methods and Classes lesson
 * @version 0.0.1
 * @since 06 November 2024
 */
public class Passobject {

	int a,b;
	
	Passobject(int i, int j){
		a=i;
		b=j;
	}
	/**
	 * return true if o is equal to the invoking object
	 * @param o
	 * @return
	 */
	boolean equalTo(Passobject o) {
		if(o.a==a&& o.b==b)
			return true;
	else
		return false;
		
	}
}
