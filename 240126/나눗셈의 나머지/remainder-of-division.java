import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int [] arr = new int[b];
        while (true){
            arr[a%b]++;
            a /= b;
            if (a==0){
                break;
            }
        }
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum += (int) Math.pow(arr[i],2);
        }
        System.out.println(sum);
    }
}