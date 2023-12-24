import java.util.*;
import java.io.*;

public class Main {
    public static void abs(int n){
        System.out.print(Math.abs(n)+" ");
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            abs(Integer.parseInt(st.nextToken()));
        }
    }
}