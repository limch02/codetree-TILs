import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0;i<a;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if (map.containsKey(n)) {
                if (s == 1) {
                    if (map.get(n) == 0) {
                        cnt++;
                        map.put(n, s);
                    }
                } else {
                    if (map.get(n) == 1) {
                        cnt++;
                        map.put(n, s);
                    }
                }
            }else {
                map.put(n,s);
            }
        }
        System.out.println(cnt);
    }

}