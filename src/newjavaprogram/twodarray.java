package newjavaprogram;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int twod[][]=new int[4][5];
		int twod[][] = new int[4][5];
	/*	twod[0] = new int[5];
		twod[1] = new int[5];
		twod[2] = new int[5];
		twod[3] = new int[5];*/
		int i,j,k=0;
		
		for(i=0;i<4;i++) 
		//	for(j=0;j<5;j++) 
			for(j=0;j<i+1;j++) 
				
			{
				twod[i][j]=k;
				k++;
			}
		
		
		for(i=0;i<4;i++) {
			//for(j=0;j<5;j++) 
			for(j=0;j<i+1;j++) 
				
				System.out.print(twod[i][j]+ " ");
				System.out.println();
			
		}
		
	}

}
