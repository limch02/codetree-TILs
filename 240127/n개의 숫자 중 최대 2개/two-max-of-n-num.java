import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int arr [] = new int[a];
        for (int i =0;i<a;i++){
            int b =Integer.parseInt(st.nextToken());
            arr[i] = b;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]);
    }
}