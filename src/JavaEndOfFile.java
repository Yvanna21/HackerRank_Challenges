import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=0;
        while (scanner.hasNext()) {
            String data=scanner.nextLine();
            i++;
            System.out.println(i+" "+data);
        }
        scanner.close();
    }
}
