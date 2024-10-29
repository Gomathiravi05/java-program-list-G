package controlstatements;

public class Breakloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:for(int i=0;i<3;i++) {
			System.out.print("pass "+i+":");
			
			for(int j=0;j<100;j++) {
				if(j==10)
					break outer;
				System.out.print(j+" ");
			}
			System.out.println("not printed");
		}

		System.out.println("Loops complete");
	}

}
