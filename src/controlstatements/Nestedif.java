package controlstatements;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i = 10,j = 35,k = 110;

		Object a;
		Object d = null;
		if(i==10) {
			Object b = null;
			if(j<20)
				a=b;
			System.out.println("a and b are equal");
			
			Object c = null;
			if(k>100)
				c=d;
				System.out.println("c and d are equal");
			//else
			//	a=c;
			
		}
		else 
			a=d;
		System.out.println("a and d are equal");
	}

}
