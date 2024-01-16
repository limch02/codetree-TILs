import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int k = 0;

        int originalA = a;  // 입력값을 보존하기 위한 변수

        for (int i = 1; i <= originalA; i++) {
            a = a / i;

            if (a <= 1) {
                k = i;
                break;
            }
        }

        System.out.print(k);
    }
}