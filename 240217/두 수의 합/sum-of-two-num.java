import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s.nextToken());
        }
        
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i]; // 현재 값에 대한 보수 계산
            if (set.contains(complement)) { // 보수가 이미 set에 있다면 쌍을 찾은 것
                count++;
            }
            set.add(arr[i]); // 현재 값을 set에 추가
        }
        
        System.out.println(count);
    }
}