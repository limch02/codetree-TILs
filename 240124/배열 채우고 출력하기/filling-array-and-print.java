import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String arr [] = new String[10];
        for (int i =0;i<10;i++){
            String s = st.nextToken();
            arr[i] = s;
        }
        for (int i = 9;i>=0;i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}