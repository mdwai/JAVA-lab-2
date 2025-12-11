//Aim of the program :  Write a program in Java to create a class Rectangle having data members length and breadth and three methods called read, calculate and display to read the values of length and breadth,  calculate the area and perimeter of the rectangle and display the result   respectively.
//Input:Mention length and breadth
import java.util.Scanner;
class Rectangle2
{
    int length, breadth;
    int area, perimeter;
    // Method to read length and breadth
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }
    // Method to calculate area and perimeter
    void calculate()
    {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }
    // Method to display results
    void display()
    {
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
public class Rectangle2
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(); // Create object
        r.read();      // Read input
        r.calculate(); // Calculate area & perimeter
        r.display();   // Display result
    }
}
