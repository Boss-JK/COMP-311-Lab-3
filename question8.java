/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 8
*/
// Importing a scanner
import java.util.Scanner;
public class question8 {
    public static void main (String[] args) {
        // Creating a scanner
        Scanner console = new Scanner (System.in);

        // Ask the user to enter a word or sentence
        System.out.print("Enter a word or sentence: ");
        String word = console.nextLine().toLowerCase();
        console.close();
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                count ++;
            }
        }
        System.out.println("The number of vowels is " + count);
    }
    
}
