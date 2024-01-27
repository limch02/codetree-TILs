import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read input sizes
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        // Read sequences A and B
        int[] arr1 = new int[n];
        int[] arr2 = new int[q];

        StringTokenizer s1 = new StringTokenizer(br.readLine());
        StringTokenizer s2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(s1.nextToken());
        }

        for (int i = 0; i < q; i++) {
            arr2[i] = Integer.parseInt(s2.nextToken());
        }

        // Check if B is a subsequence of A
        boolean isSubsequence = checkSubsequence(arr1, arr2);

        // Output the result
        if (isSubsequence) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean checkSubsequence(int[] arr1, int[] arr2) {
        // Iterate through A to find the starting point of a potential subsequence
        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            boolean isMatch = true;

            // Check if the current position in A forms a subsequence with B
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i + j] != arr2[j]) {
                    isMatch = false;
                    break;
                }
            }

            // If a match is found, return true
            if (isMatch) {
                return true;
            }
        }

        // No matching subsequence found
        return false;
    }
}