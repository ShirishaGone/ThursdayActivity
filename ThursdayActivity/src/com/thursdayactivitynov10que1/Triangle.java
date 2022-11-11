package com.thursdayactivitynov10que1;

public class Triangle {
	public void draw(ShapeMain s)
	{
		System.out.println("The drawn shape is:"+s.getShape());
	}
	
	public void erase()
	{
		System.out.println("Erase the  shape");
	}
	
public static void main(String[] args)
{
	
	ShapeMain s=new ShapeMain("Triangle");
	Triangle t= new Triangle();
	t.draw(s);
	t.erase();
}

   }
    