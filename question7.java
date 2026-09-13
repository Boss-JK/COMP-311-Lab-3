/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 7
*/
// Importing a scanner
import java.util.Scanner;
public class question7 {
    public static void main (String[] args) {
        // Creating a scanner
        Scanner console = new Scanner (System.in);
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        // Reading the user's number
        int number = console.nextInt();
        console.close();
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}