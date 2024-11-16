import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        double puissance;
        while (q > 0 && q <= 500) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum=a;
            
            for (int i = 0; i < n; i++) {
                puissance = Math.pow(2, i);
                sum +=  puissance* b;
                System.out.print(sum+" ");
            }
            q--;
            System.out.println(" ");
            
        }
        scanner.close();
    }
}
