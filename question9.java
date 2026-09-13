/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 9
*/
// Importing a scanner
import java.util.Scanner;
public class question9 {
    public static void main (String[] args) {
        // Creating a scanner
        Scanner console = new Scanner (System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        // Reading the user's number
        int number = console.nextInt();
        console.close();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    
}
