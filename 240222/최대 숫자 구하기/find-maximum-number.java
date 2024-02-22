import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i=1;i<=b;i++){
            set.add(i);
        }
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        for (int i = 0;i<a;i++){
            set.remove(arr[i]);
            System.out.println(set.last());
        }
    }
}