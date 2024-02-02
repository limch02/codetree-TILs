import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int sum =0;
        for (int i = 0;i<arr.length;i++){
            String s = arr[i];
            sum += s.length();
        }
        sb.append(sum);
        System.out.println(sb);
    }
}