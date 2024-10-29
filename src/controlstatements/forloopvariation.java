package controlstatements;

public class Forloopvariation {
	public static void main(String args[]) {
		
		boolean done=false;
		/*for(int i=1;!done;i++) {
			if(interrupted())
				done=true;
		}
	}

	private static boolean interrupted() {
		// TODO Auto-generated method stub
		return false;
	}
*/
		int i;
		i=0;
		for(;!done;) {
			System.out.println("i is "+i);
			if(i==10)done=true;
			i++;
		}
		
	}
}
