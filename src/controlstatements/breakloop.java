package controlstatements;

public class Breakloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i=0;i<100;i++) {
			if(i==10)
				break;
			System.out.println("i: "+i);
		}
		System.out.println("loop complete");*/
		
		int i=0;
		while(i<100)
		{
		if(i==10)
			break;
			System.out.println("i: "+i);
			i++;
		}
		System.out.println("loop complete");
		
	}

}
