import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringTokenizer s= new StringTokenizer(br.readLine());
        int arr [] = new int[a];
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i =0;i<a;i++){
            System.out.print(arr[arr.length-1-i]+" ");
        }
    }
}