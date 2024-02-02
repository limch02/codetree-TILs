import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[]arr = {"apple", "banana", "grape", "blueberry", "orange"};
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0 ; i<arr.length;i++){
            String k = arr[i];
            if (s.equals(String.valueOf(k.charAt(2)))||s.equals(String.valueOf(k.charAt(3)))){
                sb.append(k).append("\n");
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}