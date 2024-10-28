package controlstatements;

public class primeprogram {
 public static void main(String args[]) {
	 int num;
	 boolean prime;
	 
	 num=13;
	 //num=14;
	 
	 if(num<2) 
		 prime=false;
	 else
		 prime=true;
	 
	 for(int i=2;i<num/i;i++) {
		 if((num%i)==0)
		 {
			 prime=false;
			 break;
		 }
	 }
	 if(prime)
		 System.out.println("prime");
	 else
		 System.out.println("Not prime");
 }
}
