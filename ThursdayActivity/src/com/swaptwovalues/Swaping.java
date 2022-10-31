package com.swaptwovalues;
import java.util.Scanner;
public class Swaping {
	public static void main(String args[])  
	{  
	int x, y;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the first number:");  
	x = sc.nextInt();  
	System.out.print("Enter the second number:");  
	y = sc.nextInt();  
	System.out.println("Before Swapping\nx = "+x+"\ny = "+y);  
	swap(x, y);  
	}  
	public static void swap(int a, int b)  
	{  
      
	a = a + b;  
	b = a - b;  
	a = a - b;  
	System.out.println("After Swapping\nx = "+a+"\ny = "+b);  
	}  
	
}