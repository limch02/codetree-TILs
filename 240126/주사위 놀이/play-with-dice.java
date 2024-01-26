import java.io.*;
import java.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int[6];
        for (int i = 0 ; i<10;i++){
            int b= Integer.parseInt(st.nextToken());
            arr[b-1]++;
        }
        for (int i = 0 ;i<6;i++){
            System.out.println((i+1)+" - "+arr[i]);
        }
    }
}