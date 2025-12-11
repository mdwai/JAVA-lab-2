 //Aim of the program : Accept 10 numbers from command line and check how many of them are even and how many are odd.
 //Input: Enter 10 number from keyboard
//Output:  Display number of even and odd number
 import java.util.Scanner;
 public class EvenOdd
 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int evenCount = 0;
         int oddCount = 0;
         System.out.println("Enter 10 numbers:");
         for(int i = 1; i <= 10; ++i) {
             System.out.print("Number " + i + ": ");
             int num = sc.nextInt();
             if (num % 2 == 0) {
                 ++evenCount;
             } else {
                 ++oddCount;
             }
         }
         System.out.println("\nTotal Even Numbers: " + evenCount);
         System.out.println("Total Odd Numbers: " + oddCount);
     }
 }