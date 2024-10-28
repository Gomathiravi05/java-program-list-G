package controlstatements;

public class breakusegoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean t=true;
		
		first:{
			second:{
				third:{
					System.out.println("before the break");
					if(t)
						break second;
					System.out.println("This wont execute");
				}
				System.out.println("This wont execute");
				
				
			}
			System.out.println("Thisis after second block");
			
		}
	}

}
