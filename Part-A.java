Main.java
public class Assignment_5_main {
public static void main(String[] args) {
Circle c = new Circle(7);
System.out.println("Area is " + c.caclulateArea());
System.out.println("Area is " + c.caclulatePerimeter());
Triangle t = new Triangle(3, 4, 5, 6);
System.out.println("Triangle Area: " + t.caclulateArea());
System.out.println("Triangle Perimeter: " +
t.caclulatePerimeter());
Rectangle r = new Rectangle(4, 5);
System.out.println("Rectangle Area: " + r.caclulateArea());
System.out.println("Rectangle Perimeter: " +
r.caclulatePerimeter());
}
}

Circle.java
public class Circle implements Shape {
private double radius;
public Circle(double radius)
{
this.radius= radius;
}
@Override
public double caclulateArea()
{
return radius*radius;

}
@Override
public double caclulatePerimeter() {
// TODO Auto-generated method stub
return 2*3.14*radius;
}
}

Triangle.java
public class Triangle implements Shape{
private double l1;
private double l2;
private double h;
private double b;

public Triangle(double l1, double l2, double b, double h ) {
this.l1 = l1;
this.l2 = l2;
this.h = h;
this.b = b;
}
@Override
public double caclulateArea() {
// TODO Auto-generated method stub
return 0.5*h*b;
}
@Override
public double caclulatePerimeter() {
// TODO Auto-generated method stub
return l1+l2+b;
}

}

Shape.java
public interface Shape {
public double caclulateArea();
public double caclulatePerimeter();
}
Rectangle.java
public class Rectangle implements Shape {

private double l;
private double b;
public Rectangle(double l , double b)
{
this.l = l;
this.b = b;
}
@Override
public double caclulateArea() {
// TODO Auto-generated method stub
return l*b;
}
@Override
public double caclulatePerimeter() {
// TODO Auto-generated method stub
return 2*(l+b);
}
}
