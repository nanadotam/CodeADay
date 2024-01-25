/* 
Write a Java program that takes a year from the user and prints whether it is a leap year or not.
 */

// Importing the Scanner class to take input from the user
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        // Prompting the user to enter the year
        System.out.print("Input the year: ");
        // Reading the user's input and storing it in the 'year' variable
        int year = input.nextInt();

        // Computing logic using help from flowchart
        boolean x = (year % 4 == 0);            // Checking if the year is divisible by 4
        boolean y = (year % 100 != 0);          // Checking if the year is not divisible by 100          
        boolean z = ((year % 100 == 0) && (year % 400 == 0));           // Checking if the year is divisible by 100 and also divisible by 400

        // Checking the conditions for a leap year
        // If Divisible by 4 and not divisible by 100 or divisible by 100 and 400 then a leap year 
        if ((x & y) || (y && z)){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        input.close();
    }
}
