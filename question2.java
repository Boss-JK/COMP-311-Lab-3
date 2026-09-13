/*
* Student Name: Bosa Jeremiah
* Student ID: 24019732
* Question 2
*/
// Importing a scanner
import java.util.Scanner;
public class question2 {
    public static void main (String[] args){
        // Creating a scanner
        Scanner console = new Scanner(System.in);

        // Ask the user to enter a positive number
        System.out.print("Enter a positive number: ");
        // Reading the user's number
        int number = console.nextInt();
        console.close();

        if (number > 0) {
            int i = 0;
            int sum = 0;
            while (i <= number){
                sum += i;
                i++;
            }
            System.out.println("The sum is: " + sum);
        } else {
            System.out.println("Invalid Number!!");
        }

    }
    
}
