package com.rectangle;

class Rectangle1 
{
	
		int length=8;
		int breadth=9; 
		
	void print_area()    
	{
		System.out.println("area of rectangle is :"+length*breadth); 
	}   
	void print_perimeter()  
	{  
		System.out.println("perimeter of rectangle is :"+2*(length+breadth));		
	}
}
	class Square extends Rectangle1 
	{    
		int side=4;
		int side1=2;
		int side2=2;
		Square()
		{
		super();
		}
		void dislay()
		{
			System.out.println("Area of the Square is :"+side1*side2);
			System.out.println("Perimeter of the Square is :"+4*side);
	    }
	}
	    public class Rectangle
	    {   
	    	public static void main(String[] args) 
	    	{ 
	    		Rectangle1 r = new Rectangle1 (); 
	    		r.print_area();
	    		r.print_perimeter();
	    		Square s = new Square(); 
                s.dislay(); 
	    	}
	    }




