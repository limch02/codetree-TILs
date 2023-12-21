import java.util.*;
public class Main {
    public static int findGcd(int n, int m) {
        int gcd = 0;
        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0)
                gcd = i;
        }

        return gcd;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = findGcd(a, b);
        System.out.println((a * b) / m);
    }
}