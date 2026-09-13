/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 4
*/

// Importing a scanner
import java.util.Scanner;
public class question4 {
    public static void main (String[] args) {
    // Creating a scanner
    Scanner console = new Scanner (System.in);

    int number;

    do{   
        System.out.println("1. Continue");
        System.out.println("2. Exit");
        // Ask the user to enter 1 or 2
        System.out.print("Enter one or two: ");
        // Reading the user's input
        number = console.nextInt();
        if ((number != 1) && (number != 2)){
            System.out.println("Invalid input!!");
        }
    } while (number != 2);
           console.close();
    }
}
