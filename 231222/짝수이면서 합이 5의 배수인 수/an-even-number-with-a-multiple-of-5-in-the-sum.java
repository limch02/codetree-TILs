import java.util.*;
import java.io.*;

public class Main {
    public static void num(int n){
        String s = String.valueOf(n);
        int k = s.charAt(0);
        int l = s.charAt(1);
        if (n%2==0){
            if ((k-48+l-48)%5==0){
                System.out.println("Yes");
            }else {
                System.out.println("NO");
            }
        }else {
            System.out.print("No");
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        num(a);
    }
}