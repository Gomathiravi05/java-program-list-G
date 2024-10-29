package controlstatements;

public class Returnstate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean t=true; 
		System.out.println("Before the return.");
		if(t)
			return;
		System.out.println("This wont execute");//false it executes
	}

}
