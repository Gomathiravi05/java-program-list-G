package testprograms;
/**
 * An example class StringconceptProgram
 * @author Gomathi
 * @category Test programs
 * @version 0.0.1
 * @since 06 November 2024
 */
public class ArrayConcepts {
/**
 * Test the class ArrayConcepts
 * Get array values
 * find total count numbers present in array
 * sorting in assending order
 * display the result
 * @param args
 */
	public static void main(String[] args) {
		int[] data={45,23,76,98,2,5,20,53,12,83,8,42};
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]!=0)
			{
				count++;
			}
			}
		System.out.println("Numbers present in array: "+count);
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				if(data[i]<data[j]) {
					int temp;
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
					
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+",");
		}
	}

}
