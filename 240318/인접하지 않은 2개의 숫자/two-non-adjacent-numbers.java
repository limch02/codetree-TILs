import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int [a];
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int sum =0;
        for (int i =0;i<a-1;i++){
            for (int j =i+2;j<a;j++){
                sum = arr[i] + arr[j];
                max = Math.max(sum,max);
                sum=0;
            }
        }
        System.out.println(max);
    }
}