package com.rightangletriangle;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		int a,b,n;
		System.out.print("Input number of rows : ");
		  Scanner s = new Scanner(System.in);
				    n = s.nextInt();
		
		   for(a=1;a<=n;a++)
		   {
			for(b=1;b<=a;b++)
			{
			  System.out.print(b);
			}

		    System.out.println("");
		    }

	}

}
