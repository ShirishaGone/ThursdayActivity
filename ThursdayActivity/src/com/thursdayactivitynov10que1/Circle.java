package com.thursdayactivitynov10que1;

public class Circle {
	public void draw(ShapeMain S)
	{
		System.out.println("draw the shape is:"+S.getShape());
	}
	
	public void erase()
	{
		System.out.println("Erase the  shape");
	}
	
public static void main(String[] args){
	ShapeMain s=new ShapeMain("Circle");
	Circle c= new Circle();
	c.draw(s);
	c.erase();
}
}
	