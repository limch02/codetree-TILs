import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] digits = new int[20];
        int cnt = 0;

        while (true) {
            if(n < 2) {
                digits[cnt++] = n;
                break;
            }

            digits[cnt++] = n % 2;
            n /= 2;
        }

        // print binary number
        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}