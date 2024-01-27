import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int [] arr = new int[a];
        int max =Integer.MAX_VALUE;
        int cnt =0;
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            arr[i]=b;
            if (b<max){
                max = b;
            }
        }
        for (int i =0;i<a;i++){
            if (arr[i]==max){
                cnt++;
            }
        }
        System.out.println(max+" "+cnt);
    }
}