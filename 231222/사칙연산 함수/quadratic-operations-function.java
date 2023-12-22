import java.util.*;
import java.io.*;

public class Main {
    public static void num(int n,String s ,int m){
        if (s.equals("*")){
            System.out.println(n+" "+s+" "+m+" = "+(n*m));
        } else if (s.equals("/")) {
            System.out.println(n+" "+s+" "+m+" = "+(n/m));
        } else if (s.equals("+")) {
            System.out.println(n+" "+s+" "+m+" = "+(n+m));
        } else if (s.equals("-")) {
            System.out.println(n+" "+s+" "+m+" = "+(n-m));
        }else {
            System.out.println("False");
        }

    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        num(a,s,b);
    }
}