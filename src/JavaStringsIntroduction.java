import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum= A.length()+B.length();
        System.out.println(sum);
        String result=(A.compareTo(B)>0) ? "Yes": "No";
        System.out.println(result);
        A=A.substring(0, 1).toUpperCase()+A.substring(1);
        B=B.substring(0, 1).toUpperCase()+B.substring(1);
        System.out.println(A+ " "+B);
        sc.close();

    }
}
