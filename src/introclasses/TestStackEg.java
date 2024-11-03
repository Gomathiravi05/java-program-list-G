package introclasses;

import java.util.Stack;

public class TestStackEg {

	public static void main(String[] args) {
	
		StackEgprogram mystack1=new StackEgprogram();
		StackEgprogram mystack2=new StackEgprogram();
		
		for(int i=0;i<10;i++)
			mystack1.push(i);
		for(int i=10;i<20;i++)
			mystack2.push(i);
		
		System.out.println("Stack in mystack1:");
		
		for(int i=0;i<10;i++)
			System.out.println(mystack1.pop());
		
    System.out.println("Stack in mystack2:");
		
		for(int i=0;i<10;i++)
			System.out.println(mystack2.pop());
		
		
	}

}
