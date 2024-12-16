import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
        // System.out.println("Enter a string containing English alphabetic letters, spaces, and specified characters (!,?._'@): ");
        input = scanner.nextLine();
        } while (!input.matches("[A-Za-z !,?._'@]+"));

        String[] tokens = input.split("[^A-Za-z]+");

        int tokenCount=0  ;  
        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenCount++;
            }
        }
        System.out.println(tokenCount);
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        scanner.close();
    }

    
}