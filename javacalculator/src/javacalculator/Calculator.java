package javacalculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a:");
		a=obj.nextInt();
		System.out.println("enter b:");
		b=obj.nextInt();
		System.out.println("SUM="+(a+b));
		System.out.println("SUBTRACTION="+(a-b));
		System.out.println("MULTIPLICATION="+(a*b));
		System.out.println("DIVISION="+(a/b));
		
	
	}

}//calculator program.
