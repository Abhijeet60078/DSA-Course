import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 1;


            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }

            result.append(ch);


            if (count > 1) {
                result.append(count);
            }

            i++;
        }

        System.out.println(result.toString());
    }
}
