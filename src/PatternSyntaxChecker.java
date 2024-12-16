import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            int testCases=Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < testCases; i++) {
                String pattern=scanner.nextLine();
                try{
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                }catch(PatternSyntaxException e){
                    System.out.println("Invalid");
                }
            }
        }
    }
    
}