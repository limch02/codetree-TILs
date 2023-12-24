import java.util.*;
import java.io.*;

public class Main {
    public static void count(String s){
        int count = 0;
        int arr [] = new int[26];
        for (int i =0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }
        for (int i=0;i<26;i++){
            if (arr[i]!=0){
                count++;
            }
        }
        if (count>=2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        count(s);
    }
}