import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int [] arr =new int[10];
        arr[0] = a;
        arr[1] = b;
        for (int i =2;i<10;i++){
            arr[i] = (arr[i-1]+arr[i-2])%10;
        }
        for (int i =0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}