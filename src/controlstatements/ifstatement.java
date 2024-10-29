package controlstatements;

public class Ifstatement {

	public static void main(String[] args)
	{
		boolean dataAvailable = true;
		//boolean dataAvailable = false;
		
		if(dataAvailable) 
			processData();
		else
			waitForMoreData();
	
		
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
