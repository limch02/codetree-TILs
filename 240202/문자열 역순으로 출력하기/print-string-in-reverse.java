import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[]arr = new String[4];
        for (int i = 0 ; i<arr.length;i++){
            String s = br.readLine();
            arr[i] = s;
        }
        for (int i = 3 ; i>=0;i--){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}