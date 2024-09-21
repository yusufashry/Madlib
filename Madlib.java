import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();
        
        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();
        
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        
        System.out.print("Enter a past-tense verb: ");
        String verb = input.nextLine();

        System.out.println("\nHere's your Mad Lib:");
        System.out.println("Mary had a little " + noun1 + ".");
        System.out.println("Its " + noun2 + " was " + adjective + " as snow.");
        System.out.println("And everywhere that Mary " + verb + ".");
        System.out.println("The " + noun1 + " was sure to go.");

        input.close();
    }
}
