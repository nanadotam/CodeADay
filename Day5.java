/*
*Search Program*
This program returns a Boolean value TRUE or FALSE
when a given word is found in an input string.
 */

import java.util.*;

public class Day5 {
    // Declaring inputString as a class level variable
    private static String inputString;
    private static String word;
    public static void main(String[] args) {
        System.out.println("What word are you serching for? Let's look it up!");
        searchFunctionality();
        advancedSearchFunctionality();
    }

    // Simple search program functionality
    public static void searchFunctionality() {
        // Initialize scanner object
        Scanner scanner  = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter the input string: ");
        inputString = scanner.nextLine(); 

        // Get the word from the user
        System.out.print("Enter the word you're looking for: ");
        word = scanner.next(); 

        // Searching for word
        boolean stringContains = inputString.contains(word);

        // Displaying results
        System.out.println("Word in text? " + stringContains);

        // Clsoing the scanner object
        scanner.close();
    }


    // Advanced search functionality with word count
    public static void advancedSearchFunctionality() {
        // Using input text from searchFunctionality method
        String temp[] = inputString.split(" ");

        int wordOccurences = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
            wordOccurences++;
        }

        System.out.println("The word " + word + " occurs " + wordOccurences + " times in the above string.");
    }

}

