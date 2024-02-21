import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> ans = new TreeSet<>();
        int [] arr = new int[a];
        for (int i =0;i<a;i++){
            int k = Integer.parseInt(br.readLine());
            arr[i] = k;
            set.add(k);
        }
        for (int i =0;i<a;i++){
            if (arr[i]<0){
                int c = Math.abs(b + arr[i]-1);
                if (set.ceiling(c) != null) {
                    ans.add(Math.abs(set.ceiling(c) - arr[i]));
                }
            }else {
                int c = Math.abs(b + arr[i]);
                if (set.ceiling(c) != null) {
                    ans.add(Math.abs(set.ceiling(c) - arr[i]));
                }
            }
        }
        if (ans.isEmpty()){
            System.out.println(-1);
        }else {
            System.out.println(ans.first());
        }
    }
}