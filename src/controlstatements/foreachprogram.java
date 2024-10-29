package controlstatements;

public class Foreachprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,2,3,4,5,6,7,8,9,10};
int sum=0;

for(int X:nums) {
	System.out.println("Val is: "+X);
	sum+=X;
	//if we want 5 elements 
//if(X==5)break;
}
System.out.println("summation:"+sum);
	}

}
