import java.util.Scanner;

public class JavaStdinandStdoutII {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int intVal=scanner.nextInt();
        Double doubleVal=scanner.nextDouble();
        scanner.nextLine();
        String stringVal=scanner.nextLine();
        
        System.out.println("String: "+stringVal);
        System.out.println("Double: "+doubleVal);
        System.out.println("Int: "+intVal);
        
        scanner.close();
   }
}
