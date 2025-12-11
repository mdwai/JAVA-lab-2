//Aim of the program :Write a class file – box with three data members(length, width, height) and a method volume() . Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed.
//Input:  length,width and height.
//Output: Volume
import java.util.*;
class Rectangle2 {
    double length;
    double breadth;
    double area;
    double perimeter;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }
    void calculate()
    {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }
    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
public class DemoRectangle
{
    public static void main(String[] args)
    {
        Rectangle2 r = new Rectangle2();
        r.read();
        r.calculate();
        r.display();
    }
}