import java.util.Scanner;

public class JavaInttoString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n<=100 && n>= -100) {
            String s=Integer.toString(n);

            if (s instanceof String) {
                System.out.println("Good job");
            }else{
                System.out.println("Wrong answer");
            }
        }
        scanner.close();
        
    }
    
}