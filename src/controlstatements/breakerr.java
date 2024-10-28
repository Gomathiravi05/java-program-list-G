package controlstatements;

public class breakerr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One:for(int i=0;i<3;i++) {
                System.out.print("pass "+i+":");
			
			for(int j=0;j<100;j++) {
				if(j==10)
					break One;
				System.out.print(j+" ");
			}
		}
	}

}
