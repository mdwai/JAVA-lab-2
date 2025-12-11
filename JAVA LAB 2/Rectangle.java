//Aim of the program : Write a program in java
//using constructor overloading concept to calculate the area of a rectangle
//having data member as length and breadth. Use default constructor to initialize the value
//of the data member to zero and parameterized constructor to initialize the value of
//data member according to the user input. Input: Mention the value of
//length and breadth
import java.util.Scanner;
class Rectangle
{
    int length, breadth;
    // Default constructor → initializes length & breadth to 0
    Rectangle()
    {
        length = 0;
        breadth = 0;
    }
    // Parameterized constructor → initializes values from user input
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    // Method to calculate area
    int area() {
        return length * breadth;
    }
}
public class RectangleArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Area using default constructor: " + r1.area());
        // Taking user input
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.print("Enter breadth: ");
        int br = sc.nextInt();
        // Using parameterized constructor
        Rectangle r2 = new Rectangle(len, br);
        System.out.println("Area using parameterized constructor: " + r2.area());
    }
}
