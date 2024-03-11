import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] pos = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int prev = 0;
            for (int j = 0; j < N - 1; j++) {
                if (j == i) {
                    continue;
                }
                sum += Math.abs(pos[prev][0] - pos[j + 1][0]) + Math.abs(pos[prev][1] - pos[j + 1][1]);
                prev = j + 1;
            }
            answer = Math.min(answer, sum);
        }
        bw.write(String.valueOf(answer));

        br.close();
        bw.flush();
        bw.close();
    }
}