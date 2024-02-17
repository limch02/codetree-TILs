import java.util.*;
import java.io.*;

public class Main {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            String k = s.nextToken();
            map.put(k, i+1);
        }

        Set<String> keySet = map.keySet(); // 키셋을 한 번만 가져옴
        for (int i = 0; i < b; i++) {
            String t = br.readLine();
            if (isNumeric(t)) {
                int targetValue = Integer.parseInt(t);
                for (String key : keySet) { // 키셋을 반복하여 해당 값 찾음
                    if (map.get(key) == targetValue) {
                        System.out.println(key);
                        break; // 찾았으면 반복 종료
                    }
                }
            } else {
                System.out.println(map.get(t));
            }
        }
    }
}