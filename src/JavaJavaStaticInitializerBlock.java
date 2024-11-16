import java.util.Scanner;

public class JavaJavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double B=scanner.nextDouble();
        double H=scanner.nextDouble();
        if (B<=0 || H<=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(B*H);
        }
        scanner.close();
    }
}
