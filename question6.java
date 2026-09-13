/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 6
*/
// Importing a scanner
import java.util.Scanner;
public class question6 {
    public static void main (String[] args) {
        // Creating a scanner
        Scanner console = new Scanner (System.in);

        int sum = 0;
        int number;
        do {
            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            // Reading the user's number
            number = console.nextInt();
            // Adding the number to the sum
            sum = sum + number;
        } while (number != 0);
        console.close();

        // Displaying the sum
        System.out.println("Sum: " + sum);
    }
    
}
