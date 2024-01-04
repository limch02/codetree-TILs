import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        String k = br.readLine();
        br.close();

        int sum = 0;
        int[] digits = new int[20];
        int cnt = 0;

        for (int i = 0; i < k.length(); i++) {
            int b = Character.getNumericValue(k.charAt(i));
            int e = (int) Math.pow(n, k.length() - 1 - i);
            sum += e * b;
        }

        while (sum >= a) {
            digits[cnt++] = sum % a;
            sum /= a;
        }
        digits[cnt++] = sum; // 마지막 자리 처리

        // print result
        StringBuilder result = new StringBuilder();
        for (int i = cnt - 1; i >= 0; i--)
            result.append(digits[i]);

        System.out.println(result);
    }
}