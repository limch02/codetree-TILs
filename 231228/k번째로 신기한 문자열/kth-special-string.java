import java.util.*;
import java.io.*;
public class Main {
    static int n, k;
    static String T;
    static String[] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        T = st.nextToken();

        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);

        A: for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < T.length(); j++) {
                if (T.length() > arr[i].length()) continue A;

                if (arr[i].charAt(j) == T.charAt(j)) {
                    cnt++;
                }

                if (cnt == T.length()) {
                    k--;
                }

                if (k == 0) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
}