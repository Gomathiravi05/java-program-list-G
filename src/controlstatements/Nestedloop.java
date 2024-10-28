package controlstatements;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		
		for(i=0;i<10;i++) {
			for(j=i;j<10;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
