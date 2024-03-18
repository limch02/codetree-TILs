import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int [] arr =new int[a];
        int min = Integer.MAX_VALUE;
        int sum =0;
        StringTokenizer num = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            int c = Integer.parseInt(num.nextToken());
            arr[i] = c;
            sum += c;
        }

        for (int i =0;i<a;i++){
            for (int j=i+1;j<a;j++){
                int sum1 = sum;
                sum1 -= arr[i];
                sum1 -= arr[j];
                min = Math.min(sum1-b,min);
            }
        }
        System.out.println(min);
    }
}