import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input a number
        System.out.print("Input a number: ");
        int n = in.nextInt();
        
        // Check if the number is even and print the result
        if (n % 2 == 0) {
            System.out.println("Even"); // the number is even
        } else {
            System.out.println("Odd"); // the number is odd
        }
    }
}
