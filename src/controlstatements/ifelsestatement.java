package controlstatements;

public class ifelsestatement {
 public static void main(String args[])
 {
	 int month=4;
	 String season;
	 
	 if(month==12||month==1||month==2)
		 season="Winter";
	 else if(month==3||month==4||month==5)
		 season="Spring";
	 else if(month==6||month==7||month==8)
		 season="Autumn";
	 else
		 season="Bogus Month";
		 System.out.println("April is in the "+ season +".");
	 }
	 
	 
 
 
}