import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Read the number of inputs
        int T = scanner.nextInt();
        scanner.nextLine();
        //
        while (T-- > 0) {
            //Read the number of cases 
            try{
                long n=scanner.nextLong(); //read the test case 
                System.out.println(n+" can be fitted in:");
                if (n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) {
                    System.out.println("* int");
                } 
                if (n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                
            } catch (InputMismatchException e) {
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }

        }
    scanner.close();

    }
}
