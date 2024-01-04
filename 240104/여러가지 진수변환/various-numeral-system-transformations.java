import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int[] digits = new int[20];
        int cnt = 0;

        while (true) {
            if(n < a) {
                digits[cnt++] = n;
                break;
            }

            digits[cnt++] = n % a;
            n /= a;
        }

        // print binary number
        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}