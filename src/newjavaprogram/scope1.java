package newjavaprogram;

public class scope1 {
	public static void main(String[] args) {
		int x;
		x=10;
		if(x==10) {
			int y=20;
			System.out.println("Y is  "+y);
			x=y*2;
			//System.out.println("Inside x is  "+x);
			
		}
		//y canot access
		System.out.println(" x is  "+x);
		
	}

}
