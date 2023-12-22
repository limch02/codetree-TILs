import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i =1 ;i<=a;i++){
            sum+=i;
        }
        sb.append(sum/10);
        System.out.println(sb);
    }
}