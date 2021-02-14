package NumberFactsAPI;

//Import the Scanner object.
import java.util.Scanner;

public class NumberFactsTester {

    public static void main(String[] args) {
        //Prompt user for input and assign the input to num.
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number to receive a fact about it: ");
        int num = kb.nextInt();
        //Generate number-specific fact and random fact.
        NumberFactsAPI.getNumberFact(num);
        System.out.print("Random number fact: ");
        NumberFactsAPI.getNumberFact();
    }
}
