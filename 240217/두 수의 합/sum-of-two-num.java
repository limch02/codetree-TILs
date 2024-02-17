import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int [] arr =new int[a];
        int cnt = 0;
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i = 0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        for (int i =0;i<a;i++){
            for (int j =i+1;j<a;j++){
                if (arr[i]+arr[j]==b){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}