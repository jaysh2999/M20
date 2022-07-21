package com.tns.java;

import java.util.Scanner;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		
		System.out.println("Choose numerator and denominator (Enter position 0 to 7)");
		
		int[] a = {10,20,30,40,1,0,3,2};
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b= s.nextInt();
		System.out.println("Enter the value of c");
		int c= s.nextInt();
		
		
		try {
						
			int result= a[b]/a[c];
			System.out.println("Result of " +result);
								
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		System.out.println("Arithmetic Exception is occurs (Warning : You can not devide a number 0)");
		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
		    e.printStackTrace();
			System.out.println("Array Index Out of Bound Excepton is occurs");
			
		}
		
		catch(IndexOutOfBoundsException e)
		
		{
			System.out.println("Index out of Bound  Exception is occurs (Warning : You have to chosen Position which is not in the array)");
								
		}
		
		catch (Exception e)
		{
			System.out.println("Any other  Exception is occur");
		}
		
		System.out.println("Rest of the code");
		
	}

}