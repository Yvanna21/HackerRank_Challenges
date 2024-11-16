import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavJavaCurrencyFormatter {

    //Compiler: JAVA 8

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double amount=scanner.nextDouble();

        //Format for US
        String us= NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        //Format for India
        String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(amount);
        //Format for China
        String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);
        //Format for France
        String france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);

        //Print devices
        System.out.println("US: "+us);
        System.out.println("India: "+india);
        System.out.println("China: "+china);
        System.out.println("France: "+france);

        scanner.close();
    }
}
