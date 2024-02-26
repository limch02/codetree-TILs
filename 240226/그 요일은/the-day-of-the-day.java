import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static int numOfDays(int m, int d) {
        // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다.
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];

        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += d;

        return totalDays;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        // 변수 선언 및 입력
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        // 두 날짜간의 차이가 몇 일인지를 구합니다.
        int diff = numOfDays(m2, d2) - numOfDays(m1, d1)+1;

        int cnt =0;
        if (s.equals("Mon")){
            System.out.println(diff/7);
        } else if (s.equals("Tue")) {
            System.out.println((diff+6)/7);
        }else if (s.equals("Wed")) {
            System.out.println((diff+5)/7);
        }else if (s.equals("Thu")) {
            System.out.println((diff+4)/7);
        }else if (s.equals("Fri")) {
            System.out.println((diff+3)/7);
        }else if (s.equals("Sat")) {
            System.out.println((diff+2)/7);
        }else {
            System.out.println((diff+1)/7);
        }

    }
}