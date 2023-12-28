import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[]arr = new int[a];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        System.out.println(arr[b-1]);
    }
}