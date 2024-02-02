import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s []= br.readLine().split(" ");
        for (int i = 0;i<s.length;i++){
            sb.append(s[s.length-i-1]).append("\n");
        }
        System.out.println(sb);
    }
}