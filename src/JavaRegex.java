import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class JavaRegex {
    // Regular expression pattern for validating an IP address

    // Explanation of the regex pattern:
    // ^ asserts the start of the string.
    // (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?) is a capturing group that matches a
    // number from 0 to 255.
    // 25[0-5] matches numbers from 250 to 255.
    // 2[0-4][0-9] matches numbers from 200 to 249.
    // [01]?[0-9][0-9]? matches numbers from 0 to 199 allowing leading zeros.
    // \. matches the dot separator.
    // The IP address is divided into four identical segments using this pattern.
    // $ asserts the end of the string.
    private static final String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new JavaRegex().pattern));
        }

        in.close();
    }

    // method to validate the ip address
    // public static boolean validateIP(String ip) {
    // Computing the regular expression
    // Pattern p = Pattern.compile(pattern);
    //
    // Matcher m = p.matcher(ip);
    // Returning true if the IP address matches the pattern, false otherwise
    // return m.matches();

    // }
}
