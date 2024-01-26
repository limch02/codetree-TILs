import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int[9];
        for (int i = 0 ; i<a;i++){
            int b= Integer.parseInt(st.nextToken());
            arr[b-1] = 1;
        }
        for (int i = 0 ;i<9;i++){
            System.out.println(arr[i]);
        }
    }
}