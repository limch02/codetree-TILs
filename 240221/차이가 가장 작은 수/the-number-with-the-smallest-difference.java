import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        ArrayList<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < a - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff >= b) {
                diffs.add(diff);
            }
        }
        Collections.sort(diffs);

        if (diffs.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(diffs.get(0));
        }
    }
}