import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isLeapYear(int n) {
        return (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 각 달의 일수
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (a >= 1 && a <= 12 && b >= 1 && b <= daysInMonth[a]) {
            if (a == 2 && isLeapYear(y)) {
                if (b <= 29) {
                    System.out.println("Winter");
                } else {
                    System.out.println("-1");
                }
            } else {
                if (a >= 3 && a <= 5) {
                    System.out.println("Spring");
                } else if (a >= 6 && a <= 8) {
                    System.out.println("Summer");
                } else if (a >= 9 && a <= 11) {
                    System.out.println("Fall");
                } else {
                    System.out.println("Winter");
                }
            }
        } else {
            System.out.println("-1");
        }
    }
}