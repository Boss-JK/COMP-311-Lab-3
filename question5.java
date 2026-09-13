/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 5
*/
// Importing the scanner
import java.util.Scanner;
public class question5 {
    public static void main (String[] args) {
        // Creating a scanner
        Scanner console = new Scanner (System.in);

        int number;
        do{
            // Ask user to enter a number between 1 and 10
            System.out.print("Enter a number between 1 and 10: ");
            // Reading the user's number
            number = console.nextInt();
        } while (number != 0 && number != 11);
        console.close();
    }
    
}
