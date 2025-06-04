import java.util.*;

public class MaximumSubarraySum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int currsum = arr[0];
            int maxsum = arr[0];

            for (int k = 1; k < arr.length; k++) {
                currsum = Math.max(arr[k], currsum + arr[k]);
                maxsum = Math.max(currsum, maxsum);
            }

            System.out.println(maxsum);
        }
    }
}

