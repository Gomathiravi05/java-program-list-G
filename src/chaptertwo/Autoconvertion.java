package chaptertwo;

public class Autoconvertion {
	public static void main(String args[]) {
		/*byte a = 40;
		byte b = 50;
		byte c = 100;
		int d = a * b / c;
		System.out.println(d);*/
	/*	byte b = 50;
		b = b * 2; // Error! Cannot assign an int to a byte!
	*/
		byte b=42;
		char c='a';
		short s=1024;
		int i=50000;
		float f=2.46f;
		double d=.453;
		double result = (f * b) + (i / c) - (d * s);
		
		System.out.println(result);
		
	}

}
