package controlstatements;

public class ifbyte1 {
	public static void main(String[] args)
	{
		boolean dataAvailable = false;
		int byteAvailable = 0 ;
		int n = 0;
		
		if(dataAvailable) {
			processData();
		   byteAvailable-=n;
		   }
		
		else
			waitForMoreData();
		  byteAvailable=n;
		 
	}

	private static void processData() {
		// TODO Auto-generated method stub
		System.out.println("data is processing");
	}
	private static void waitForMoreData() {
		// TODO Auto-generated method stub
		System.out.println("data loading pls wait");
	}


}
