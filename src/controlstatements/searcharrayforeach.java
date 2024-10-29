package controlstatements;

public class Searcharrayforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {6,8,9,3,7,5,6,1};
		int val=5; //put 15..etc
		boolean found=false;
		
		for(int x:nums) {
			if(x==val) {
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("value found!");
		else
			System.out.println("Value not found");
	}

}
