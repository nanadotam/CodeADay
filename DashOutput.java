public class DashOutput {
    public static void main(String[] args) {
        // This program outputs a bunch of dashes using arrays
        
        /* Expected Output:
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -                                                                                            
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -                                                                                           
        - - - - - - - - - -  
         */
        printDash();
    }

    private static void printDash() {
        // Create a 2D array called "dash" containing the character '-'.
        char[][] dash = new char[10][10];  

        for (int i = 0; i < dash.length; i++) {     // Lopp through each row of the 2D array
            for (int j = 0; j < dash[i].length; j++) {      // Loop through each element of the 2D array
                dash[i][j] = '-';   // Assign dash character to element in array
                System.out.print(dash[i][j] + " "); // Print dash followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
        

}
}


