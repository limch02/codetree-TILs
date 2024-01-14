import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a>b){
            for (int i =  a;i>=b;i--){
                System.out.print(i+" ");
            }
        }else if (a<b){
            for (int i = b;i>a;i--){
                System.out.print(i+" ");
            }
        }else{
            System.out.print(a);
        }
    }
}