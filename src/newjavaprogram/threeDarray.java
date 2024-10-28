package newjavaprogram;

public class threeDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int threeD[][][]=new int[3][4][5];
		int i,j,k;
		for(i=0;i<3;i++) 
			for(j=0;j<4;j++) 
				for(k=0;k<5;k++) 
					threeD[i][j][k]=i*j*k;
				
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				for(k=0;k<5;k++) 
					System.out.print(threeD[i][j][k]+" ");
					System.out.println();
				}
				System.out.println();
			
		}

	}
			

}
