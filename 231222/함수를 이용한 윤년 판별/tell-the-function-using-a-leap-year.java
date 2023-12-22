import java.util.*;
import java.io.*;

public class Main {
    public static void num(int n){
        if (n%4==0&&n%100==0&&n%400==0){
            System.out.println("true");
        } else if (n%4==0&&n%100==0) {
            System.out.println("false");
        } else if (n%4==0) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        num(a);
    }
}