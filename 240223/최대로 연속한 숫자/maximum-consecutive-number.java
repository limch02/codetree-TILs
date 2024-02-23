import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean[] sequence = new boolean[a + 1]; // 숫자가 수열에 속하는지 여부를 저장할 배열

        for (int i = 0; i <= a; i++) {
            sequence[i] = true; // 모든 숫자를 수열에 포함된 것으로 초기화
        }

        StringTokenizer s = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            int removed = Integer.parseInt(s.nextToken());
            sequence[removed] = false;
            int max = 0;
            int current = 0;
            for (int j = 0; j <= a; j++) {
                if (sequence[j]) {
                    current++;
                } else {
                    current = 0;
                }
                max = Math.max(max, current);
            }
            System.out.println(max);
        }
    }
}