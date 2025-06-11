import java.util.*;

public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int n = s.length();

        while (i < n) {
            String result = "";
            result += s.charAt(i);
            i++;

            while (i < n && Character.isLowerCase(s.charAt(i))) {
                result += s.charAt(i);
                i++;
            }

            System.out.println(result);
        }
    }
}
