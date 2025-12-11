//Aim of the program : Write a program to overload subtract method with various parameters in a class in Java. Write the driver class to use the different subtract methods using object. Input: Mention various subtract method having different parameters. Output: Subtract
//method will display the result accordingly
class Subtractor
{
    // subtract two integers
    void subtract(int a, int b)
    {
        System.out.println("Subtracting two integers: " + (a - b));
    }
    // subtract three integers
    void subtract(int a, int b, int c)
    {
        System.out.println("Subtracting three integers: " + (a - b - c));
    }
    // subtract two double values
    void subtract(double a, double b)
    {
        System.out.println("Subtracting two doubles: " + (a - b));
    }
    // subtract an integer from a double
    void subtract(double a, int b)
    {
        System.out.println("Subtracting int from double: " + (a - b));
    }
    // subtract a double from an integer
    void subtract(int a, double b)
    {
        System.out.println("Subtracting double from int: " + (a - b));
    }
}
