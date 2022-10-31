package com.classcircle;

class Circle
{
public double center, radius;
static int count=0;
{
        count += 1;
    }
Circle(double center,double radius)
{
this.center=center;
this.radius=radius;
}
    Circle(double r)
    {
        this.radius = r;
    }
    Circle()
    {
        center=1; radius=2;
    }
}
class AreaOfCircle
{
   public static void main(String args[])
    {  
        Circle c1 = new Circle(10,15);
        Circle c2 = new Circle();
        Circle c3 = new Circle(13);
        System.out.println(c1.radius);
        System.out.println(c2.center);
        System.out.println(c3.radius);
        System.out.print(Circle.count);  
         
   }
 }