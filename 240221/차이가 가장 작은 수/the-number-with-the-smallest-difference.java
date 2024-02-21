import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int [] arr = new int[a];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i =0;i<a;i++){
            for (int j =i+1;j<a;j++){
                int k = (int)Math.abs(arr[j]-arr[i]);
                if (k>=b){
                    set.add(k);
                }
            }
        }
        if (set.isEmpty()){
            System.out.println(-1);
        }else {
            System.out.println(set.first());
        }
    }
}