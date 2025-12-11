//Aim of the program :  Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.
//Input:Enter Roll No, Name and cgpa of &lsquo;n&rsquo; number of students.
import java.util.*;
class Student
{
    int roll;
    String name;
    double cgpa;
    Student(int r, String n, double c) {
        roll = r;
        name = n;
        cgpa = c;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter roll: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();
            sc.nextLine();
            s[i] = new Student(roll, name, cgpa);
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll: " + s[i].roll + ", Name: " + s[i].name + ", CGPA: " + s[i].cgpa);
        }
        double min = s[0].cgpa;
        String minName = s[0].name;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < min) {
                min = s[i].cgpa;
                minName = s[i].name;
            }
        }
        System.out.println("\nStudent with lowest CGPA: " + minName);
    }
}