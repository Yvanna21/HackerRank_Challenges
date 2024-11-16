import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIf_Else {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine().trim());

        if (1<=N && N<=100) {
            if (N%2!=0) {
                System.out.println("weird");
            }else if ((N>=2 && N<=5) || N>20 ) {
                System.out.println("Not Weird");
            } else if (N>=6 && N<=20) {
                System.out.println("weird");
                
            }    
        } 


        bufferedReader.close();
    }
    
}