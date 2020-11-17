import java.lang.Math;

abstract class Shape
{
    double area, perimeter;
    public Shape()
    {
    }
    abstract void compute_area();
    abstract void compute_perimeter();
}

class Tringle extends Shape
{
double side1, side2, side3;

Tringle(double side1, double side2, double side3)
{
    super();
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
}

public void compute_area()
{
    double s = 0.5*(side1 + side2 + side3);
    area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    System.out.println("Area of Tringle : " + String.valueOf(area));
}

public void compute_perimeter()
    {
        perimeter = side3 + side2 + side1;
System.out.println("Perimeter of Tringle : "+ String.valueOf(perimeter));
    }
}

class Rectangle extends Shape
{
double width, height;

Rectangle(double width, double height)
{
    super();
    this.width = width;
    this.height = height;
}

public void compute_area()
{
    area = width*height;
    System.out.println("Area of Rectangle : " + String.valueOf(area));
}

public void compute_perimeter()
{
    perimeter = 2*(width + height);
    System.out.println("Perimeter of Rectangle : "+ String.valueOf(perimeter));
}
}

public class ShapeAbstract
{
public static void main(String[] args) 
{
    Tringle t = new Tringle(15, 20, 9);
    Rectangle r = new Rectangle(35, 50);
    t.compute_area();
    t.compute_perimeter();

    r.compute_area();
    r.compute_perimeter();
}
}
